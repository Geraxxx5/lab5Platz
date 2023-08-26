package com.example.lab4plataformas

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab4plataformas.ui.theme.ui.theme.Lab4PlataformasTheme

class MiPerfil : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab4PlataformasTheme {
                // A surface container using the 'background' color from the theme
                Column(modifier = Modifier.fillMaxWidth()) {
                    Top()
                    ProfileInformation()
                    MoreOptions(R.drawable.baseline_book_24,"My Campus",true,"My Friends")
                    MoreOptions(R.drawable.baseline_groups_24,"My Friends",false,"fadfsd")
                    MoreOptions(R.drawable.baseline_calendar_month_24,"My calendar",false,"fadfsd")
                    MoreOptions(R.drawable.baseline_collections_bookmark_24,"My Courses",false,"fadfsd")
                    MoreOptions(R.drawable.baseline_grade_24,"My Grades",false,"fadfsd")
                    MoreOptions(R.drawable.baseline_group_work_24,"My Groups",false,"fadfsd")
                    MoreOptions(R.drawable.baseline_event_24,"My Upcoming Events",false,"fadfsd")
                }
            }
        }
    }
}

@Composable
fun Top() {
    val context = LocalContext.current
   Surface(modifier = Modifier
       .fillMaxWidth()
       .height(50.dp)) {
       Box(modifier = Modifier
           .fillMaxSize()
           .border(BorderStroke(0.5.dp, Color.Black))){
           Text(text = "Mi Perfil", Modifier.align(Alignment.Center), textAlign = TextAlign.Center)
           Icon(painter = painterResource(id = R.drawable.baseline_settings_24), contentDescription = null, modifier = Modifier
               .align(
                   Alignment.CenterEnd
               )
               .padding(10.dp))
           IconButton(onClick = { context.startActivity(Intent(context,MenuPrincipalActivity::class.java)) }) {
               Icon(painter = painterResource(id = R.drawable.baseline_arrow_back_24), contentDescription = null, modifier = Modifier
                   .align(
                       Alignment.CenterStart
                   )
                   .padding(10.dp))
           }
       }
   }
}

@Composable
fun ProfileInformation(){
    Box(modifier = Modifier
        .fillMaxWidth()
        .height(250.dp)
        .padding(PaddingValues(bottom = 10.dp))){
        Image(painter = painterResource(id = R.drawable.ic_informacion),
            contentDescription =null,
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
                .align(Alignment.TopCenter)
                .blur(6.dp),
            contentScale = ContentScale.Crop)
        Image(painter = painterResource(id = R.drawable.baseline_person_24),
            contentDescription = null, modifier = Modifier
                .align(Alignment.Center)
                .clip(CircleShape)
                .background(color = Color(0xFFDED9D7))
                .size(150.dp))
        Text(text = "Gabriel Gerardo Pineda Riveiro", modifier = Modifier.align(Alignment.BottomCenter), fontSize = 25.sp)
    }
}

@Composable
fun MoreOptions(iconImage: Int, titleIcon: String, cointainSecondTitle: Boolean, secondTitle: String){
    Row(modifier = Modifier
        .fillMaxWidth()
        .border(BorderStroke(0.5.dp, Color.Black))
        .height(60.dp), verticalAlignment = Alignment.CenterVertically) {
        Icon(painter = painterResource(id = iconImage),
            contentDescription = null,
            modifier = Modifier.padding(10.dp))
        Column(modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(), verticalArrangement = Arrangement.Center) {
            Text(text = titleIcon)
            if(cointainSecondTitle){
                Text(text = secondTitle)
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreviews() {
    Lab4PlataformasTheme() {
        Column(modifier = Modifier.fillMaxWidth()) {
            Top()
            ProfileInformation()
            MoreOptions(R.drawable.baseline_book_24,"My Campus",true,"My Friends")
            MoreOptions(R.drawable.baseline_groups_24,"My Friends",false,"fadfsd")
            MoreOptions(R.drawable.baseline_calendar_month_24,"My calendar",false,"fadfsd")
            MoreOptions(R.drawable.baseline_collections_bookmark_24,"My Courses",false,"fadfsd")
            MoreOptions(R.drawable.baseline_grade_24,"My Grades",false,"fadfsd")
            MoreOptions(R.drawable.baseline_group_work_24,"My Groups",false,"fadfsd")
            MoreOptions(R.drawable.baseline_event_24,"My Upcoming Events",false,"fadfsd")
        }
    }
}