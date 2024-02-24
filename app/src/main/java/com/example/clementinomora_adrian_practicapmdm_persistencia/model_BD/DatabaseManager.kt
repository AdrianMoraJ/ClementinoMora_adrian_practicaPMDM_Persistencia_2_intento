package com.example.clementinomora_adrian_practicapmdm_persistencia.model_BD

import android.content.Context
import com.example.clementinomora_adrian_practicapmdm_persistencia.repository.ModuleRepository
import com.example.clementinomora_adrian_practicapmdm_persistencia.repository.TaskRepository

class DatabaseManager(context: Context) {

    val appDatabase: AppDatabase = AppDatabase.getInstance(context)
    val taskRepository: TaskRepository = TaskRepository(appDatabase.taskDao())
    val moduleRepository: ModuleRepository = ModuleRepository(appDatabase.moduleDao())
}
