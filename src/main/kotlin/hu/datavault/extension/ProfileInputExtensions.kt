package hu.datavault.extension

import hu.datavault.model.Profile
import hu.datavault.model.ProfileInput
import java.util.UUID

fun ProfileInput.toProfile(): Profile {
    return Profile(
        id = UUID.randomUUID().toString(),
        firstName = this.firstName,
        middleName = this.middleName,
        lastName = this.lastName,
        gender = this.gender,
        phone = this.phone,
        email = this.email,
        photo = this.photo,
    )
}
