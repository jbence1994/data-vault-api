package hu.datavault.repository

import hu.datavault.model.Profile
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
class ProfileRepository {

    fun getProfiles(): List<Profile> {
        return listOf(
            Profile(
                id = UUID.randomUUID().toString(),
                firstName = "John",
                middleName = null,
                lastName = "Doe",
                gender = 1,
                phone = null,
                email = null,
                photo = null,
            ),
        )
    }

    fun createProfile(newProfile: Profile): Profile {
        return Profile(
            id = newProfile.id,
            firstName = newProfile.firstName,
            middleName = newProfile.middleName,
            lastName = newProfile.lastName,
            gender = newProfile.gender,
            photo = newProfile.photo,
            email = newProfile.email,
            phone = newProfile.phone
        )
    }
}
