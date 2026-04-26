@file:OptIn(ExperimentalMaterial3Api::class)

package com.dayorolands.memecreatorappincmp.meme_gallery.presentation

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import com.dayorolands.memecreatorappincmp.core.presentation.MemeTemplate
import memecreatorappincmp.composeapp.generated.resources.Res
import memecreatorappincmp.composeapp.generated.resources.meme_templates
import org.jetbrains.compose.resources.stringResource

@Composable
fun MemeGalleryScreen(
    onMemeTemplateSelected : (MemeTemplate) -> Unit = {}
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = stringResource(Res.string.meme_templates)
                    )
                }
            )
        }
    ) {

    }
}