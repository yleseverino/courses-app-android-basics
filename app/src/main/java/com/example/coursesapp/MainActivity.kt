package com.example.coursesapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coursesapp.ui.theme.CoursesAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CoursesAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MyCard()
                }
            }
        }
    }
}

@Composable
fun MyCard(modifier: Modifier = Modifier) {
    Card(
        elevation = 4.dp,
        shape = RoundedCornerShape(6.dp),
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Image(
                painter = painterResource(R.drawable.music),
                contentDescription = null,
                modifier = modifier
                    .width(68.dp)
                    .height(68.dp)
            )
            Column(
                modifier = modifier.padding(
                    top = 16.dp,
                    end = 16.dp,
                    start = 16.dp,
                    bottom = 8.dp
                )
            ) {
                Text(text = "Photography", fontSize = 12.sp, style = MaterialTheme.typography.body2)
                Row(modifier = modifier.padding(top = 8.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_grain),
                        contentDescription = null,
                        colorFilter = ColorFilter.tint(
                            Color.Black
                        ),
                        modifier = modifier
                            .padding(end = 8.dp)
                            .align(alignment = Alignment.CenterVertically)
                            .width(12.dp)
                            .aspectRatio(1f)
                    )
                    Text(text = "321", fontSize = 10.sp, style = MaterialTheme.typography.caption)
                }
            }
        }
    }
}

@Composable
private fun ListCard() {
    LazyColumn() {

    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CoursesAppTheme {
        MyCard()
    }
}