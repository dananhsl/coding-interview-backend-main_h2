package eu.do24.codinginterviewbackend.config

import eu.do24.codinginterviewbackend.domain.services.UserService
import eu.do24.codinginterviewbackend.persist.repositorys.UserRepository
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class UserConfig {
    @Bean
    fun userService(userRepository: UserRepository): UserService {
        return UserService(userRepository)
    }
}