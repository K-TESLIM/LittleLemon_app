package com.example.littlelemon

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.littlelemon.ui.theme.LittleLemonTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LittleLemonTheme {
                MainComponent()
            }
        }
    }
}


@androidx.compose.runtime.Composable
fun MainComponent() {


    Column(
        Modifier
            .fillMaxWidth()
            .background(Color(0XFFF495E57)),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            text = "Little Lemon", fontSize = 32.sp,
            color = Color(0xFFF4CE14),
            modifier = Modifier.padding(start = 20.dp, top = 20.dp)
        )
        Text(
            text = stringResource(id = R.string.chicago),
            fontSize = 24.sp,
            color = Color(0xFFFFFFFF),
            modifier = Modifier.padding(start = 20.dp)
        )
        Row(
            Modifier
                .fillMaxWidth()
                .padding(20.dp), horizontalArrangement = Arrangement.Start) {
            Text(text = stringResource(id = R.string.descriptionone),
                Modifier.width(200.dp),
                color = Color.White,
                fontSize = 21.sp)

            Image(
                painter = painterResource(id = R.drawable.restaurantfoodb),
                contentDescription = "",
                Modifier.height(200.dp).clip((RoundedCornerShape(20.dp))
                )
            )
        }
        Button(
            onClick = { /*TODO*/ },
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.padding(horizontal = 20.dp),
            colors = ButtonDefaults
                .buttonColors(containerColor = Color(0XFFF4CE14))
        ) {
            Text(text = stringResource(R.string.order), color = Color.Black)
        }
    }
}