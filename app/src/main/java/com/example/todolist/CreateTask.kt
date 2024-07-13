package com.example.todolist

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment

import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp

@Composable
fun CreateNewTask() {
    val taskName = mutableStateOf(TextFieldValue())

    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        CustomEditText(taskName,
            Modifier
                .fillMaxWidth()
                .height(82.dp)
                .padding(12.dp))

        Spacer(modifier = Modifier.fillMaxWidth().height(12.dp))

        Button(onClick = { /*TODO*/ }) {
            Text(text = "Save")
        }
    }
}
