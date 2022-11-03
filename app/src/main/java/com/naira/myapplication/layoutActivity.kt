package com.naira.myapplication

import android.accounts.AuthenticatorDescription
import android.icu.text.CaseMap
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.nio.file.Files.size

class layoutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BelajarLayout{
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ){
                    ComposeQuadrantApp()
                }
            }
        }
    }
}

@Composable
fun ComposeQuadrantApp() {
    val colorRed = 0xf52020;
    val colorBlue -0x228ff5;
    val colorBrown = 0xba7734;
    val colorGrey = 0x91867c;
    val colorYellow = 0xf3ff4d;
    val colorGreen = 0x3ea849;
    Column(Modifier.fillMaxWidth()) {
    //BARIS PERTAMA
    Row(
        modifier = Modifier.weight(if)
    ) {
       ComposableInfoCard(
           title = stringResource(R.string.skill_fire),
           description = stringResource(R.string.element_fire),
           backgroundColor = Color(colorRed),
           modifier = Modifier.weight(if)
       )
       ComposableInfoCard(
           title = "Waterfall Rain",
           description = "Element: Water",
           backgroundColor = Color(colorBlue),
           modifier = Modifier.weight(if)
       )
       ComposableInfoCard(
           title = "Ground-to-earth",
           description = "Element: Earth",
           backgroundColor = Color(colorBrown),
           modifier = Modifier.weight(if)
       )
    }

    //BARIS KEDUA
    Row(
        modifier = Modifier.weight(if)
    ) {
        ComposableInfoCard(
            title = "Torpedo",
            description = "Element: Wind",
            backgroundColor = Color(colorGrey),
            modifier = Modifier.weight(if)
        )
        ComposableInfoCard(
            title = "Thunder Storm",
            description = "Element: Thunder",
            backgroundColor = Color(colorYellow),
            modifier = Modifier.weight(if)
        )
        ComposableInfoCard(
            title = "Vine-fast",
            description = "Element: Nature",
            backgroundColor = Color(colorGreen),
            modifier = Modifier.weight(if)
        )
      }
    }
}

@Composable
private fun ComposableInfoCard(
    title: String,
    description: String,
    backgroundColor: Color,
    modifier: Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.fire),
            contentDescription = stringResource(R.string.sign_fire),
            modifier = Modifier
                .padding(bottom = 24.dp)
                .clip(RoundedCornerShape(percent = 50))
                .border(4.dp, Color.Transparent, CircleShape)
        )
        Text(
            text = "Fire",
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 4.dp)
        )
        Text(
            text = "Yuhu",
            textAlign = TextAlign.Justify
        )
        Image(
            painter = painterResource(id = R.drawable.water),
            contentDescription = stringResource(R.string.sign_water),
            modifier = Modifier
                .padding(bottom = 24.dp)
                .clip(RoundedCornerShape(percent = 50))
                .border(4.dp, Color.Transparent, CircleShape)
        )
        Text(
            text = "Water",
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 4.dp)
        )
        Text(
            text = "Yuhu",
            textAlign = TextAlign.Justify
        )
        Image(
            painter = painterResource(id = R.drawable.water),
            contentDescription = stringResource(R.string.sign_water),
            modifier = Modifier
                .padding(bottom = 24.dp)
                .clip(RoundedCornerShape(percent = 50))
                .border(4.dp, Color.Transparent, CircleShape)
        )
        Text(
            text = "Water",
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 4.dp)
        )
        Text(
            text = "Yuhu",
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BirthDayCardPreview() {
    BelajarLayout{
        ComposeQuadrantApp()
    }
}
