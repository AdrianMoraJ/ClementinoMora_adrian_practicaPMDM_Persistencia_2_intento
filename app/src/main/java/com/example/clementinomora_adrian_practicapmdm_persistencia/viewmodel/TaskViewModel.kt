package com.example.clementinomora_adrian_practicapmdm_persistencia.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.clementinomora_adrian_practicapmdm_persistencia.model_BD.Task
import com.example.clementinomora_adrian_practicapmdm_persistencia.repository.TaskRepository
import kotlinx.coroutines.launch

class TaskViewModel(private val taskRepository: TaskRepository) : ViewModel() {

    // Método para obtener todas las tareas almacenadas en la base de datos
    fun getAllTasks(): LiveData<List<Task>> {
        return taskRepository.getAllTasks()
    }

    // Método para insertar una nueva tarea en la base de datos
    fun insertTask(task: Task) {
        viewModelScope.launch {
            taskRepository.insertTask(task)
        }
    }

    // Método para actualizar una tarea en la base de datos
    fun updateTask(task: Task) {
        viewModelScope.launch {
            taskRepository.updateTask(task)
        }
    }

    // Método para eliminar una tarea de la base de datos
    fun deleteTask(task: Task) {
        viewModelScope.launch {
            taskRepository.deleteTask(task)
        }
    }
}
