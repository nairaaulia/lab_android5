package com.naira.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class TestActivity : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //val warnaBiru = 0000FF
        setContent {
            Column() {
                Surface(
                    color = Color.Yellow,
                ) {
                    Text(
                        text = "Halo Halo Bandung",
                        fontSize = 26.sp,
                        modifier = Modifier.padding(16.dp,16.dp,16.dp,6.dp)
                ) }
                Surface(
                    color = Color.LightGray,
                ) {
                    Text(
                        text = "Ibu kota perjuangan",
                        fontSize = 20.sp,
                        modifier = Modifier.padding(16.dp,6.dp,16.dp,6.dp)
                ) }
            }
        }
    }
}