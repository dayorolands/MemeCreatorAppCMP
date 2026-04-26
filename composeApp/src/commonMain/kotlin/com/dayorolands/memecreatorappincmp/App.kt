package com.dayorolands.memecreatorappincmp

import androidx.compose.runtime.Composable
import com.dayorolands.memecreatorappincmp.core.presentation.NavigationRoot
import com.dayorolands.memecreatorappincmp.core.theme.MemeCreatorAppTheme
import com.dayorolands.memecreatorappincmp.meme_gallery.presentation.MemeGalleryScreen
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MemeCreatorAppTheme {
        NavigationRoot()
    }
}