package hu.datavault.controller

import hu.datavault.constant.FileConstants.IMAGE
import hu.datavault.exception.NotFoundException
import hu.datavault.extension.getExtension
import hu.datavault.service.ProfilePhotoService
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.multipart.MultipartFile

@RestController
@CrossOrigin
@RequestMapping(path = ["/api/photos/profile"])
class ProfilePhotoController(private val profilePhotoService: ProfilePhotoService) {

    @GetMapping(path = ["/retrieve/{fileName}"])
    fun getProfilePhoto(@PathVariable fileName: String): ResponseEntity<*> {
        try {
            val photo = profilePhotoService.getProfilePhoto(fileName)

            val headers = HttpHeaders()
            headers.contentType = MediaType.parseMediaType("$IMAGE/${fileName.getExtension()}")

            return ResponseEntity(photo, headers, HttpStatus.OK)
        } catch (exception: NotFoundException) {
            return ResponseEntity(exception.message, HttpStatus.NOT_FOUND)
        } catch (exception: Exception) {
            return ResponseEntity(exception.message, HttpStatus.BAD_REQUEST)
        }
    }

    @PostMapping(path = ["/upload/{profileId}"])
    fun createProfilePhoto(
        @PathVariable profileId: String,
        @RequestParam("file") file: MultipartFile,
    ): ResponseEntity<String> {
        try {
            val profilePhotoFileName = profilePhotoService.uploadProfilePhoto(profileId, file)

            return ResponseEntity(profilePhotoFileName, HttpStatus.OK)
        } catch (exception: NotFoundException) {
            return ResponseEntity(exception.message, HttpStatus.NOT_FOUND)
        } catch (exception: Exception) {
            return ResponseEntity(exception.message, HttpStatus.BAD_REQUEST)
        }
    }
}
