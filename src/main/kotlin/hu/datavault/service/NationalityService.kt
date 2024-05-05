package hu.datavault.service

import hu.datavault.model.Nationality
import hu.datavault.repository.NationalityRepository
import org.springframework.stereotype.Service

@Service
class NationalityService(private val nationalityRepository: NationalityRepository) {

    fun getNationalities(): List<Nationality> {
        return nationalityRepository.findAll()
    }
}
