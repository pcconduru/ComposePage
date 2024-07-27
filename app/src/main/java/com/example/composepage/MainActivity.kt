package com.example.composepage

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.composepage.ui.theme.ComposePageTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposePageTheme {

            }
        }
    }
}

@Composable
fun PageText(title: String, t1: String, t2: String) {
    Column(modifier = Modifier){
        Text(
            text = title
        )
        Text(text = t1)
        Text(text = t2)
    }
}
@Preview(showBackground = true)
@Composable
fun PagePreview() {
    ComposePageTheme {
        PageText(title = "TEST1", t1 = "TEST2" , t2 = "TEST3")
    }
}