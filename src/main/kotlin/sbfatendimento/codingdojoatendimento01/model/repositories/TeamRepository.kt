package sbfatendimento.codingdojoatendimento01.model.repositories

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import sbfatendimento.codingdojoatendimento01.model.entities.Team

@Repository
interface TeamRepository :  JpaRepository<Team, Long>{
}