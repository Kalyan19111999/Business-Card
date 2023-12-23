package com.example.businesscarddeuplicate

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.materialIcon
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.TileMode
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscarddeuplicate.ui.theme.BusinessCardDeuplicateTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardDeuplicateTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCardApp()
                }
            }
        }
    }
}

@Composable
fun BusinessCardApp() {
    val dynaFont = FontFamily(Font(R.font.dynalight, FontWeight.ExtraBold))
    val lilyFont = FontFamily(Font(R.font.lily_script_one, FontWeight.ExtraBold))
    val imageBorder = Brush.sweepGradient(
        listOf(
            Color(0xFF9575CD),
            Color(0xFFBA68C8),
            Color(0xFFE57373),
            Color(0xFFFFB74D),
            Color(0xFFFFF176),
            Color(0xFFAED581),
            Color(0xFF4DD0E1),
            Color(0xFF9575CD)
        )
    )
    val backgroundGradient = Brush.linearGradient(
        listOf(
            Color(0xFF33ccff),
            Color(0xFFff99cc)
        ),
        /*start = Offset.Zero,
        end = Offset(50.0F, 200.0F),
        tileMode = TileMode.Mirror*/
    )
    Column (verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier
        .fillMaxSize()
        .background(backgroundGradient)) {
        Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.weight(0.8F)) {
            Image(
                painter = painterResource(R.drawable.win_20231208_22_10_54_pro),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(240.dp).clip(CircleShape).border(BorderStroke(4.dp, imageBorder), CircleShape)
            )
            Spacer(Modifier.height(16.dp))
            Text(text = "Kalyan ⚡", color = Color.White, fontFamily = lilyFont, fontSize = 52.sp)
            Text(
                text = "Tech Dude  🖥",
                color = Color.White,
                fontFamily = lilyFont,
                fontSize = 28.sp
            )
        }
        Column(modifier = Modifier.weight(0.2F)) {
            Row {
                Icon(
                    imageVector = Icons.Rounded.Call,
                    contentDescription = null,
                    tint = Color.White
                )
                Spacer(Modifier.width(8.dp))
                Text(text = "+91 7780691710", fontSize = 20.sp, fontFamily = lilyFont, color = Color.White)
            }
            Spacer(Modifier.height(12.dp))
            Row {
                Icon(
                    imageVector = Icons.Rounded.Email,
                    contentDescription = null,
                    tint = Color.White,
                )
                Spacer(Modifier.width(8.dp))
                Text(text = "chakra.1999@gmail.com",fontSize = 16.sp, fontFamily = lilyFont, color = Color.White)
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardDeuplicateTheme {
        BusinessCardApp()
    }
}