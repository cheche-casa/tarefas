package com.example.tareas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tareas.ui.theme.TareasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TareasTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    PantallaFinal(
                        imaxe = painterResource(R.drawable.ic_task_completed),
                        texto = stringResource(R.string.Menxase),
                        despedida = stringResource(R.string.Despedida)
                    )
                }
            }
        }
    }
}

@Composable
fun PantallaFinal(imaxe: Painter, texto: String, despedida: String, modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = imaxe,
            contentDescription = null,
            contentScale = ContentScale.Fit
        )
        Text(
            text = texto,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 24.dp, bottom = 8.dp)
        )
        Text(
            text = despedida,
            fontSize = 16.sp
            )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TareasTheme {
        PantallaFinal(
            imaxe = painterResource(R.drawable.ic_task_completed),
            texto = stringResource(R.string.Menxase),
            despedida = stringResource(R.string.Despedida)
        )
    }
}