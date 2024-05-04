package hu.datavault.util

import hu.datavault.config.FileExtensionsConfig
import hu.datavault.exception.EmptyFileException
import hu.datavault.exception.InvalidFileExtensionException
import hu.datavault.extension.getExtension
import org.springframework.stereotype.Component
import org.springframework.web.multipart.MultipartFile

@Component
class FileValidator(val fileExtensionsConfig: FileExtensionsConfig) {

    fun validate(file: MultipartFile) {
        if (file.isEmpty) {
            throw EmptyFileException(fileName = file.originalFilename)
        }

        val fileExtension = file.getExtension()

        if (fileExtensionsConfig.allowedExtensions.all { it != fileExtension }) {
            throw InvalidFileExtensionException(extension = fileExtension)
        }
    }
}
