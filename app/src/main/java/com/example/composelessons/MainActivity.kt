package com.example.composelessons

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.ui.Modifier
import com.example.composelessons.ui.theme.Gray100

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LazyColumn(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Gray100)
            ) {
                itemsIndexed(
                    listOf(
                        ItemRowModel(
                            R.drawable.image_1, "Миша", "test srts ertsey ert et" +
                                    "srtdys rty srty rty sdrty drty" +
                                    "drt6uy erty rety rty edtyertyert" +
                                    "re uyóey ey eutyu etyu yrt urtyu rtuy" +
                                    "rt6ui tyu tyu tyu tyu rtuy ruyrtyu rtut u t"),
                        ItemRowModel(R.drawable.image_2, "Егор", "test"),
                        ItemRowModel(R.drawable.image_3, "Ярослав", "test"),
                        ItemRowModel(R.drawable.image_4, "Антон", "test"),
                        ItemRowModel(R.drawable.image_5, "Федя", "test"),
                        ItemRowModel(R.drawable.image_6, "Максим", "test"),
                    )
                ) { _, item ->
                    MyRow(item = item)
                }
            }
        }
    }
}



