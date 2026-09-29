package com.example.toolarchivebe.service

import com.example.toolarchivebe.entity.ProgrammingLanguage
import com.example.toolarchivebe.repository.LanguageRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class ProgrammingLanguageService (private val db: LanguageRepository) {
    fun findLanguages(): List<ProgrammingLanguage> = db.findAll().toList()

    fun findLanguageById(id: String): ProgrammingLanguage? = db.findByIdOrNull(id)

    fun save(programmingLanguage: ProgrammingLanguage): ProgrammingLanguage = db.save(programmingLanguage)
}