package hu.datavault.extension

import hu.datavault.model.Profile
import hu.datavault.model.ProfileInput
import java.time.LocalDateTime
import java.util.UUID

fun ProfileInput.toProfile(): Profile {
    return Profile(
        id = UUID.randomUUID().toString(),
        firstName = this.firstName,
        middleName = this.middleName,
        lastName = this.lastName,
        gender = this.gender,
        birthDate = this.birthDate,
        phone = this.phone,
        email = this.email,
        photo = this.photo,
        createdDateTime = LocalDateTime.now().toString(),
    )
}
