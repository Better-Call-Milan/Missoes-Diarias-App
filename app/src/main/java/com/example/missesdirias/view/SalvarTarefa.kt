package com.example.missesdirias.view

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.RadioButton
import androidx.compose.material.RadioButtonDefaults
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.missesdirias.componentes.Botao
import com.example.missesdirias.componentes.CaixaDeTexto
import com.example.missesdirias.ui.theme.Amarelo
import com.example.missesdirias.ui.theme.Bege
import com.example.missesdirias.ui.theme.Preto
import com.example.missesdirias.ui.theme.Vermelho
import com.example.missesdirias.ui.theme.VermelhoSangue

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun SalvarTarefa(
    navController: NavController
){

    Scaffold(
        topBar = {
            TopAppBar(
                backgroundColor = VermelhoSangue,
                title = {
                    Text(
                        text = "Salvar Missão",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        color = Bege
                    )
                }
            )
        },
        backgroundColor = Bege
    ) {

        var tituloMissao by remember {
            mutableStateOf("")
        }
        var descricaoMissao by remember {
            mutableStateOf("")
        }
        var semPrioridadeMissao by remember{
            mutableStateOf( false)
        }
        var PrioridadeBaixaMissao by remember{
            mutableStateOf( false)
        }
        var PrioridadeMediaMissao by remember{
            mutableStateOf( false)
        }
        var PrioridadeAltaMissao by remember{
            mutableStateOf( false)
        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
        ) {
            CaixaDeTexto(
                value = tituloMissao,
                onValueChange = {tituloMissao = it},
                modifier = Modifier.fillMaxWidth().padding(20.dp, 20.dp, 20.dp, 0.dp),
                label = "Título da Missão",
                maxLines = 1,
                keyboardType = KeyboardType.Text
            )

            CaixaDeTexto(
                value = descricaoMissao,
                onValueChange = {descricaoMissao = it},
                modifier = Modifier
                    .fillMaxWidth().height(150.dp)
                    .padding(20.dp, 10.dp, 20.dp, 0.dp),
                label = "Descrição",
                maxLines = 5,
                keyboardType = KeyboardType.Text
            )

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Nível de Prioridade")

                RadioButton(
                    selected = PrioridadeBaixaMissao,
                    onClick = {PrioridadeBaixaMissao = !PrioridadeBaixaMissao},
                    colors = RadioButtonDefaults.colors(
                        unselectedColor = Amarelo,
                        selectedColor = Amarelo
                    )
                )
                RadioButton(
                    selected = PrioridadeMediaMissao,
                    onClick = {PrioridadeMediaMissao = !PrioridadeMediaMissao},
                    colors = RadioButtonDefaults.colors(
                        unselectedColor = Vermelho,
                        selectedColor = Vermelho
                    )
                )
                RadioButton(
                    selected = PrioridadeAltaMissao,
                    onClick = {PrioridadeAltaMissao= !PrioridadeAltaMissao},
                    colors = RadioButtonDefaults.colors(
                        unselectedColor = Preto,
                        selectedColor = Preto
                    )
                )
            }
            
            Botao(
                onClick = {

                },
                modifier = Modifier.fillMaxWidth().height(80.dp).padding(20.dp),
                texto = "Salvar"
            )
        }
    }
}