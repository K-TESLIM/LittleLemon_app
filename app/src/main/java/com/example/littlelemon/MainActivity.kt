package com.example.littlelemon

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
        Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            text = "Little Lemon", fontSize = 32.sp, color = Color(0xFFF4CE14)
        )
        Text(
            text = stringResource(id = R.string.chicago),
            fontSize = 32.sp,
            color = Color(0xFFF4CE14)
        )
        Row() {
            Button(
                onClick = { /*TODO*/ },
                border = BorderStroke(1.dp, Color.Red),
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults
                    .buttonColors(containerColor = Color.Gray)
            ) {
                Text(text = stringResource(id = R.string.order))
            }

        }
    }
}