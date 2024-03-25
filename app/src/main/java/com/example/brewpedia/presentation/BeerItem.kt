package com.example.brewpedia.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.brewpedia.domain.Beer

@Composable
fun BeerItem(
    beer: Beer,
    modifier: Modifier = Modifier
) {
    Card(modifier = modifier,
      elevation = CardDefaults.cardElevation(4.dp)) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(IntrinsicSize.Max)
                .padding(16.dp)
        ) {
            AsyncImage(model = beer.imageUrl,
                contentDescription = beer.name,
                modifier = Modifier
                    .weight(1f)
                    .height(150.dp))
            Spacer(modifier = Modifier.width(16.dp))
            Column(
                verticalArrangement = Arrangement.Center,
                modifier =  Modifier.weight(3f)
                    .fillMaxSize()) {
                Text(text = beer.name,
                    style = MaterialTheme.typography.titleMedium,
                    modifier = Modifier.fillMaxWidth())

                Spacer(modifier = Modifier.height(8.dp))

                Text(text = beer.tagline,
                    fontStyle = FontStyle.Italic,
                    color = Color.LightGray,
                    modifier = Modifier.fillMaxWidth())

                Spacer(modifier = Modifier.height(8.dp))

                Text(text = beer.description,
                    modifier = Modifier.fillMaxWidth())

                Spacer(modifier = Modifier.height(8.dp))

                Text(text = "First brewed in ${beer.firstBrewed}",
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.End,
                    fontSize = 8.sp)




            }
        }

    }
    
}