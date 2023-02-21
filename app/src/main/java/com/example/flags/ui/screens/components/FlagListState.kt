package com.example.flags.ui.screens.components

import com.example.flags.data.FlagsModel

data class FlagListState(
    val flags: List<FlagsModel> = emptyList()
)