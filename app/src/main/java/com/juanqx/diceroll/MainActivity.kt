package com.juanqx.diceroll

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.juanqx.diceroll.ui.theme.DiceRollTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    enableEdgeToEdge()
    setContent {
      DiceRollTheme {
        DiceRollerApp()
      }
    }
  }
}

/*@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
  Text(
    text = "Hello $name!",
    modifier = modifier
  )
}*/


@Composable
fun DiceWithButtonAndImage(modifier: Modifier = Modifier) {
  Column(
    modifier = Modifier,
    horizontalAlignment = Alignment.CenterHorizontally
  ) {}
}

@Preview
@Composable
fun DiceRollerApp(){
  DiceWithButtonAndImage(modifier = Modifier
    .fillMaxSize()
    .wrapContentSize(Alignment.Center)
  )

}

/*
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
  DiceRollTheme {
    Greeting("Android")
  }
}*/
