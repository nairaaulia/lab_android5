package com.naira.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class DemoActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HimatelHome()
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HimatelHome(){
    val warnaTosca = 0x744042
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier =  Modifier
                    .fillMaxSize()
                    .background(Color.LightGray),
        verticalArrangement = Arrangement.Center
    ){
        Image(
            painter = painterResource(id = R.drawable.polban),
            contentDescription = "Gambar"
        )
        Spacer(modifier = Modifier.height(24.dp))

        Surface(
            color = Color.Cyan,
            modifier = Modifier.fillMaxWidth()
        ){
            Text(
                text = "Halo Halo Bandung",
                fontSize = 24.sp,
                modifier = Modifier.padding(16.dp,16.dp,16.dp,4.dp),
                color = Color(warnaTosca),
                textAlign = TextAlign.Center
            )
        }
        Surface(
            color = Color.Blue,
            modifier = Modifier.fillMaxWidth()
        ){
            Text(
                text = "Ibu Kota Perjuangan",
                modifier = Modifier.padding(16.dp,0.dp,16.dp,4.dp),
                color = Color.Gray,
                textAlign = TextAlign.Center
            )
        }
        Surface(
            color = Color.Magenta,
            modifier = Modifier.fillMaxWidth()
        ){
            Text(
                text = "Mari bung",
                modifier = Modifier.padding(16.dp,0.dp,16.dp,4.dp),
                color = Color.Black,
                textAlign = TextAlign.Center
            )
        }
    }
}