package hu.datavault.controller

import hu.datavault.model.Nationality
import hu.datavault.service.NationalityService
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class NationalityController(private val nationalityService: NationalityService) {

    @QueryMapping(name = "nationalities")
    fun nationalities(): List<Nationality> {
        return nationalityService.getNationalities()
    }
}
