package com.abel.programacion2

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform