package com.example.clementinomora_adrian_practicapmdm_persistencia.model_BD

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "modules")
data class Module(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val name: String
)

