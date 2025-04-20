package project.android.businesscardapps

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import project.android.businesscardapps.ui.theme.BusinessCardAppsTheme

class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardAppsTheme {
                BusinessCard()
            }
        }
    }
}

@Composable
fun BusinessCard() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFF213448)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.ztx_avatar_002733), // Gambar dari drawable
                contentDescription = "Android Logo",
                modifier = Modifier
                    .size(100.dp)
                    .padding(bottom = 16.dp)
            )
            Text(
                text = "Zaidan Febriandi",
                fontSize = 28.sp,
                color = Color.White
            )
            Text(
                text = "10122231",
                fontSize = 16.sp,
                color = Color(0xFF3ddc84)
            )
            Text(
                text = "Teknik Informatika",
                fontSize = 16.sp,
                color = Color(0xFF3ddc84)
            )
        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 32.dp),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier
                    .width(200.dp),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.baseline_call_24),
                    contentDescription = "Call Logo",
                    modifier = Modifier.size(20.dp)
                )
                Spacer(Modifier.width(10.dp))
                Text(text = "+62 812-3456-7890", color = Color.White)
            }

            Spacer(modifier = Modifier.height(8.dp)) // Spasi antar baris
            
            Row(
                modifier = Modifier
                    .width(200.dp),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ig),
                    contentDescription = "Ig Logo",
                    modifier = Modifier.size(20.dp)
                )
                Spacer(Modifier.width(10.dp))
                Text(text = "@zspalll", color = Color.White)
            }

            Spacer(modifier = Modifier.height(8.dp)) // Spasi antar baris

            Row(
                modifier = Modifier
                    .width(200.dp),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.baseline_email_24),
                    contentDescription = "Email Logo",
                    modifier = Modifier.size(20.dp)
                )
                Spacer(Modifier.width(10.dp))
                Text(text = "zaidan@example.com", color = Color.White)
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BusinessCardAppsTheme {
        BusinessCard()
    }
}
