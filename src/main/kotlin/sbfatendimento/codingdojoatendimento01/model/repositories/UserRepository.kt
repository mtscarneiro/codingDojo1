package sbfatendimento.codingdojoatendimento01.model.repositories

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import sbfatendimento.codingdojoatendimento01.model.entities.User

@Repository
interface UserRepository : JpaRepository<User, Long> {
}