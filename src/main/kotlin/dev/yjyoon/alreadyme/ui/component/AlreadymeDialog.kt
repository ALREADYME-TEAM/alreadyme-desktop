package dev.yjyoon.alreadyme.ui.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import dev.yjyoon.alreadyme.ui.value.R

@Composable
fun AlreadymeDialog(
    message: String,
    onClose: () -> Unit
) {
    Surface(
        modifier = Modifier
            .width(480.dp)
            .wrapContentHeight(),
        color = MaterialTheme.colors.surface
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = R.string.APP_TITLE,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(24.dp)
            )
            Text(text = message)
            Spacer(modifier = Modifier.height(24.dp))
            Button(
                onClick = onClose,
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = R.color.DarkGray,
                    contentColor = R.color.White
                ),
                contentPadding = PaddingValues(vertical = 18.dp, horizontal = 28.dp)
            ) {
                Text(text = R.string.CONFIRM)
            }
        }
    }
}
