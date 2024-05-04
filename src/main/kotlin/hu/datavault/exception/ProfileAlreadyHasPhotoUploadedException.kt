package hu.datavault.exception

class ProfileAlreadyHasPhotoUploadedException(
    id: String,
) : Exception("Profile with id: $id already has photo uploaded.")
