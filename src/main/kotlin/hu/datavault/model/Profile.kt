package hu.datavault.model

data class Profile(
    var id: String = "",
    var firstName: String = "",
    var middleName: String? = null,
    var lastName: String = "",
    var gender: Int = 0,
    var birthDate: String = "",
    var phone: String? = null,
    var email: String? = null,
    var photo: String? = null,
    var createdDateTime: String? = null,
)
