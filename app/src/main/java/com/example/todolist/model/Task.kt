package com.example.todolist.model

data class Task(val name : String , val status: TaskStatus)

enum class TaskStatus {
    TODO,
    DOING,
    DONE
}
