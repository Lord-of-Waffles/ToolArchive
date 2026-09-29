package com.example.toolarchivebe.controller

import com.example.toolarchivebe.entity.ProgrammingLanguage
import com.example.toolarchivebe.service.ProgrammingLanguageService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.net.URI

@RestController
@RequestMapping("/programmingLanguages")
class ProgrammingLanguageController (private val service: ProgrammingLanguageService) {
    @GetMapping
    fun listLanguages() = service.findLanguages()

    @PostMapping
    fun post(@RequestBody programmingLanguage: ProgrammingLanguage): ResponseEntity<ProgrammingLanguage> {
        val savedProgrammingLanguage = service.save(programmingLanguage)
        return ResponseEntity.created(URI("/programmingLanguages/${savedProgrammingLanguage.id}")).body(savedProgrammingLanguage)
    }

    @GetMapping("/programmingLanguages/{id}")
    fun getLanguage(@PathVariable id: String): ResponseEntity<ProgrammingLanguage> =
        service.findLanguageById(id).toResponseEntity()

    private fun ProgrammingLanguage?.toResponseEntity(): ResponseEntity<ProgrammingLanguage> =
        this?.let { ResponseEntity.ok(this) } ?: ResponseEntity.notFound().build()
}