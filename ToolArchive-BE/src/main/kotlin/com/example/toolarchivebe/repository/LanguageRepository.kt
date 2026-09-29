package com.example.toolarchivebe.repository

import com.example.toolarchivebe.entity.ProgrammingLanguage
import org.springframework.data.repository.CrudRepository

interface LanguageRepository : CrudRepository<ProgrammingLanguage, String>