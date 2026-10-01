package com.example.pertemuan3

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

@Composable
fun contohColumn(modifier: Modifier) {
    column(modifier = modifier.padding(top=20.dp, start = 20.dp)) {
        Text("Malam wok")
        Text("Selamat Malam")
        Text("Saya Sedang Belajar")
    }
}

