package sbfatendimento.codingdojoatendimento01.model.entities

import javax.persistence.*

@Entity
@Table(name="tb_Teams")
data class Team (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private val id: Long,
    private val name: String,

    )
