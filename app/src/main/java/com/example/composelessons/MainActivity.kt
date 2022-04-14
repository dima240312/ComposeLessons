package com.example.composelessons

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.ui.Modifier
import com.example.composelessons.ui.theme.Gray100

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Gray100)
            ) {
                itemsIndexed(
                    listOf(
                        ItemRowModel(R.drawable.image_1, "Миша"),
                        ItemRowModel(R.drawable.image_2, "Егор"),
                        ItemRowModel(R.drawable.image_3, "Ярослав"),
                        ItemRowModel(R.drawable.image_4, "Антон"),
                        ItemRowModel(R.drawable.image_5, "Федя"),
                        ItemRowModel(R.drawable.image_6, "Максим"),
                    )
                ){ _, item ->
                    MyRow(item = item)
                }
            }
        }
    }
}



