package com.azrinurvani.cmp_data_store

import androidx.compose.runtime.remember
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() {
    val prefs = createDataStore {
        DATA_STORE_FILE_NAME
    }
    application {
        Window(
            onCloseRequest = ::exitApplication,
            title = "CMP-Data-Store",
        ) {
            App(
                prefs = prefs
            )
        }
    }
}