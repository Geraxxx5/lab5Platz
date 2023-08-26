package com.example.lab4plataformas

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab4plataformas.ui.theme.ui.theme.Lab4PlataformasTheme

class ConfiguracionActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab4PlataformasTheme() {
                // A surface container using the 'background' color from the theme
                Column(Modifier.fillMaxWidth()) {
                    Column(modifier = Modifier
                        .fillMaxWidth()
                        .padding(PaddingValues(bottom = 20.dp))) {
                        TopActivity(stringResource(id = R.string.top_configuracion_texto))
                        MoreOptions(iconImage = R.drawable.baseline_person_24, titleIcon = "Edit Profile", cointainSecondTitle = false, secondTitle = "afdsfsd")
                        MoreOptions(iconImage = R.drawable.baseline_email_24, titleIcon = "Email Addresses", cointainSecondTitle = false, secondTitle = "afdsfsd")
                        MoreOptions(iconImage = R.drawable.baseline_notifications_24, titleIcon = "Notifications", cointainSecondTitle = false, secondTitle = "afdsfsd")
                        MoreOptions(iconImage = R.drawable.baseline_remove_red_eye_24, titleIcon = "Privacy", cointainSecondTitle = false, secondTitle = "afdsfsd")
                    }
                    Column(modifier = Modifier
                        .fillMaxWidth()
                        .padding(PaddingValues(bottom = 20.dp))) {
                        MoreOptions(iconImage = R.drawable.baseline_question_mark_24, titleIcon = "Help & Feedback", cointainSecondTitle = true, secondTitle = "Troubleshooting tips and guides")
                        MoreOptions(iconImage = R.drawable.baseline_info_24, titleIcon = "Edit Profile", cointainSecondTitle = true, secondTitle = "App information and documents")
                    }
                    Text(fontSize = 25.sp,text = "Logout", color = Color.Red, modifier = Modifier
                        .fillMaxWidth()
                        .border(
                            BorderStroke(1.dp, Color.Black)
                        )
                        .height(40.dp), textAlign = TextAlign.Center)
                }
            }
        }
    }
}

@Composable
fun TopActivity(title: String) {
    val context = LocalContext.current
    Surface(modifier = Modifier
        .fillMaxWidth()
        .height(50.dp)) {
        Box(modifier = Modifier
            .fillMaxSize()
            .border(BorderStroke(0.5.dp, Color.Black))){
            Text(text = title, Modifier.align(Alignment.Center), textAlign = TextAlign.Center)
            IconButton(onClick = {
                context.startActivity(Intent(context,MenuPrincipalActivity::class.java))
            }) {
                Icon(painter = painterResource(id = R.drawable.baseline_arrow_back_24), contentDescription = null, modifier = Modifier
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
fun ConfiguracionPreview() {
    Lab4PlataformasTheme {
        Column(Modifier.fillMaxWidth()) {
            Column(modifier = Modifier
                .fillMaxWidth()
                .padding(PaddingValues(bottom = 20.dp))) {
                TopActivity(stringResource(id = R.string.top_configuracion_texto))
                MoreOptions(iconImage = R.drawable.baseline_person_24, titleIcon = "Edit Profile", cointainSecondTitle = false, secondTitle = "afdsfsd")
                MoreOptions(iconImage = R.drawable.baseline_email_24, titleIcon = "Email Addresses", cointainSecondTitle = false, secondTitle = "afdsfsd")
                MoreOptions(iconImage = R.drawable.baseline_notifications_24, titleIcon = "Notifications", cointainSecondTitle = false, secondTitle = "afdsfsd")
                MoreOptions(iconImage = R.drawable.baseline_remove_red_eye_24, titleIcon = "Privacy", cointainSecondTitle = false, secondTitle = "afdsfsd")
            }
            Column(modifier = Modifier
                .fillMaxWidth()
                .padding(PaddingValues(bottom = 20.dp))) {
                MoreOptions(iconImage = R.drawable.baseline_question_mark_24, titleIcon = "Help & Feedback", cointainSecondTitle = true, secondTitle = "Troubleshooting tips and guides")
                MoreOptions(iconImage = R.drawable.baseline_info_24, titleIcon = "Edit Profile", cointainSecondTitle = true, secondTitle = "App information and documents")
            }
            Text(fontSize = 25.sp,text = "Logout", color = Color.Red, modifier = Modifier
                .fillMaxWidth()
                .border(
                    BorderStroke(1.dp, Color.Black)
                )
                .height(40.dp), textAlign = TextAlign.Center)
        }
    }
}