package com.example.todolist

import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextDirection
import com.example.todolist.ui.theme.DarkBlue
import com.example.todolist.ui.theme.LightBlue
import com.example.todolist.ui.theme.MediumBlue
import com.example.todolist.ui.theme.NeutralDark

@Composable
fun CustomEditText(valueText: MutableState<TextFieldValue>, modifier: Modifier = Modifier) {
    var text by remember {
        valueText
    }
    OutlinedTextField(value = text, onValueChange = {
        text = it
    }, label = {
        Text(
            text = "Task Name",
            style = TextStyle(
                DarkBlue,
                textDirection = TextDirection.Rtl
            )
        )
    },
        modifier = modifier,
        textStyle = TextStyle(NeutralDark, textDirection = TextDirection.Rtl),
        colors = OutlinedTextFieldDefaults.colors(
            cursorColor = MediumBlue,
            focusedBorderColor = LightBlue,
            unfocusedBorderColor = LightBlue,
        )
    )
}