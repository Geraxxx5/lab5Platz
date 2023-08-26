package com.example.lab4plataformas

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab4plataformas.ui.theme.ui.theme.Lab4PlataformasTheme

class MenuPrincipalActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab4PlataformasTheme {
                // A surface container using the 'background' color from the theme
                Column(modifier = Modifier.fillMaxWidth()) {
                    MenuPrincipal()
                }
            }
        }
    }
}


@Composable
fun MenuPrincipal(){
    val context = LocalContext.current
    Column(Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {

        Image(painter = painterResource(id = R.drawable.ic_menu_p),
            contentDescription = null,
            Modifier
                .width(400.dp)
                .height(200.dp)
                .padding(PaddingValues(vertical = 20.dp)))

        Text(text = "Menu Principal", fontSize = 20.sp, fontWeight = FontWeight.Bold)
        Button(onClick = {
            changeActivity(context, Intent(context,MainActivity::class.java))
                         },
            Modifier
                .padding(PaddingValues(vertical = 10.dp))
                .width(200.dp)) {
            Text(text = "Informacion")
        }
        Button(onClick = { changeActivity(context, Intent(context,MiPerfil::class.java)) },
            Modifier
                .padding(PaddingValues(vertical = 10.dp))
                .width(200.dp)) {
            Text(text = "Mi Perfil")
        }
        Button(onClick = { changeActivity(context, Intent(context,ConfiguracionActivity::class.java)) },
            Modifier
                .padding(PaddingValues(vertical = 10.dp))
                .width(200.dp)) {
            Text(text = "Configuracion")
        }
        Button(onClick = { changeActivity(context, Intent(context,ContactoEmergenciaActivity::class.java)) },
            Modifier
                .padding(PaddingValues(vertical = 20.dp))
                .width(200.dp)) {
            Text(text = "Contacto de\n Emergencia")
        }


    }
}

fun changeActivity(current: Context, intent: Intent){
    current.startActivity(intent)
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MenuPrincipalPreview() {
    Lab4PlataformasTheme() {
        Column(modifier = Modifier.fillMaxWidth()) {
            MenuPrincipal()
        }
    }
}