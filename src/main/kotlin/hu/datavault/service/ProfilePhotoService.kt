package hu.datavault.service

import hu.datavault.constant.FileConstants.PROFILES_SUBDIRECTORY_NAME
import hu.datavault.exception.ProfileAlreadyHasPhotoUploadedException
import hu.datavault.exception.ProfilePhotoNotFoundException
import hu.datavault.util.FileUtils
import hu.datavault.util.FileValidator
import org.springframework.stereotype.Service
import org.springframework.web.multipart.MultipartFile

@Service
class ProfilePhotoService(
    private val profileService: ProfileService,
    private val fileUtils: FileUtils,
    private val fileValidator: FileValidator,
) {

    fun getProfilePhoto(fileName: String): ByteArray {
        val profilePhoto: ByteArray

        try {
            profilePhoto = fileUtils.readAllBytes(PROFILES_SUBDIRECTORY_NAME, fileName)
        } catch (exception: Exception) {
            throw ProfilePhotoNotFoundException(fileName)
        }

        return profilePhoto
    }

    fun uploadProfilePhoto(profileId: String, file: MultipartFile): String? {
        fileValidator.validate(file)

        val profile = profileService.getProfile(profileId)
        if (profile.photo != null) {
            throw ProfileAlreadyHasPhotoUploadedException(profileId)
        }

        val directoryStructurePath = fileUtils.createPhotoUploadsDirectoryStructure(PROFILES_SUBDIRECTORY_NAME)
        profile.photo = fileUtils.storePhoto(file, directoryStructurePath)
        profileService.updateProfile(profile)

        return profile.photo
    }
}
