package sbfatendimento.codingdojoatendimento01.service

import org.springframework.dao.DataIntegrityViolationException
import org.springframework.stereotype.Service
import sbfatendimento.codingdojoatendimento01.model.entities.User
import sbfatendimento.codingdojoatendimento01.model.repositories.UserRepository
import sbfatendimento.codingdojoatendimento01.service.exceptions.ResourceNotFoundException
import java.util.*

@Service
class UserService(private val userRepository: UserRepository) {

    fun getUsers(): List<User> = userRepository.findAll()

    fun getById(id: Long): User? {
        val user : Optional<User> = userRepository.findById(id)

        return user.orElseThrow{ResourceNotFoundException(id)}
    }

    fun deleteById(id: Long){
        try {
            userRepository.deleteById(id)
        }catch (
            erro: DataIntegrityViolationException
        )
        {erro.stackTrace}
    }

    private fun updateData(user: User,outUser: User){
        user.email = outUser.email
        user.team = outUser.team
        user.phoneNumber = outUser.phoneNumber
        user.engineerRole = outUser.engineerRole
    }

    fun update(id: Long, user: User): User {

        val oldUser : User = userRepository.getById(id)

        updateData(oldUser, user)

        return userRepository.save(oldUser)
    }

    fun insert(user: User) : User {

        return userRepository.save(user);
    }
}