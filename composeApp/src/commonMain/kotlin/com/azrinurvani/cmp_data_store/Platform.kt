package com.azrinurvani.cmp_data_store

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform