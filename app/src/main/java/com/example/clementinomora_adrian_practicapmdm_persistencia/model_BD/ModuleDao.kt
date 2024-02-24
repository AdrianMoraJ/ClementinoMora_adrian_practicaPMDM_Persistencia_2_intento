package com.example.clementinomora_adrian_practicapmdm_persistencia.model_BD

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface ModuleDao {
    @Query("SELECT * FROM modules")
    fun getAll(): LiveData<List<Module>>

    @Query("SELECT * FROM tasks WHERE moduleId = :moduleId")
    fun getTasksForModule(moduleId: Int): LiveData<List<Task>> // Agregado

    @Insert
    suspend fun insert(module: Task)

    @Update
    suspend fun update(module: Task)

    @Delete
    suspend fun delete(module: Task)
}
