package com.example.catmemepedia

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.catmemepedia.model.Cat
import com.example.catmemepedia.model.CatRepository
import com.example.catmemepedia.ui.theme.CatMemepediaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CatMemepediaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
//                    CatMemepediaApp()
                }
            }
        }
    }
}

//@Composable
//fun CatMemepediaApp() {
//    Scaffold(
//        topBar = {
//            TopAppBar()
//        }
//    ) {
//        val heroes = CatRepository.cats
//        CatList(cats = cats, Modifier.padding(it))
//    }
//}

@Composable
fun TopAppBar(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .size(56.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = stringResource(R.string.app_name),
            style = MaterialTheme.typography.h1,
        )
    }
}
@Composable
fun CatItem(cat: Cat, modifier: Modifier = Modifier) {
    
}

//@Preview("CatApp")
//@Composable
//fun CatMemepediaAppPreview() {
//    CatMemepediaTheme(darkTheme = true) {
//        CatMemepediaApp()
//    }
//}

@Preview("Light Theme")
@Preview("Dark Theme", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun CatItemPreview() {
    val cat = Cat(
        R.string.catName1,
        R.string.catDescription1,
        oneBrainCell = true,
        R.drawable.cat_1
    )
    CatMemepediaTheme {
        CatItem(cat = cat)
    }
}