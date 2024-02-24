package com.example.clementinomora_adrian_practicapmdm_persistencia.model_BD

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tasks")
data class Task(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val title: String,
    val description: String,
    val moduleId: Int // Referencia al módulo al que pertenece la tarea
)
