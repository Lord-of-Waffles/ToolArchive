package com.example.toolarchivebe.service

import com.example.toolarchivebe.entity.Framework
import com.example.toolarchivebe.repository.FrameworkRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class FrameworkService (private val db: FrameworkRepository) {
    fun findFrameworks(): List<Framework> = db.findAll().toList()

    fun findFrameworkById(id: String): Framework? = db.findByIdOrNull(id)

    fun save(framework: Framework): Framework = db.save(framework)

}