package sbfatendimento.codingdojoatendimento01.model.entities

import lombok.Getter
import lombok.Setter
import javax.persistence.*

@Getter
@Setter
@Entity
@Table(name = "TB_USERS")
data class User(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long,
    var name: String,
    var email: String,
    var phoneNumber: String,

    @OneToOne
    var team: Team,

    var engineerRole: String

)
