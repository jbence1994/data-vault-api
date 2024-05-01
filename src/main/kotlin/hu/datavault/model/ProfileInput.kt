package hu.datavault.model

data class ProfileInput(
    val firstName: String,
    val middleName: String?,
    val lastName: String,
    val gender: Int,
    val phone: String?,
    val email: String?,
    val photo: String?,
)
