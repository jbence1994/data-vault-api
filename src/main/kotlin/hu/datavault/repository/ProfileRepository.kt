package hu.datavault.repository

import hu.datavault.model.Profile
import org.springframework.stereotype.Repository
import java.time.LocalDate
import java.time.LocalDateTime
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
                birthDate = LocalDate.of(1994, 3, 27).toString(),
                phone = null,
                email = null,
                photo = null,
                createdDateTime = LocalDateTime.now().toString(),
            ),
        )
    }

    fun getProfile(id: String): Profile {
        return Profile(
            id = id,
            firstName = "John",
            middleName = null,
            lastName = "Doe",
            gender = 1,
            birthDate = LocalDate.of(1994, 3, 27).toString(),
            phone = null,
            email = null,
            photo = null,
            createdDateTime = LocalDateTime.now().toString(),
        )
    }

    fun createProfile(newProfile: Profile): Profile {
        return Profile(
            id = newProfile.id,
            firstName = newProfile.firstName,
            middleName = newProfile.middleName,
            lastName = newProfile.lastName,
            gender = newProfile.gender,
            birthDate = newProfile.birthDate,
            photo = newProfile.photo,
            email = newProfile.email,
            phone = newProfile.phone,
            createdDateTime = newProfile.createdDateTime,
        )
    }
}
