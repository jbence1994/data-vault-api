package hu.datavault.controller

import hu.datavault.model.Profile
import hu.datavault.model.ProfileInput
import hu.datavault.service.ProfileService
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.MutationMapping
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ProfileController(private val profileService: ProfileService) {

    @QueryMapping(name = "profiles")
    fun profiles(): List<Profile> {
        return profileService.getProfiles()
    }

    @QueryMapping(name = "profile")
    fun profile(@Argument id: String): Profile {
        return profileService.getProfile(id)
    }

    @MutationMapping(name = "createProfile")
    fun createProfile(@Argument input: ProfileInput): Profile {
        return profileService.createProfile(input)
    }
}
