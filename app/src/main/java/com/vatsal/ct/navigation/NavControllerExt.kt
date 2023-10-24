package com.vatsal.ct.navigation

import androidx.navigation.NavController
import com.vatsal.core.util.UiEvent

fun NavController.navigate(event: UiEvent.Navigate) {
    this.navigate(event.route)
}