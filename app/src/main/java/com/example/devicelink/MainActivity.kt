package com.example.devicelink

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.devicelink.ui.theme.DeviceLinkTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DeviceLinkTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    DeviceDiscoveryScreen()
                }
            }
        }
    }
}

@Composable
fun DeviceDiscoveryScreen()
{
    DeviceLinkTheme {
        Surface {
            Column() {
                Row(modifier = Modifier.fillMaxWidth())
                {
                    Column(modifier = Modifier.weight(1f))
                    {
                        Text(
                            text = "DeviceLink",
                            fontSize = 24.sp,
                            fontStyle = FontStyle.Normal,
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                    Image(
                        painter = painterResource(R.drawable.outline_bluetooth_24),
                        contentDescription = "Bluetooth",
                        modifier = Modifier.align(Alignment.CenterVertically)
                    )
                }
                Row() {
                    Text(
                        text = "Discover and manage nearby devices",

                        )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DeviceDiscoveryScreenPreview() {
    DeviceDiscoveryScreen()
}