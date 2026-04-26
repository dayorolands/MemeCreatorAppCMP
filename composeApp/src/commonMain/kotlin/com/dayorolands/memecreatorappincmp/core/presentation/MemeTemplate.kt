package com.dayorolands.memecreatorappincmp.core.presentation

import memecreatorappincmp.composeapp.generated.resources.Res
import memecreatorappincmp.composeapp.generated.resources.allDrawableResources
import org.jetbrains.compose.resources.DrawableResource

data class MemeTemplate(
    val id: String,
    val drawable: DrawableResource
)

val memeTemplate = Res
    .allDrawableResources
    .filterKeys { it.startsWith("meme_template") }
    .map { (key, value) ->
        MemeTemplate(
            id = key,
            drawable = value
        )
    }
