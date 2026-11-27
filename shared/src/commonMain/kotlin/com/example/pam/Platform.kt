package com.example.pam

interface Platform {
    val platform: String
}

expect fun getPlatform(): Platform