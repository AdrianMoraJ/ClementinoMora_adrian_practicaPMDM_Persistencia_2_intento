package com.example.clementinomora_adrian_practicapmdm_persistencia.repository

import androidx.lifecycle.LiveData
import com.example.clementinomora_adrian_practicapmdm_persistencia.model_BD.Task
import com.example.clementinomora_adrian_practicapmdm_persistencia.model_BD.TaskDao

class TaskRepository(private val taskDao: TaskDao) {

    // Método para obtener todas las tareas almacenadas en la base de datos
    fun getAllTasks(): LiveData<List<Task>> {
        return taskDao.getAll()
    }

    // Método para insertar una nueva tarea en la base de datos
    suspend fun insertTask(task: Task) {
        taskDao.insert(task)
    }

    // Método para actualizar una tarea existente en la base de datos
    suspend fun updateTask(task: Task) {
        taskDao.update(task)
    }

    // Método para eliminar una tarea de la base de datos
    suspend fun deleteTask(task: Task) {
        taskDao.delete(task)
    }
}
