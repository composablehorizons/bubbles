package com.example

import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Column
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.background
import com.builtwithpaper.LocalSurfaceColor
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.rememberScrollState
import com.builtwithpaper.LocalOnSurfaceColor
import androidx.compose.runtime.CompositionLocalProvider
import com.builtwithpaper.LocalContentColor
import com.builtwithpaper.TopAppBar
import androidx.compose.foundation.layout.height
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.fillMaxWidth
import com.builtwithpaper.GhostButton
import androidx.compose.foundation.layout.PaddingValues
import com.composables.icons.lucide.LucideIcon
import com.builtwithpaper.Text
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import com.builtwithpaper.SecondaryButton
import com.builtwithpaper.LocalOnSecondaryColor
import com.builtwithpaper.LocalSecondaryColor
import androidx.compose.foundation.layout.Row
import com.builtwithpaper.LocalPrimaryColor
import com.builtwithpaper.TextField
import androidx.compose.foundation.shape.RoundedCornerShape
import com.builtwithpaper.LocalCornerRadius
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.draw.alpha

@Composable
fun AddContact() {
    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxSize().background(LocalSurfaceColor.current).verticalScroll(rememberScrollState())) {
        CompositionLocalProvider(LocalContentColor provides LocalOnSurfaceColor.current) {
            TopAppBar(
                modifier = Modifier.height(56.dp).fillMaxWidth(),
                navigation = {
                    GhostButton(onClick = { /* TODO Handle this */ }, contentPadding = PaddingValues(8.dp)) {
                        LucideIcon("arrow-left", contentDescription = "", tint = LocalContentColor.current)
                    }
                },
                title = {
                    Text("Add Contact", fontSize = 16.sp, maxLines = 99)
                },
                contentPadding = PaddingValues(4.dp)
            )
            Column(verticalArrangement = Arrangement.spacedBy(16.dp), modifier = Modifier.widthIn(max = 600.dp).fillMaxWidth().weight(weight = 1f, fill = false).fillMaxHeight().verticalScroll(rememberScrollState()).padding(16.dp)) {
                SecondaryButton(onClick = { /* TODO Handle this */ }, contentColor = LocalOnSecondaryColor.current, backgroundColor = LocalSecondaryColor.current, contentPadding = PaddingValues(start = 8.dp, top = 12.dp, end = 8.dp, bottom = 12.dp), borderColor = LocalSecondaryColor.current, modifier = Modifier.height(200.dp).fillMaxWidth()) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center, modifier = Modifier.fillMaxSize()) {
                        LucideIcon("image-plus", contentDescription = "", tint = LocalContentColor.current)
                    }
                }
                Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth()) {
                    LucideIcon("contact-round", contentDescription = "", tint = LocalPrimaryColor.current, modifier = Modifier.padding(16.dp))
                    TextField(value = "", onValueChange = { /* TODO Handle this */ }, modifier = Modifier.weight(1f, fill = false).fillMaxWidth(), maxLines = 1, placeholderText = "First name", contentPadding = PaddingValues(16.dp), borderWidth = 1.dp, shape = RoundedCornerShape(LocalCornerRadius.current), textStyle = TextStyle.Default, fontSize = 16.sp)
                }
                Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth()) {
                    LucideIcon("contact-round", contentDescription = "", tint = LocalPrimaryColor.current, modifier = Modifier.alpha(0f).padding(16.dp))
                    TextField(value = "", onValueChange = { /* TODO Handle this */ }, modifier = Modifier.weight(1f, fill = false).fillMaxWidth(), maxLines = 1, placeholderText = "Last name", contentPadding = PaddingValues(16.dp), borderWidth = 1.dp, shape = RoundedCornerShape(LocalCornerRadius.current), textStyle = TextStyle.Default, fontSize = 16.sp)
                }
                Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth()) {
                    LucideIcon("phone", contentDescription = "", tint = LocalPrimaryColor.current, modifier = Modifier.padding(16.dp))
                    TextField(value = "", onValueChange = { /* TODO Handle this */ }, modifier = Modifier.weight(1f, fill = false).fillMaxWidth(), maxLines = 1, placeholderText = "Phone number", contentPadding = PaddingValues(16.dp), borderWidth = 1.dp, shape = RoundedCornerShape(LocalCornerRadius.current), textStyle = TextStyle.Default, fontSize = 16.sp)
                }
                Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth()) {
                    LucideIcon("map-pin", contentDescription = "", tint = LocalPrimaryColor.current, modifier = Modifier.padding(16.dp))
                    TextField(value = "", onValueChange = { /* TODO Handle this */ }, modifier = Modifier.weight(1f, fill = false).fillMaxWidth(), maxLines = 1, placeholderText = "Address", contentPadding = PaddingValues(16.dp), borderWidth = 1.dp, shape = RoundedCornerShape(LocalCornerRadius.current), textStyle = TextStyle.Default, fontSize = 16.sp)
                }
                Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth()) {
                    LucideIcon("contact-round", contentDescription = "", tint = LocalPrimaryColor.current, modifier = Modifier.alpha(0f).padding(16.dp))
                    TextField(value = "", onValueChange = { /* TODO Handle this */ }, modifier = Modifier.weight(1f, fill = false).fillMaxWidth(), maxLines = 1, placeholderText = "City", contentPadding = PaddingValues(16.dp), borderWidth = 1.dp, shape = RoundedCornerShape(LocalCornerRadius.current), textStyle = TextStyle.Default, fontSize = 16.sp)
                }
                Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth()) {
                    LucideIcon("contact-round", contentDescription = "", tint = LocalPrimaryColor.current, modifier = Modifier.alpha(0f).padding(16.dp))
                    TextField(value = "", onValueChange = { /* TODO Handle this */ }, modifier = Modifier.weight(1f, fill = false).fillMaxWidth(), maxLines = 1, placeholderText = "Post code", contentPadding = PaddingValues(16.dp), borderWidth = 1.dp, shape = RoundedCornerShape(LocalCornerRadius.current), textStyle = TextStyle.Default, fontSize = 16.sp)
                }
            }
        }
    }
}

