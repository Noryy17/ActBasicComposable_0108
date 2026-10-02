package com.example.pertemuan3

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun TugasLogin(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize().statusBarsPadding()) {
        Text(text = "Login")
    }
}