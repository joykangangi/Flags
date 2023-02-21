package com.example.flags

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.flags.ui.screens.FlagList
import com.example.flags.ui.screens.components.FlagViewModel
import com.example.flags.ui.theme.FlagsTheme

class MainActivity : ComponentActivity() {
    private val viewModel: FlagViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FlagsTheme {
                val state = viewModel.uiState.collectAsState()

                Scaffold(
                    topBar = {
                        TopAppBar(title = { Text(text = stringResource(id = R.string.app_name)) })
                    },
                    floatingActionButtonPosition = FabPosition.End,
                    floatingActionButton = {
                        FloatingActionButton(
                            onClick = { viewModel.randomList() }
                        ) {
                            Icon(
                                imageVector = Icons.Default.Refresh,
                                contentDescription = stringResource(id = R.string.refresh)
                            )
                        }
                    }
                ) {
                    FlagList(
                        modifier = Modifier.padding(it),
                        flags = state.value.flags
                    )
                }
            }
        }
    }
}