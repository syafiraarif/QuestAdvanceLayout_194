package com.example.myuipertama

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun Praktikum1 (modifier: Modifier) {
    Box(
        modifier = Modifier
            .padding (all = 16.dp)
            .background(Color(color = 0xFF121212))
            .fillMaxSize(),
    ){
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()

        ){
            Spacer(modifier = Modifier.height(height = 40.dp))

            Image(
                painter = painterResource(id = R.drawable.syafira),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(size = 100.dp)
                    .background(Color.Gray, shape = CircleShape)
                    .padding(all = 2.dp)
            )
            Spacer(modifier = Modifier.height(height = 30.dp))

            Row (
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ){
                Box(
                    modifier = Modifier
                        .size(size = 40.dp)
                        .background(Color(color = 0xFF2A2A2A), shape = CircleShape),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.facebook),
                        contentDescription = "facebook",
                        modifier = Modifier.size(size = 20.dp)
                    )
                }
                Spacer(modifier = Modifier.width(width = 8.dp))

                Box(
                    modifier = Modifier
                        .size(size = 40.dp)
                        .background(Color(color = 0xFF2A2A2A), shape = CircleShape),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.instagram),
                        contentDescription = "instagram",
                        modifier = Modifier.size(size = 20.dp)
                    )
                }
                Spacer(modifier = Modifier.width(width = 8.dp))

                Box(
                    modifier = Modifier
                        .size(size = 40.dp)
                        .background(Color(color = 0xFF2A2A2A), shape = CircleShape),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.linkedin),
                        contentDescription = "instagram",
                        modifier = Modifier.size(size = 20.dp)
                    )
                }


            }
        }
    }
}
