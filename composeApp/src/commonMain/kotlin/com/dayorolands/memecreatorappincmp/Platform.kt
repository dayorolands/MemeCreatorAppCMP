package com.dayorolands.memecreatorappincmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform