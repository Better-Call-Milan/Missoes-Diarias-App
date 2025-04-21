package com.example.missesdirias.view

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Scaffold
import androidx.compose.material.TopAppBar
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.missesdirias.R
import com.example.missesdirias.ui.theme.Bege
import com.example.missesdirias.ui.theme.Branco
import com.example.missesdirias.ui.theme.Vermelho

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun ListaTarefas(
    navController: NavController
){
    Scaffold (
        topBar = {
            TopAppBar(
                title = { Text(text = "Missões", fontSize = 18.sp, fontWeight = FontWeight.Bold, color = Branco) },
                backgroundColor = Vermelho
            )
        },
        backgroundColor = Bege,
        floatingActionButton = {
            FloatingActionButton(
                onClick = {navController.navigate("SalvarTarefa")},
                backgroundColor = Vermelho) {
                Image(
                    imageVector = ImageVector.vectorResource(id = R.drawable.ic_add),
                    contentDescription = "Ícone de Adicionar Missão!"
                )
            }
        }
    ){}
}