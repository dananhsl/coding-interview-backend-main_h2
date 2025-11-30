package eu.do24.codinginterviewbackend.domain.api

data class Address (
    val id : Long?,
    val street: String,
    val city: String,
    val state: String,
    val zipCode: String,
    val userId: Long,
)