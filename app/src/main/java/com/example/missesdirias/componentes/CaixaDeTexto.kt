package com.example.missesdirias.componentes

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import com.example.missesdirias.ui.theme.Bege
import com.example.missesdirias.ui.theme.Preto
import com.example.missesdirias.ui.theme.ShapeEditText
import com.example.missesdirias.ui.theme.VermelhoSangue

@Composable
fun CaixaDeTexto(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier,
    label: String,
    maxLines: Int,
    keyboardType: KeyboardType
){

    OutlinedTextField(
        value = value,
        onValueChange,
        modifier,
        label = {
            Text(text = label)
        },
        maxLines = maxLines,
        colors = TextFieldDefaults.outlinedTextFieldColors(
            textColor = Preto,
            focusedBorderColor = VermelhoSangue,
            focusedLabelColor = VermelhoSangue,
            backgroundColor = Bege,
            cursorColor = VermelhoSangue
        ),
        shape = ShapeEditText.small,
        keyboardOptions = KeyboardOptions(
            keyboardType = keyboardType
        )
    )
}