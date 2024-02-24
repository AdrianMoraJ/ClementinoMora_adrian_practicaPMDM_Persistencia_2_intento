package com.example.clementinomora_adrian_practicapmdm_persistencia.repository

import androidx.lifecycle.LiveData
import com.example.clementinomora_adrian_practicapmdm_persistencia.model_BD.ModuleDao
import com.example.clementinomora_adrian_practicapmdm_persistencia.model_BD.Task

class ModuleRepository(private val moduleDao: ModuleDao) {

    // Método para obtener todas las tareas asociadas a un módulo específico
    fun getTasksForModule(moduleId: Int): LiveData<List<Task>> {
        return moduleDao.getTasksForModule(moduleId)
    }

    // Método para insertar una nueva tarea asociada a un módulo específico
    suspend fun insertTaskForModule(task: Task) {
        moduleDao.insert(task)
    }

    // Método para actualizar una tarea asociada a un módulo específico
    suspend fun updateTaskForModule(task: Task) {
        moduleDao.update(task)
    }

    // Método para eliminar una tarea asociada a un módulo específico
    suspend fun deleteTaskForModule(task: Task) {
        moduleDao.delete(task)
    }
}
