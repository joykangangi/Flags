package com.example.flags.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.flags.R
import com.example.flags.data.FlagsModel

@Composable
fun FlagItem(modifier: Modifier = Modifier, flagsModel: FlagsModel) {

    Card(
        modifier = modifier.fillMaxWidth().padding(12.dp),
        shape = RoundedCornerShape(8.dp),
        elevation = 8.dp
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(4.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = flagsModel.flagImageId),
                contentDescription = stringResource(id = R.string.flgImg),
                modifier = modifier.size(100.dp)
            )

            Text(text = stringResource(id = flagsModel.flagNameId), fontSize = 20.sp)
        }

    }
}