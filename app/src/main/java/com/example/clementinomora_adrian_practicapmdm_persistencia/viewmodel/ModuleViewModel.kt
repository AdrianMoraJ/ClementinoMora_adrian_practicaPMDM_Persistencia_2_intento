package com.example.clementinomora_adrian_practicapmdm_persistencia.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.clementinomora_adrian_practicapmdm_persistencia.model_BD.Task
import com.example.clementinomora_adrian_practicapmdm_persistencia.repository.ModuleRepository
import kotlinx.coroutines.launch

class ModuleViewModel(private val moduleRepository: ModuleRepository) : ViewModel() {

    // Método para obtener todas las tareas asociadas a un módulo específico
    fun getTasksForModule(moduleId: Int): LiveData<List<Task>> {
        return moduleRepository.getTasksForModule(moduleId)
    }

    // Método para insertar una nueva tarea asociada a un módulo específico
    fun insertTaskForModule(task: Task) {
        viewModelScope.launch {
            moduleRepository.insertTaskForModule(task)
        }
    }

    // Método para actualizar una tarea asociada a un módulo específico
    fun updateTaskForModule(task: Task) {
        viewModelScope.launch {
            moduleRepository.updateTaskForModule(task)
        }
    }

    // Método para eliminar una tarea asociada a un módulo específico
    fun deleteTaskForModule(task: Task) {
        viewModelScope.launch {
            moduleRepository.deleteTaskForModule(task)
        }
    }
}
