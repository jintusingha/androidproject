package com.jintu.practice.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


@Composable
fun firstscreen(){
    Box(modifier = Modifier.fillMaxSize()){
        Text(text = "hello this is screen 1")
    }
}