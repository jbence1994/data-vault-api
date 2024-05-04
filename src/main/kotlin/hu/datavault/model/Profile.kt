package hu.datavault.model

import hu.datavault.constant.TableSchemaConstants.TABLE_NAME_PROFILES
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = TABLE_NAME_PROFILES)
data class Profile(

    @Id
    var id: String = "",

    var firstName: String = "",

    var middleName: String? = null,

    var lastName: String = "",

    var gender: Int = 0,

    var nationality: String = "",

    var birthDate: String? = null,

    var birthPlace: String? = null,

    var phone: String? = null,

    var email: String? = null,

    var photo: String? = null,

    var createdDateTime: String = "",
)
