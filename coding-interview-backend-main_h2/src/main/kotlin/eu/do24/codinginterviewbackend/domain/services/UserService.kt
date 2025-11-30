package eu.do24.codinginterviewbackend.domain.services

import eu.do24.codinginterviewbackend.domain.api.User
import eu.do24.codinginterviewbackend.domain.mapper.toApi
import eu.do24.codinginterviewbackend.domain.mapper.toEntity
import eu.do24.codinginterviewbackend.persist.repositorys.UserRepository

class UserService(private val userRepository: UserRepository) {
    fun getAllUser(): List<User> {
        return userRepository.findAll().map { it.toApi() }
    }

    fun getUserById(id: Long): User? {
        val user = userRepository.findById(id)
        if(user.isEmpty) return null
        return user.get().toApi()
    }

    fun saveUser(user: User): User {
        return userRepository.save(user.toEntity()).toApi()
    }
}