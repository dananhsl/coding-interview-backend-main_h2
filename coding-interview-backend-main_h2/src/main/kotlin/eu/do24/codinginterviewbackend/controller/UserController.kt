package eu.do24.codinginterviewbackend.controller

import eu.do24.codinginterviewbackend.domain.api.User
import eu.do24.codinginterviewbackend.domain.services.UserService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/users")
//TODO: Error Handling
class UserController(private val userService: UserService) {
    @GetMapping
    fun getUsers(): ResponseEntity<List<User>> {
        return ResponseEntity.ok().body(userService.getAllUser())
    }

    @GetMapping("/{id}")
    fun getUser(@PathVariable id: Long): ResponseEntity<User> {
        return ResponseEntity.ok().body(userService.getUserById(id))
    }

    @PostMapping
    fun saveUser(@RequestBody user: User): ResponseEntity<User> {
        return ResponseEntity.ok().body(userService.saveUser(user))
    }

    @DeleteMapping
    fun deleteUser(@RequestBody user: User): ResponseEntity<Void> {
        return ResponseEntity.ok().build<Void>(userService.)
    }
}