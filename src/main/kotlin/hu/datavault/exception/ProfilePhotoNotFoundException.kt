package hu.datavault.exception

class ProfilePhotoNotFoundException(
    fileName: String,
) : NotFoundException("Profile photo not found with the following file name: $fileName.")
