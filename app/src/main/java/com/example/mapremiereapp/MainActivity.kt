package com.example.mapremiereapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mapremiereapp.ui.theme.MaPremiereAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaPremiereAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Body()
                }
            }
        }
    }
}

@Composable
fun TopImage(id: Int, modifier: Modifier) {
    Image(
        painter = painterResource(id = id),
        contentDescription = null,
        modifier = modifier,
        contentScale = ContentScale.Crop
    )
}

@Composable
fun ContactRow(id: Int, text: String) {
    Row(
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp)
    ) {
        Image(painter = painterResource(id = id), contentDescription = null)
        Text(
            text = text,
            modifier = Modifier.padding(start = 5.dp),
            style = MaterialTheme.typography.body2
        )
    }
}

@Composable
fun Body() {
    Box(modifier = Modifier.fillMaxSize()) {
        TopImage(
            id = R.drawable.background_grey,
            modifier = Modifier.fillMaxSize()
        )
        Column {
            TopImage(
                id = R.drawable.montbrouilly_n_v,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp)
            )
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(125.dp)
                    .padding(start = 16.dp, end = 16.dp)
            ) {
                Surface(
                    modifier = Modifier
                        .clip(CircleShape),
                    color = Color.Black
                ) {
                    TopImage(
                        id = R.drawable.rock_n_roll,
                        modifier = Modifier
                            .width(100.dp)
                            .height(100.dp)
                            .padding(2.dp)
                            .clip(CircleShape)
                    )
                }
                Text(
                    text = "Angelique Copere",
                    style = MaterialTheme.typography.h1
                )
            }
            Text(
                text = "Bonjour, j'ai des bases HTML, CSS, Python et Kotlin avec JetPack Compose.\nJ'aimerais dans un avenir proche, pouvoir exercer le métier de développeur Android.",
                modifier = Modifier
                    .padding(start = 16.dp, top = 30.dp, end = 16.dp, bottom = 16.dp),
                style = MaterialTheme.typography.body1
            )
            Text(
                text = "Codecademy\nUdemy\nOpenClassRoom",
                modifier = Modifier.padding(16.dp),
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(75.dp))
            ContactRow(id = R.drawable.outline_alternate_email_black_36, text = "angelique.copere@gmail.com")
            ContactRow(id = R.drawable.outline_phone_android_black_36, text = "06.63.70.48.67")
            ContactRow(id = R.drawable.icon_github, text = "Tonyac-create")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MaPremiereAppTheme {
        Body()
    }
}