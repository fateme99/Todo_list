package com.example.todolist.data.repoeotories

import com.example.todolist.data.TodoDao
import com.example.todolist.data.models.TodoTask
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@ViewModelScoped
class TodoRepository @Inject constructor(private val todoDao: TodoDao) {

    val getAllTasks: Flow<List<TodoTask>> = todoDao.getAllTasks()
    val sortByLowPriority: Flow<List<TodoTask>> = todoDao.sortByLowPriority()
    val sortByHighPriority: Flow<List<TodoTask>> = todoDao.sortByHighPriority()

    fun getSelectedTask(taskId: Int): Flow<TodoTask> {
        return todoDao.getSelectedTask(taskId)
    }

    suspend fun addTask(task: TodoTask) {
        todoDao.addTask(task)
    }

    suspend fun updateTask(task: TodoTask) {
        todoDao.updateTask(task)
    }

    suspend fun deleteTask(task: TodoTask) {
        todoDao.deleteTask(task)
    }

    suspend fun deleteAllTasks() {
        todoDao.deleteAllTasks()
    }

    fun getSearchDatabase(searchQuery: String): Flow<List<TodoTask>> {
        return todoDao.searchDatabase(searchQuery)
    }

}