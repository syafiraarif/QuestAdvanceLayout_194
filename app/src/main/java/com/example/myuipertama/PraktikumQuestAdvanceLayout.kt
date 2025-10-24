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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

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
                        painter = painterResource(id = R.drawable.twitter),
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
            Spacer(modifier = Modifier.height(height = 16.dp))

            Text(
                text = stringResource(id = R.string.nama),
                fontWeight = FontWeight.Bold,
                fontSize = 22.sp,
                color = Color.White
            )

            Text(
                text = stringResource(id = R.string.username),
                fontSize = 14.sp,
                color = Color.Gray
            )
            Spacer(modifier = Modifier.height(height = 8.dp))

            Text(
                text = stringResource(id = R.string.deskripsi),
                color = Color(color = 0xFFDDDDDD),
                textAlign = TextAlign.Center,
                fontSize = 15.sp
            )
            Spacer(modifier = Modifier.height(height = 32.dp))

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp, horizontal = 16.dp),
                shape = RoundedCornerShape(size = 20.dp),
                colors = CardDefaults.cardColors(containerColor = Color.DarkGray)
            ) {
                Row(
                    modifier = Modifier
                        .padding(all = 16.dp)
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.privasi),
                        contentDescription = null,
                        modifier = Modifier
                            .size(size = 50.dp)
                            .clip(CircleShape)
                    )

                    Text(
                        text = stringResource(id = R.string.privasi),
                        fontSize = 22.sp,
                        fontFamily = FontFamily.Cursive,
                        color = Color.White
                    )

                    Image(
                        painter = painterResource(id = R.drawable.play),
                        contentDescription = null,
                        modifier = Modifier
                            .size(size = 45.dp)
                            .clip(CircleShape)
                    )
                }
            }

        }
    }
}
