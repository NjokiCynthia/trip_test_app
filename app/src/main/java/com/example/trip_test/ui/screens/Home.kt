package com.example.trip_test.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DirectionsBus
import androidx.compose.material.icons.filled.Event
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Hotel
import androidx.compose.material.icons.filled.Luggage
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Terrain
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp

@Composable
fun Home (){
    var searchQuery by remember { mutableStateOf(TextFieldValue("")) }
    Surface (modifier = Modifier.fillMaxSize().padding(WindowInsets.systemBars.asPaddingValues()),
        color = MaterialTheme.colorScheme.background){
        Column (modifier = Modifier.padding(16.dp).fillMaxSize(),

            ){
            Text(text = "Hello 👋", style = MaterialTheme.typography.bodyLarge)
            OutlinedTextField(
                leadingIcon = { Icon(
                    imageVector = Icons.Default.Search,
                    tint = MaterialTheme.colorScheme.primary,
                    contentDescription = "Search") },
                value = searchQuery,
                onValueChange = {searchQuery = it},
                label = {Text(text= "Where are you going?",
                    style = TextStyle(color = Color.Gray))},
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(32.dp)
                )
            Box(modifier = Modifier.padding(16.dp),
                ) {
                Row(
                    modifier = Modifier.padding(16.dp),
                    horizontalArrangement = Arrangement.spacedBy(10.dp),
                    verticalAlignment = Alignment.CenterVertically
                )
                {

                    Column {
                        Icon(imageVector = Icons.Default.Hotel, contentDescription = "")
                        Text(text = "Stays")
                    }
                    Column {
                        Icon(imageVector = Icons.Default.Terrain, contentDescription = "")
                        Text(text = "Experiences")
                    }
                    Column {
                        Icon(imageVector = Icons.Default.Luggage, contentDescription = "")
                        Text(text = "Packages")
                    }
                    Column {
                        Icon(imageVector = Icons.Default.Event, contentDescription = "")
                        Text(text = "Events")
                    }
                    Column {
                        Icon(imageVector = Icons.Default.DirectionsBus, contentDescription = "")
                        Text(text = "Day Trips")
                    }
                }
            }

        }
    }

}