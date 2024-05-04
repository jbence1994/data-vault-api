package hu.datavault.exception

class ProfileNotFoundException(
    id: String,
) : NotFoundException("Profile not found with the following id: $id.")
