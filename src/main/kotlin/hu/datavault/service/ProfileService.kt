package hu.datavault.service

import hu.datavault.exception.ProfileNotFoundException
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
            throw ProfileNotFoundException(id)
        }

        return profile.get()
    }

    fun createProfile(profileInput: ProfileInput): Profile {
        // TODO: Add validation.

        return profileRepository.save(profileInput.toProfile())
    }

    fun updateProfile(profile: Profile): Profile {
        return profileRepository.save(profile)
    }
}
