package hu.datavault.service

import hu.datavault.extension.toProfile
import hu.datavault.model.Profile
import hu.datavault.model.ProfileInput
import hu.datavault.repository.ProfileRepository
import org.springframework.stereotype.Service

@Service
class ProfileService(private val profileRepository: ProfileRepository) {

    fun getProfiles(): List<Profile> {
        return profileRepository.getProfiles()
    }

    fun getProfile(id: String): Profile {
        return profileRepository.getProfile(id)
    }

    fun createProfile(profileInput: ProfileInput): Profile {
        return profileRepository.createProfile(profileInput.toProfile())
    }
}
