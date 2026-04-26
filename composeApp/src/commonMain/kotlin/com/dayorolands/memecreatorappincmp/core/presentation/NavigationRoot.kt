package com.dayorolands.memecreatorappincmp.core.presentation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.dayorolands.memecreatorappincmp.meme_editor.presentation.MemeEditorRoot
import com.dayorolands.memecreatorappincmp.meme_gallery.presentation.MemeGalleryScreen

@Composable
fun NavigationRoot() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Route.MemeGallery
    ) {
        composable<Route.MemeGallery> {
            MemeGalleryScreen(
                onMemeTemplateSelected = { memeTemplate ->
                    navController.navigate(Route.MemeEditor(templateId = memeTemplate.id))
                }
            )
        }

        composable<Route.MemeEditor> { it ->
            val templateId = it.toRoute<Route.MemeEditor>().templateId
            val template = remember(key1 = templateId) {
                memeTemplates.first { it.id == templateId }
            }

            MemeEditorRoot(
                template = template
            )
        }
    }
}