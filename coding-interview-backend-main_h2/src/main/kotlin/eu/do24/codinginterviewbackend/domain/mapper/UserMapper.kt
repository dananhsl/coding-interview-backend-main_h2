package eu.do24.codinginterviewbackend.domain.mapper

import eu.do24.codinginterviewbackend.domain.api.User
import eu.do24.codinginterviewbackend.persist.entities.UserEntity

fun User.toEntity() : UserEntity = UserEntity(id, name, email)
fun UserEntity.toApi() : User = User(id, name, email)