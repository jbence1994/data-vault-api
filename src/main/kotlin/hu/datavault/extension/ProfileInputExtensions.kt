package hu.datavault.extension

import hu.datavault.constant.MiscellaneousConstants.NOT_AVAILABLE
import hu.datavault.model.Profile
import hu.datavault.model.ProfileInput

fun ProfileInput.toProfile(): Profile {
    return Profile(
        firstName = this.firstName,
        middleName = this.middleName ?: NOT_AVAILABLE,
        lastName = this.lastName,
        gender = this.gender,
        nationality = this.nationality ?: NOT_AVAILABLE,
        birthDate = this.birthDate ?: NOT_AVAILABLE,
        birthPlace = this.birthPlace ?: NOT_AVAILABLE,
        phone = this.phone ?: NOT_AVAILABLE,
        email = this.email ?: NOT_AVAILABLE,
    )
}
