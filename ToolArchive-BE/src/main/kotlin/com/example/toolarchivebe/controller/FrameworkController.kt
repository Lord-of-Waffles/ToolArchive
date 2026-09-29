package com.example.toolarchivebe.controller

import com.example.toolarchivebe.entity.Framework
import com.example.toolarchivebe.service.FrameworkService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.net.URI

@RestController
@RequestMapping("/frameworks")
class FrameworkController (private val service: FrameworkService) {
    @GetMapping
    fun listFrameworks() = service.findFrameworks()

    @PostMapping
    fun post(@RequestBody framework: Framework): ResponseEntity<Framework> {
        val savedFramework = service.save(framework)
        return ResponseEntity.created(URI("/frameworks/${savedFramework.id}")).body(savedFramework)
    }

    @GetMapping("/frameworks/{id}")
    fun getFramework(@PathVariable id: String): ResponseEntity<Framework> =
        service.findFrameworkById(id).toResponseEntity()

    private fun Framework?.toResponseEntity(): ResponseEntity<Framework> =
        this?.let { ResponseEntity.ok(this) } ?: ResponseEntity.notFound().build()
}