package eu.do24.codinginterviewbackend.domain.api

data class User(
    val id: Long?,
    val name: String,
    val email: String,
    val addresses: List<Address> = emptyList()
)