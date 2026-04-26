package com.dayorolands.memecreatorappincmp.core.presentation

import kotlinx.serialization.Serializable

sealed interface Route {
    @Serializable
    data object MemeGallery: Route

    @Serializable
    data class MemeEditor(val templateId: String): Route
}