package com.example

import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Column
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.background
import com.builtwithpaper.LocalBackgroundColor
import com.builtwithpaper.LocalOnBackgroundColor
import androidx.compose.runtime.CompositionLocalProvider
import com.builtwithpaper.LocalContentColor
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.widthIn
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.ui.draw.clip
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.zIndex
import com.builtwithpaper.LocalSurfaceColor
import com.builtwithpaper.LocalOnSurfaceColor
import com.composables.icons.lucide.LucideIcon
import com.builtwithpaper.Text
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.unit.sp
import com.builtwithpaper.GhostButton
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import com.builtwithpaper.LocalCornerRadius
import androidx.compose.foundation.Image
import coil3.compose.rememberAsyncImagePainter
import androidx.compose.foundation.layout.width
import androidx.compose.ui.layout.ContentScale
import com.builtwithpaper.LocalPrimaryColor
import com.builtwithpaper.LocalOnPrimaryColor
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.font.FontWeight
import com.builtwithpaper.BottomNavigation
import androidx.compose.foundation.layout.heightIn
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Color
import com.builtwithpaper.currentScreenWidthBreakpoint
import com.builtwithpaper.isAtLeast
import com.builtwithpaper.ScreenWidthBreakpoint
import com.builtwithpaper.TabItem

@Composable
fun Conversations() {
    val breakpoint = currentScreenWidthBreakpoint()

    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxSize().background(LocalBackgroundColor.current)) {
        val breakpoint = currentScreenWidthBreakpoint()

        CompositionLocalProvider(LocalContentColor provides LocalOnBackgroundColor.current) {
            Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Bottom, modifier = Modifier.widthIn(max = 600.dp).fillMaxWidth().weight(weight = 1f, fill = false).fillMaxHeight().padding(top = 16.dp, end = 16.dp, bottom = 0.dp, start = 16.dp)) {
                Row(horizontalArrangement = Arrangement.spacedBy(16.dp), verticalAlignment = Alignment.CenterVertically, modifier = Modifier.height(56.dp).fillMaxWidth().clip(RoundedCornerShape(100.dp)).shadow(4.dp, RoundedCornerShape(100.dp)).zIndex(4f).background(LocalSurfaceColor.current).padding(top = 0.dp, end = 8.dp, bottom = 0.dp, start = 16.dp)) {
                    CompositionLocalProvider(LocalContentColor provides LocalOnSurfaceColor.current) {
                        LucideIcon("search", contentDescription = "", tint = LocalContentColor.current)
                        Text("Search", modifier = Modifier.weight(1f, fill = false).fillMaxWidth().alpha(0.4f).padding(top = 12.dp, end = 8.dp, bottom = 12.dp, start = 8.dp), fontSize = 16.sp, maxLines = 99)
                        Row {
                            GhostButton(onClick = { /* TODO Handle this */ }, contentPadding = PaddingValues(8.dp)) {
                                LucideIcon("message-circle-plus", contentDescription = "", tint = LocalContentColor.current)
                            }
                        }
                    }
                }
                LazyColumn(contentPadding = PaddingValues(start = 0.dp, top = 16.dp, end = 0.dp, bottom = 16.dp), modifier = Modifier.widthIn(max = 600.dp).fillMaxWidth().weight(weight = 1f, fill = false).fillMaxHeight()) {
                    item {
                        Row(horizontalArrangement = Arrangement.spacedBy(16.dp), verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth().clip(RoundedCornerShape(LocalCornerRadius.current)).padding(8.dp)) {
                            Image(rememberAsyncImagePainter("https://images.unsplash.com/photo-1494790108377-be9c29b29330?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=256&q=80"), contentDescription = "Jenny's profile photo", modifier = Modifier.width(58.dp).height(58.dp).clip(RoundedCornerShape(100.dp)), contentScale = ContentScale.Crop)
                            Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
                                Row {
                                    Text("Kim", modifier = Modifier.weight(1f, fill = false).fillMaxWidth(), fontSize = 16.sp, maxLines = 99)
                                    Text("3min", modifier = Modifier.alpha(0.6f), fontSize = 16.sp, maxLines = 99)
                                }
                                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                                    Text("What do you think?", modifier = Modifier.weight(1f, fill = false).fillMaxWidth().alpha(0.6f), fontSize = 16.sp, maxLines = 99)
                                    Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center, modifier = Modifier.width(22.dp).height(22.dp).clip(RoundedCornerShape(100.dp)).background(LocalPrimaryColor.current)) {
                                        CompositionLocalProvider(LocalContentColor provides LocalOnPrimaryColor.current) {
                                            Text("1", modifier = Modifier.clip(RoundedCornerShape(100.dp)), textAlign = TextAlign.Center, fontSize = 12.sp, fontWeight = FontWeight(500), maxLines = 1)
                                        }
                                    }
                                }
                            }
                        }
                    }
                    item {
                        Row(horizontalArrangement = Arrangement.spacedBy(16.dp), verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth().clip(RoundedCornerShape(LocalCornerRadius.current)).padding(8.dp)) {
                            Image(rememberAsyncImagePainter("https://images.unsplash.com/photo-1599566147214-ce487862ea4f?q=80&w=3347&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"), contentDescription = "", modifier = Modifier.width(58.dp).height(58.dp).clip(RoundedCornerShape(100.dp)), contentScale = ContentScale.Crop)
                            Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
                                Row {
                                    Text("Peter", modifier = Modifier.weight(1f, fill = false).fillMaxWidth(), fontSize = 16.sp, maxLines = 99)
                                    Text("15min", modifier = Modifier.alpha(0.6f), fontSize = 16.sp, maxLines = 99)
                                }
                                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                                    Text("Isn't that swell?", modifier = Modifier.weight(1f, fill = false).fillMaxWidth().alpha(0.6f), fontSize = 16.sp, maxLines = 99)
                                    Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center, modifier = Modifier.width(22.dp).height(22.dp).clip(RoundedCornerShape(100.dp)).background(LocalPrimaryColor.current)) {
                                        CompositionLocalProvider(LocalContentColor provides LocalOnPrimaryColor.current) {
                                            Text("2", modifier = Modifier.clip(RoundedCornerShape(100.dp)), textAlign = TextAlign.Center, fontSize = 12.sp, fontWeight = FontWeight(500), maxLines = 1)
                                        }
                                    }
                                }
                            }
                        }
                    }
                    item {
                        Row(horizontalArrangement = Arrangement.spacedBy(16.dp), verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth().clip(RoundedCornerShape(LocalCornerRadius.current)).padding(8.dp)) {
                            Image(rememberAsyncImagePainter("https://images.unsplash.com/photo-1517841905240-472988babdf9?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=256&q=80"), contentDescription = "", modifier = Modifier.width(58.dp).height(58.dp).clip(RoundedCornerShape(100.dp)), contentScale = ContentScale.Crop)
                            Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
                                Row {
                                    Text("Naomi", modifier = Modifier.weight(1f, fill = false).fillMaxWidth(), fontSize = 16.sp, maxLines = 99)
                                    Text("Fri", modifier = Modifier.alpha(0.6f), fontSize = 16.sp, maxLines = 99)
                                }
                                Row {
                                    Text("Had a great time too! 😍", modifier = Modifier.weight(1f, fill = false).fillMaxWidth().alpha(0.6f), fontSize = 16.sp, maxLines = 99)
                                }
                            }
                        }
                    }
                    item {
                        Row(horizontalArrangement = Arrangement.spacedBy(16.dp), verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth().clip(RoundedCornerShape(LocalCornerRadius.current)).padding(8.dp)) {
                            Image(rememberAsyncImagePainter("https://images.unsplash.com/photo-1544005313-94ddf0286df2?q=80&w=3388&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"), contentDescription = "", modifier = Modifier.width(58.dp).height(58.dp).clip(RoundedCornerShape(100.dp)), contentScale = ContentScale.Crop)
                            Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
                                Row {
                                    Text("Petra", modifier = Modifier.weight(1f, fill = false).fillMaxWidth(), fontSize = 16.sp, maxLines = 99)
                                    Text("Wed", modifier = Modifier.alpha(0.6f), fontSize = 16.sp, maxLines = 99)
                                }
                                Row {
                                    Text("What do you think?", modifier = Modifier.weight(1f, fill = false).fillMaxWidth().alpha(0.6f), fontSize = 16.sp, maxLines = 99)
                                }
                            }
                        }
                    }
                    item {
                        Row(horizontalArrangement = Arrangement.spacedBy(16.dp), verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth().clip(RoundedCornerShape(LocalCornerRadius.current)).padding(8.dp)) {
                            Image(rememberAsyncImagePainter("https://images.unsplash.com/photo-1507003211169-0a1dd7228f2d?q=80&w=3387&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"), contentDescription = "", modifier = Modifier.width(58.dp).height(58.dp).clip(RoundedCornerShape(100.dp)), contentScale = ContentScale.Crop)
                            Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
                                Row {
                                    Text("Paolo", modifier = Modifier.weight(1f, fill = false).fillMaxWidth(), fontSize = 16.sp, maxLines = 99)
                                    Text("Wed", modifier = Modifier.alpha(0.6f), fontSize = 16.sp, maxLines = 99)
                                }
                                Row {
                                    Text("Paolo sent a photo.", modifier = Modifier.weight(1f, fill = false).fillMaxWidth().alpha(0.6f), fontSize = 16.sp, maxLines = 99)
                                }
                            }
                        }
                    }
                    item {
                        Row(horizontalArrangement = Arrangement.spacedBy(16.dp), verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth().clip(RoundedCornerShape(LocalCornerRadius.current)).padding(8.dp)) {
                            Image(rememberAsyncImagePainter("https://images.unsplash.com/photo-1607746882042-944635dfe10e?q=80&w=3540&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"), contentDescription = "Jenny's profile photo", modifier = Modifier.width(58.dp).height(58.dp).clip(RoundedCornerShape(100.dp)), contentScale = ContentScale.Crop)
                            Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
                                Row {
                                    Text("Alicia", modifier = Modifier.weight(1f, fill = false).fillMaxWidth(), fontSize = 16.sp, maxLines = 99)
                                    Text("Mon", modifier = Modifier.alpha(0.6f), fontSize = 16.sp, maxLines = 99)
                                }
                                Row {
                                    Text("Is that what really happened?", modifier = Modifier.weight(1f, fill = false).fillMaxWidth().alpha(0.6f), fontSize = 16.sp, maxLines = 1)
                                }
                            }
                        }
                    }
                }
            }
            BottomNavigation(modifier = Modifier.heightIn(56.dp).fillMaxWidth().shadow(4.dp, RectangleShape).zIndex(4f).background(if (breakpoint isAtLeast ScreenWidthBreakpoint.Small) LocalSurfaceColor.current else Color.Unspecified), contentColor = LocalOnSurfaceColor.current, backgroundColor = LocalSurfaceColor.current) {
                TabItem(selected = true, onSelected = { /* TODO Handle this */ }, modifier = Modifier.weight(1f, fill = false).fillMaxWidth().clip(RoundedCornerShape(LocalCornerRadius.current)), selectedColor = LocalPrimaryColor.current, contentColor = LocalContentColor.current) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.spacedBy(space = 4.dp, alignment = Alignment.CenterVertically), modifier = Modifier.fillMaxWidth()) {
                        LucideIcon("house", contentDescription = "", tint = LocalContentColor.current)
                        Text("Chats", fontSize = 16.sp, maxLines = 99)
                    }
                }
                TabItem(selected = false, onSelected = { /* TODO Handle this */ }, modifier = Modifier.weight(1f, fill = false).fillMaxWidth().clip(RoundedCornerShape(LocalCornerRadius.current)), selectedColor = LocalPrimaryColor.current, contentColor = LocalContentColor.current) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.spacedBy(space = 4.dp, alignment = Alignment.CenterVertically), modifier = Modifier.fillMaxWidth()) {
                        LucideIcon("contact", contentDescription = "", tint = LocalContentColor.current)
                        Text("Contacts", fontSize = 16.sp, maxLines = 99)
                    }
                }
                TabItem(selected = false, onSelected = { /* TODO Handle this */ }, modifier = Modifier.weight(1f, fill = false).fillMaxWidth().clip(RoundedCornerShape(LocalCornerRadius.current)), selectedColor = LocalPrimaryColor.current, contentColor = LocalContentColor.current) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.spacedBy(space = 4.dp, alignment = Alignment.CenterVertically), modifier = Modifier.fillMaxWidth()) {
                        LucideIcon("settings", contentDescription = "", tint = LocalContentColor.current)
                        Text("Settings", fontSize = 16.sp, maxLines = 99)
                    }
                }
            }
        }
    }
}

