//Sutham Hengsuwan

package com.example.assignment01

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
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
import androidx.core.graphics.toColorInt
import com.example.assignment01.ui.theme.Assignment01Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Assignment01Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainPicture()
                }
            }
        }
    }
}

@Composable
fun MainPicture() {

    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .background( Color("#669999".toColorInt() ) )
    ){
        Column (
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .weight(1f)
        ){
            Image(
                painter = painterResource(id = R.drawable.android_logo ),
                contentDescription = "1",
                modifier = Modifier
                    .size(120.dp)
                    .background(Color("#013220".toColorInt()))
            )
            Text(
                text = "Jennifer Doe",
                fontSize = 34.sp,
            )
            Text(
                text = "Android Developer Extraordinaire",
                fontSize = 16.sp,
                color = Color("#006600".toColorInt() )
            )
        }
        Column(
            modifier = Modifier
                .padding(bottom = 45.dp)
                .weight(1f),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row() {
                Column (
                    horizontalAlignment = Alignment.End,
                    modifier = Modifier
                        .fillMaxWidth(0.12f)
                        .padding( end = 20.dp)
                ){
                    Image(
                        painter = painterResource(id = R.drawable.phone_call_48 ),
                        contentDescription = "1",
                        modifier = Modifier
                            .size(35.dp)
                            .padding( bottom = 10.dp)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.share_48 ),
                        contentDescription = "1",
                        modifier = Modifier
                            .size(35.dp)
                            .padding( bottom = 10.dp)
                    )
                    Image(
                        painter = painterResource(id = R.drawable.envelope_48 ),
                        contentDescription = "1",
                        modifier = Modifier
                            .size(35.dp)
                    )
                }
                Column (
                    horizontalAlignment = Alignment.Start,
                ){
                    Text(
                        text = "+11 (123) 444 555 666",
                        fontSize = 18.sp,
                        modifier = Modifier
                            .padding( bottom = 10.dp)
                    )
                    Text(
                        text = "@AndroidDev",
                        fontSize = 18.sp,
                        modifier = Modifier
                            .padding( bottom = 10.dp)
                    )
                    Text(
                        text = "jen.doe@android.com",
                        fontSize = 18.sp,
                        modifier = Modifier
                            .padding( bottom = 10.dp)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Assignment01Theme {
        MainPicture()
    }
}