package hu.datavault.extension

import hu.datavault.constant.MiscellaneousConstants.NOT_AVAILABLE
import hu.datavault.model.Profile
import hu.datavault.model.ProfileInput

fun ProfileInput.toProfile(): Profile {
    val middleName = if (this.middleName.isNullOrEmpty()) NOT_AVAILABLE else this.middleName
    val nationality = if (this.nationality.isNullOrEmpty()) NOT_AVAILABLE else this.nationality
    val birthDate = if (this.birthDate.isNullOrEmpty()) NOT_AVAILABLE else this.birthDate
    val birthPlace = if (this.birthPlace.isNullOrEmpty()) NOT_AVAILABLE else this.birthPlace
    val phone = if (this.phone.isNullOrEmpty()) NOT_AVAILABLE else this.phone
    val email = if (this.email.isNullOrEmpty()) NOT_AVAILABLE else this.email

    return Profile(
        firstName = this.firstName,
        middleName = middleName,
        lastName = this.lastName,
        gender = this.gender,
        nationality = nationality,
        birthDate = birthDate,
        birthPlace = birthPlace,
        phone = phone,
        email = email,
    )
}
