package com.example.lab4plataformas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.BottomCenter
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab4plataformas.ui.theme.ui.theme.Lab4PlataformasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab4PlataformasTheme() {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Menu()
                }
            }
        }
    }
}

@Composable
fun Menu(){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = stringResource(id = R.string.titulo_principal),
            modifier = Modifier
                .fillMaxWidth()
                .align(CenterHorizontally)
                .padding(PaddingValues(vertical = 10.dp)),
            textAlign = TextAlign.Center,
            fontSize = 35.sp
        )
        Cards(containText = false, cardText = "", cardImage = R.drawable.ic_food_courts, cardImageDescription = "",
            cardImageModifier = Modifier
                .fillMaxWidth()
                .align(CenterHorizontally)
                .height(200.dp),
            cardModifier = Modifier.fillMaxWidth(),
            0xFFFFCF8A
        )
        Text(
            text = stringResource(id = R.string.subtitulo_destacados),
            modifier = Modifier
                .fillMaxWidth()
                .align(CenterHorizontally)
                .padding(PaddingValues(vertical = 8.dp)),
            textAlign = TextAlign.Start,
            fontSize = 20.sp
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(PaddingValues(vertical = 8.dp)),
            horizontalArrangement = Arrangement.Center
        ) {
            Cards(containText = true, cardText = "MacDonalds", cardImage = R.drawable.ic_logo_macdonals, cardImageDescription = "",
                cardImageModifier = Modifier
                    .width(150.dp)
                    .fillMaxHeight(),
                cardModifier = Modifier
                    .height(150.dp)
                    .width(150.dp),
                0xFFFFCF8A
            )
            Cards(containText = true, cardText = "Panda Express", cardImage = R.drawable.ic_panda_express_logo, cardImageDescription = "",
                cardImageModifier = Modifier,
                cardModifier = Modifier
                    .height(150.dp)
                    .width(150.dp),
                0xFFFFB897
            )
        }
        Text(
            text = stringResource(id = R.string.subtitulo_servicios_recursos),
            modifier = Modifier
                .fillMaxWidth()
                .align(CenterHorizontally)
                .padding(PaddingValues(vertical = 8.dp)),
            textAlign = TextAlign.Start,
            fontSize = 20.sp
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(PaddingValues(vertical = 8.dp)),
            horizontalArrangement = Arrangement.Center
        ) {
            Cards(containText = true, cardText = "Informacion", cardImage = R.drawable.ic_informacion, cardImageDescription = "",
                cardImageModifier = Modifier
                    .width(150.dp)
                    .fillMaxHeight(),
                cardModifier = Modifier
                    .height(150.dp)
                    .width(150.dp),
                0xFFFFB897
        )
            Cards(containText = true, cardText = "Mas Sucursales", cardImage = R.drawable.ic_mas_locales, cardImageDescription = "",
                cardImageModifier = Modifier
                    .width(150.dp)
                    .fillMaxHeight(),
                cardModifier = Modifier
                    .height(150.dp)
                    .width(150.dp),
                0xFFFFCF8A
            )
        }

    }
}

@Composable
fun Cards(containText: Boolean, cardText: String, cardImage: Int, cardImageDescription: String, cardImageModifier: Modifier, cardModifier: Modifier, color: Long ){
    Card(
        shape = RoundedCornerShape(8.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 10.dp
        ),
        modifier = cardModifier.padding(10.dp)

    ){
        Box(
            modifier = Modifier.fillMaxWidth()
        ){
            Image(painter = painterResource(id = cardImage),
                contentDescription = null,
                modifier = cardImageModifier,
                contentScale = ContentScale.Crop
            )
            if (containText){
                Surface(
                    color = Color(color),
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(BottomCenter)
                ) {
                    Text(
                        text = cardText,
                        textAlign = TextAlign.Center
                    )
                }

            }
        }

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    Lab4PlataformasTheme {
        Menu()
    }
}