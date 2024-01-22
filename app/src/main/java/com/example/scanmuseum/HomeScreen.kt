package com.example.scanmuseum

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.scanmuseum.ui.theme.ScanMuseumTheme

@Composable
fun HomeScreen() {
    Greeting("Android")
}
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ScanMuseumTheme {
        Greeting("Android")
    }
}