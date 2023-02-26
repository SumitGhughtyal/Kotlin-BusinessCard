package com.example.businesscard

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import com.example.businesscard.ui.theme.BusinessCardTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Share
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BusinessCard(contactNumber = "9650XXXXXX", socialMediaHandle = "@Sumit.Ghughtyal", EMail = "SumitGhughtyal@gmail.com")
                }
            }
        }
    }
}

@Composable
fun BusinessCard(contactNumber : String, socialMediaHandle : String, EMail: String, modifier: Modifier = Modifier) {
    Box {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFF00001a)),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        )
        {
            Image(
                painter = painterResource(R.drawable.android_logo),
                contentDescription = null,
                modifier = Modifier
                    .height(80.dp)
                    .width(80.dp)
            )
            Spacer(
                modifier = Modifier.height(25.dp)
            )
            Text(
                text = "SUMIT GHUGHTYAL",
                fontWeight = FontWeight.Bold,
                color = Color.White,
                textAlign = TextAlign.Center,
                fontSize = 32.sp
            )
            Spacer(
                modifier = Modifier.height(10.dp)
            )
            Text(
                text = "Android Developer Extraordinaire",
                color = Color(0xFF3ddc84),
                textAlign = TextAlign.Center
            )

        }
        Column(modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Bottom, 
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Row( modifier = Modifier.fillMaxWidth().border(1.dp, Color.White)
                ,horizontalArrangement = Arrangement.Start){
                Spacer(
                    modifier = Modifier.width(80.dp)
                )
                Icon(
                    Icons.Rounded.Call,
                    contentDescription = null,
                    tint = Color(0xFF3ddc84)
                    )
                Spacer(
                    modifier = Modifier.width(30.dp)
                )
                Text(
                    text = "+91 $contactNumber",
                    color = Color(0xFF3ddc84)

                )
                
            }
            Spacer(
                modifier = Modifier.height(10.dp)
            )
            Row( modifier = Modifier.fillMaxWidth().border(1.dp, Color.White)
                ,horizontalArrangement = Arrangement.Start){
                Spacer(
                    modifier = Modifier.width(80.dp)
                )
                Icon(
                    Icons.Rounded.Share,
                    contentDescription = null,
                    tint = Color(0xFF3ddc84)
                )
                Spacer(
                    modifier = Modifier.width(30.dp)
                )
                Text(
                    text = "$socialMediaHandle",
                    color = Color(0xFF3ddc84)

                )

            }
            Spacer(
                modifier = Modifier.height(10.dp)
            )
            Row( modifier = Modifier.fillMaxWidth().border(1.dp, Color.White)
                ,horizontalArrangement = Arrangement.Start){
                Spacer(
                    modifier = Modifier.width(80.dp)
                )
                Icon(
                    Icons.Rounded.Email,
                    contentDescription = null,
                    tint = Color(0xFF3ddc84)
                )
                Spacer(
                    modifier = Modifier.width(30.dp)
                )
                Text(
                    text = "$EMail",
                    color = Color(0xFF3ddc84)

                )

            }

        }
    }
}



