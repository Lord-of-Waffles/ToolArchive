package com.example.toolarchivebe.entity

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.util.*

@Table("frameworks")
data class Framework(
    @Id val id: UUID = UUID.randomUUID(),
    val name : String,
    val release_year: Int,
    val usage: String,
    val desc: String,
    val based_on: Int
)