package com.example.pam

class Greeting {
    private val platform = getPlatform()

    private val nama = "Aditya Kristian Novalino"
    private val nim = "124140079"

    fun greet(): String {
        return "Halo, $nama!\n" +
                "NIM: $nim\n" +
                "Platform: ${platform.platform}"
    }
}