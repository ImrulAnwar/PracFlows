package com.imrul.pracflows.ui

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.flow

class MainViewModel : ViewModel() {
    val countDownFlow = flow<Int>{}

}