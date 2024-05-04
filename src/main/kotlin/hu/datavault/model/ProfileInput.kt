package hu.datavault.model

data class ProfileInput(
    val firstName: String,
    val middleName: String?,
    val lastName: String,
    val gender: Int,
    val nationality: String?,
    val birthDate: String?,
    val birthPlace: String?,
    val phone: String?,
    val email: String?,
)
