package eu.do24.codinginterviewbackend.persist.repositorys

import eu.do24.codinginterviewbackend.persist.entities.UserEntity
import org.springframework.data.repository.CrudRepository

interface UserRepository: CrudRepository<UserEntity, Long> {
}