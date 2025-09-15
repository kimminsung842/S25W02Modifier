package kr.ac.kumoh.s20210181.s25w02modifier

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kr.ac.kumoh.s20210181.s25w02modifier.ui.theme.S25W02ModifierTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            S25W02ModifierTheme {
                Scaffold(modifier = Modifier.fillMaxSize())
                { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    val context = LocalContext.current

    Image(
        painter = painterResource(R.drawable.image),
        contentDescription = "사자 이미지",
        modifier = modifier
            .padding(30.dp)
            .fillMaxWidth()
            .clip(RoundedCornerShape(16.dp))
            .clickable {
                Toast.makeText(
                    context,
                    "눌렸습니다",
                    Toast.LENGTH_LONG
                ).show()
            },
        contentScale = ContentScale.Crop,
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    S25W02ModifierTheme {
        Greeting("Android")
    }
}