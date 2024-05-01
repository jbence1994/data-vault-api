package hu.datavault.service

import hu.datavault.extension.toProfile
import hu.datavault.model.Profile
import hu.datavault.model.ProfileInput
import hu.datavault.repository.ProfileRepository
import org.springframework.stereotype.Service

@Service
class ProfileService(private val profileRepository: ProfileRepository) {

    fun getProfiles(): List<Profile> {
        return profileRepository.findAll()
    }

    fun getProfile(id: String): Profile {
        val profile = profileRepository.findById(id)

        if (profile.isEmpty) {
            throw Exception("Profile not found with id: #$id") // TODO: Add custom exception.
        }

        return profile.get()
    }

    fun createProfile(profileInput: ProfileInput): Profile {
        // TODO: Add validation.

        return profileRepository.save(profileInput.toProfile())
    }
}
