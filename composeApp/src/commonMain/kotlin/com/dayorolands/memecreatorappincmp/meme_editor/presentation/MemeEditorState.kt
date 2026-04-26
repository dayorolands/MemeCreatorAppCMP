package com.dayorolands.memecreatorappincmp.meme_editor.presentation

import androidx.compose.ui.unit.IntSize

data class MemeEditorState(
    val templateSize: IntSize = IntSize.Zero,
    val isLeavingWithoutSaving: Boolean = false,
    val textBoxInteractionState: TextBoxInteractionState = TextBoxInteractionState.None,
    val memeText: List<MemeText> = emptyList()
)

sealed interface TextBoxInteractionState {
    data object None: TextBoxInteractionState
    data class Selected(val textBoxId: String)
    data class Editing(val textBoxId: String)
}