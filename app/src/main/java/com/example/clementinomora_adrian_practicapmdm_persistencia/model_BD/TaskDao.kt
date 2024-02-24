package com.example.clementinomora_adrian_practicapmdm_persistencia.model_BD

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface TaskDao {
    @Query("SELECT * FROM tasks")
    fun getAll(): LiveData<List<Task>>

    @Insert
    suspend fun insert(task: Task)

    @Update
    suspend fun update(task: Task)

    @Delete
    suspend fun delete(task: Task)

    @Query("SELECT * FROM tasks WHERE moduleId = :moduleId")
    fun getTasksForModule(moduleId: Int): LiveData<List<Task>>
}
