package com.example.toolarchivebe.entity

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.util.*

@Table("programming_languages")
data class ProgrammingLanguage(
    @Id val id: UUID = UUID.randomUUID(),
    val name: String,
    val release_year: Int,
    val compiler: String,
    val typing: String,
    val desc: String,
    val developer: String
    )