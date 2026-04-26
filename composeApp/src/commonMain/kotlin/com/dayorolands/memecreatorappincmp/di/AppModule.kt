package com.dayorolands.memecreatorappincmp.di

import com.dayorolands.memecreatorappincmp.meme_editor.presentation.MemeEditorViewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

val appModule = module {
    viewModelOf(::MemeEditorViewModel)
}