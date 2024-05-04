package hu.datavault.model

import hu.datavault.constant.TableSchemaConstants.TABLE_NAME_PROFILES
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.time.LocalDateTime
import java.util.UUID

@Entity
@Table(name = TABLE_NAME_PROFILES)
data class Profile(

    @Id
    var id: String = UUID.randomUUID().toString(),

    var firstName: String = "",

    var middleName: String = "",

    var lastName: String = "",

    var gender: Int = 0,

    var nationality: String = "",

    var birthDate: String = "",

    var birthPlace: String = "",

    var phone: String = "",

    var email: String = "",

    var photo: String? = null,

    var createdDateTime: String = LocalDateTime.now().toString(),
)
