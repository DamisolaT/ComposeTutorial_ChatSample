package com.damisola.composetutorial

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.damisola.composetutorial.ui.theme.ComposeTutorialTheme

data class Message(val author: String, val body: String)
@Composable
fun Conversation(messages:List<Message>){
    LazyColumn{
        items(messages){ message ->
            MessageCard(message)

        }
    }
}

@Preview
@Composable
fun PreviewConversation(){
    ComposeTutorialTheme {
        Conversation(SampleData.conversationSample)
    }
}