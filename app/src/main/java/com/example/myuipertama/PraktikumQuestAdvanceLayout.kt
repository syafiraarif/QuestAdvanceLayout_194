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
            .fillMaxSize()
            .background(Color.White)
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
                    .padding( top = 40.dp)
                    .size(size = 120.dp)
                    .clip(CircleShape)
                    .background(Color.LightGray, CircleShape)
            )
            Spacer(modifier = Modifier.height(height = 10.dp))

            Row (
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ){
                Image(
                    painter = painterResource(id = R.drawable.facebook),
                    contentDescription = "facebook",
                    modifier = Modifier
                        .size(size = 50.dp)
                        . clip(CircleShape)
                )
                Spacer(modifier = Modifier.width(width = 8.dp))

                Image(
                    painter = painterResource(id = R.drawable.instagram),
                    contentDescription = "instagram",
                    modifier = Modifier
                        .size(size = 60.dp)
                        .clip(CircleShape)
                )
                Spacer(modifier = Modifier.width(width = 8.dp))

                Image(
                    painter = painterResource(id = R.drawable.github),
                    contentDescription = "github",
                    modifier = Modifier
                        .size(size = 55.dp)
                        .clip(CircleShape)
                )
                Spacer(modifier = Modifier.width(width = 8.dp))

                Image(
                    painter = painterResource(id = R.drawable.linkedin),
                    contentDescription = "linkedin",
                    modifier = Modifier
                        .size(size = 45.dp)
                        .clip(CircleShape)
                )
            }
            Spacer(modifier = Modifier.height(height = 15.dp))

            Text(
                text = stringResource(id = R.string.nama),
                fontWeight = FontWeight.Bold,
                fontSize = 25.sp,
                color = Color.Black
            )
            Spacer(modifier = Modifier.height(height = 5.dp))

            Text(
                text = stringResource(id = R.string.username),
                fontSize = 18.sp,
                color = Color.DarkGray
            )
            Spacer(modifier = Modifier.height(height = 15.dp))

            Text(
                text = stringResource(id = R.string.deskripsi),
                color = Color.Black,
                textAlign = TextAlign.Center,
                fontSize = 20.sp
            )
            Spacer(modifier = Modifier.height(height = 15.dp))

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp, horizontal = 16.dp),
                shape = RoundedCornerShape(size = 20.dp),
                colors = CardDefaults.cardColors(containerColor = Color.Gray)
            ) {
                Row(
                    modifier = Modifier
                        .padding(all = 16.dp)
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.privasi),
                        contentDescription = null,
                        modifier = Modifier
                            .size(size = 50.dp)
                            .clip(CircleShape)
                    )
                    Spacer(modifier = Modifier.width(width = 15.dp))

                    Text(
                        text = stringResource(id = R.string.privasi),
                        fontSize = 22.sp,
                        color = Color.Black
                    )
                    Spacer(modifier = Modifier.width(width = 165.dp))

                    Image(
                        painter = painterResource(id = R.drawable.play),
                        contentDescription = null,
                        modifier = Modifier
                            .size(size = 30.dp)
                            .clip(CircleShape)
                    )
                }
            }
            Spacer(modifier = Modifier.height(height = 2.dp))

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp, horizontal = 16.dp),
                shape = RoundedCornerShape(size = 20.dp),
                colors = CardDefaults.cardColors(containerColor = Color.Gray)
            ) {
                Row(
                    modifier = Modifier
                        .padding(all = 16.dp)
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.riwayat),
                        contentDescription = null,
                        modifier = Modifier
                            .size(size = 50.dp)
                            .clip(CircleShape)
                    )
                    Spacer(modifier = Modifier.width(width = 15.dp))

                    Text(
                        text = stringResource(id = R.string.riwayat),
                        fontSize = 22.sp,
                        color = Color.Black
                    )
                    Spacer(modifier = Modifier.width(width = 53.dp))

                    Image(
                        painter = painterResource(id = R.drawable.play),
                        contentDescription = null,
                        modifier = Modifier
                            .size(size = 30.dp)
                            .clip(CircleShape)
                    )
                }
            }
            Spacer(modifier = Modifier.height(height = 2.dp))

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp, horizontal = 16.dp),
                shape = RoundedCornerShape(size = 20.dp),
                colors = CardDefaults.cardColors(containerColor = Color.Gray)
            ) {
                Row(
                    modifier = Modifier
                        .padding(all = 16.dp)
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.pengatuaran),
                        contentDescription = null,
                        modifier = Modifier
                            .size(size = 45.dp)
                            .clip(CircleShape)
                    )
                    Spacer(modifier = Modifier.width(width = 15.dp))

                    Text(
                        text = stringResource(id = R.string.pengaturan),
                        fontSize = 22.sp,
                        color = Color.Black
                    )
                    Spacer(modifier = Modifier.width(width = 125.dp))

                    Image(
                        painter = painterResource(id = R.drawable.play),
                        contentDescription = null,
                        modifier = Modifier
                            .size(size = 30.dp)
                            .clip(CircleShape)
                    )
                }
            }
            Box(
                modifier = Modifier
                    .fillMaxSize()
            ) {
                Text(
                    text = stringResource(id = R.string.milik) ,
                    color = Color.Black,
                    modifier = Modifier
                        .align (Alignment.BottomCenter)
                        .padding(bottom = 50.dp)
                )
            }
        }
    }
}
