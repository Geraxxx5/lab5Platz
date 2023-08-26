package com.example.lab4plataformas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab4plataformas.ui.theme.ui.theme.Lab4PlataformasTheme

class ContactoEmergenciaActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab4PlataformasTheme() {
                Column(Modifier.fillMaxWidth()) {
                    Column(modifier = Modifier
                        .fillMaxWidth()
                        .padding(PaddingValues(bottom = 20.dp))) {
                        TopActivity("Emergency Contacts")
                        EmergencyCards("Call 5978-1736","Emergencias","Si se presenta un incidente o un percance por favor marcar el numero de emergencia y rapidamente te apoyamos",R.drawable.baseline_warning_amber_24)
                        EmergencyCards("Call 2507-1500 ex 21312","Clinica","La Clinica, presta los siguientes servivcios:\n\n°Atencion a Emergencias\n°Atencion Primaria a Enfermedades Comunes\n°Plan Educacional sobre enfermedades\n\nHorarios de atencion: 7:00 a.m. a 8:30 p.m. Campus central edificio F 119-120",R.drawable.baseline_local_hospital_24)
                    }
                }
            }
        }
    }
}

@Composable
fun EmergencyCards(number: String,title:String,descripcion:String, image:Int){
    Column(Modifier.fillMaxWidth().border(BorderStroke(1.dp, Color.Black)) ) {
        Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
            Image(painter = painterResource(id = image),
                contentDescription = null,
                Modifier
                    .size(100.dp)
                    .padding(10.dp))
            Column(Modifier.fillMaxWidth(), verticalArrangement = Arrangement.Center) {
                Text(text = title, fontSize = 20.sp, fontWeight = FontWeight.Bold)
                Text(text = descripcion)
                
            }
        }
        Surface(modifier = Modifier
            .fillMaxWidth()
            .height(60.dp).padding(10.dp), color = Color.Green, shape = RoundedCornerShape(8.dp)) {
            Box(modifier = Modifier.fillMaxSize()){
                Text(text = number, Modifier.align(Alignment.Center), textAlign = TextAlign.Start)
                Icon(painter = painterResource(id = R.drawable.baseline_local_phone_24), contentDescription = null, modifier = Modifier
                    .align(
                        Alignment.CenterStart
                    )
                    .padding(10.dp))
            }
        }
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ContactoEmergenciaPreview() {
    Lab4PlataformasTheme {
        Column(Modifier.fillMaxWidth()) {
            Column(modifier = Modifier
                .fillMaxWidth()
                .padding(PaddingValues(bottom = 20.dp))) {
                TopActivity("Emergency Contacts")
                EmergencyCards("Call 5978-1736","Emergencias","Si se presenta un incidente o un percance por favor marcar el numero de emergencia y rapidamente te apoyamos",R.drawable.baseline_warning_amber_24)
                EmergencyCards("Call 2507-1500 ex 21312","Clinica","La Clinica, presta los siguientes servivcios:\n\n°Atencion a Emergencias\n°Atencion Primaria a Enfermedades Comunes\n°Plan Educacional sobre enfermedades\n\nHorarios de atencion: 7:00 a.m. a 8:30 p.m. Campus central edificio F 119-120",R.drawable.baseline_local_hospital_24)
            }
        }
    }
}