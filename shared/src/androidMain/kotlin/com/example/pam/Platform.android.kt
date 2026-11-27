package com.example.pam

class AndroidPlatform : Platform {
    override val platform: String = "Android"
}

actual fun getPlatform(): Platform = AndroidPlatform()