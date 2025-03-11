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
import com.builtwithpaper.TopAppBar
import androidx.compose.foundation.layout.height
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.fillMaxWidth
import com.builtwithpaper.GhostButton
import androidx.compose.foundation.layout.PaddingValues
import com.composables.icons.lucide.LucideIcon
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.ui.draw.clip
import androidx.compose.foundation.shape.RoundedCornerShape
import com.builtwithpaper.LocalCornerRadius
import com.builtwithpaper.Text
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.Image
import coil3.compose.rememberAsyncImagePainter
import androidx.compose.ui.layout.ContentScale
import com.builtwithpaper.LocalSurfaceColor
import com.builtwithpaper.LocalOnSurfaceColor
import com.builtwithpaper.LocalPrimaryColor
import com.builtwithpaper.LocalOnPrimaryColor
import androidx.compose.ui.draw.alpha
import com.builtwithpaper.Card
import com.builtwithpaper.TextField
import androidx.compose.ui.text.TextStyle

@Composable
fun Conversation() {
    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxSize().background(LocalBackgroundColor.current)) {
        CompositionLocalProvider(LocalContentColor provides LocalOnBackgroundColor.current) {
            TopAppBar(
                modifier = Modifier.height(56.dp).fillMaxWidth(),
                navigation = {
                    GhostButton(onClick = { /* TODO Handle this */ }, contentPadding = PaddingValues(8.dp)) {
                        LucideIcon("arrow-left", contentDescription = "", tint = LocalContentColor.current)
                    }
                },
                title = {
                    Column(verticalArrangement = Arrangement.Center, modifier = Modifier.fillMaxSize().clip(RoundedCornerShape(LocalCornerRadius.current))) {
                        Text("Kim", fontSize = 16.sp, maxLines = 99)
                    }
                },
                backgroundColor = LocalBackgroundColor.current,
                contentPadding = PaddingValues(4.dp)
            )
            LazyColumn(verticalArrangement = Arrangement.spacedBy(8.dp), contentPadding = PaddingValues(start = 0.dp, top = 16.dp, end = 0.dp, bottom = 16.dp), modifier = Modifier.widthIn(max = 600.dp).fillMaxWidth().weight(weight = 1f, fill = false).fillMaxHeight()) {
                item {
                    Row(horizontalArrangement = Arrangement.spacedBy(8.dp), verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth().padding(top = 0.dp, end = 16.dp, bottom = 0.dp, start = 16.dp)) {
                        Box(contentAlignment = Alignment.Center, modifier = Modifier.width(44.dp).height(44.dp).clip(RoundedCornerShape(100.dp))) {
                            Text("K", fontSize = 16.sp, maxLines = 99)
                            Image(rememberAsyncImagePainter("https://images.unsplash.com/photo-1494790108377-be9c29b29330?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=256&q=80"), contentDescription = "Kim's Photo", modifier = Modifier.fillMaxSize(), contentScale = ContentScale.Crop)
                        }
                        Column(modifier = Modifier.clip(RoundedCornerShape(LocalCornerRadius.current)).background(LocalSurfaceColor.current).padding(top = 14.dp, end = 16.dp, bottom = 14.dp, start = 16.dp)) {
                            CompositionLocalProvider(LocalContentColor provides LocalOnSurfaceColor.current) {
                                Text("Looking forward to the trip.", fontSize = 16.sp, maxLines = 99)
                            }
                        }
                    }
                }
                item {
                    Row(horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.End), verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth().padding(top = 0.dp, end = 16.dp, bottom = 0.dp, start = 16.dp)) {
                        Column(modifier = Modifier.clip(RoundedCornerShape(LocalCornerRadius.current)).background(LocalPrimaryColor.current).padding(top = 14.dp, end = 16.dp, bottom = 14.dp, start = 16.dp)) {
                            CompositionLocalProvider(LocalContentColor provides LocalOnPrimaryColor.current) {
                                Text("Same here! Can't wait", fontSize = 16.sp, maxLines = 99)
                            }
                        }
                    }
                }
                item {
                    Row(horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.CenterHorizontally), verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth().padding(top = 0.dp, end = 16.dp, bottom = 0.dp, start = 16.dp)) {
                        Text("Today 17:30", modifier = Modifier.alpha(0.66f), fontSize = 12.sp, maxLines = 99)
                    }
                }
                item {
                    Row(horizontalArrangement = Arrangement.spacedBy(8.dp), verticalAlignment = Alignment.Bottom, modifier = Modifier.fillMaxWidth().padding(top = 0.dp, end = 16.dp, bottom = 0.dp, start = 16.dp)) {
                        Box(contentAlignment = Alignment.Center, modifier = Modifier.width(44.dp).height(44.dp).clip(RoundedCornerShape(100.dp))) {
                            Text("K", fontSize = 16.sp, maxLines = 99)
                            Image(rememberAsyncImagePainter("https://images.unsplash.com/photo-1494790108377-be9c29b29330?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=256&q=80"), contentDescription = "Kim's Photo", modifier = Modifier.fillMaxSize(), contentScale = ContentScale.Crop)
                        }
                        Card(elevation = 0.dp, backgroundColor = LocalSurfaceColor.current, contentColor = LocalOnSurfaceColor.current, shape = RoundedCornerShape(LocalCornerRadius.current)) {
                            Column {
                                Image(rememberAsyncImagePainter("https://images.unsplash.com/photo-1506744038136-46273834b3fb?q=80&w=3540&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"), contentDescription = "Hero Image", modifier = Modifier.height(200.dp).fillMaxWidth(), contentScale = ContentScale.Crop)
                                Column(verticalArrangement = Arrangement.spacedBy(4.dp), modifier = Modifier.fillMaxWidth().padding(16.dp)) {
                                    Text("Fishing by the sea side", modifier = Modifier.fillMaxWidth(), fontSize = 16.sp, maxLines = 99)
                                    Text("Find your next dream destination", modifier = Modifier.fillMaxWidth().alpha(0.6f), maxLines = 99)
                                }
                            }
                        }
                    }
                }
                item {
                    Row(horizontalArrangement = Arrangement.spacedBy(8.dp), verticalAlignment = Alignment.Bottom, modifier = Modifier.fillMaxWidth().padding(top = 0.dp, end = 16.dp, bottom = 0.dp, start = 16.dp)) {
                        Box(contentAlignment = Alignment.Center, modifier = Modifier.width(44.dp).height(44.dp).clip(RoundedCornerShape(100.dp))) {
                            Text("K", fontSize = 16.sp, maxLines = 99)
                            Image(rememberAsyncImagePainter("https://images.unsplash.com/photo-1494790108377-be9c29b29330?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=256&q=80"), contentDescription = "Kim's Photo", modifier = Modifier.fillMaxSize(), contentScale = ContentScale.Crop)
                        }
                        Column(modifier = Modifier.clip(RoundedCornerShape(LocalCornerRadius.current)).background(LocalSurfaceColor.current).padding(top = 14.dp, end = 16.dp, bottom = 14.dp, start = 16.dp)) {
                            CompositionLocalProvider(LocalContentColor provides LocalOnSurfaceColor.current) {
                                Text("What do you think?", fontSize = 16.sp, maxLines = 99)
                            }
                        }
                    }
                }
                item {
                    Row(horizontalArrangement = Arrangement.spacedBy(space = 8.dp, alignment = Alignment.End), verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth().padding(top = 0.dp, end = 16.dp, bottom = 0.dp, start = 16.dp)) {
                        Column(modifier = Modifier.clip(RoundedCornerShape(LocalCornerRadius.current)).background(LocalPrimaryColor.current).padding(top = 14.dp, end = 16.dp, bottom = 14.dp, start = 16.dp)) {
                            CompositionLocalProvider(LocalContentColor provides LocalOnPrimaryColor.current) {
                                Text("It's perfect!", fontSize = 16.sp, maxLines = 99)
                            }
                        }
                    }
                }
            }
            Row(horizontalArrangement = Arrangement.spacedBy(4.dp), verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(16.dp)) {
                GhostButton(onClick = { /* TODO Handle this */ }, contentColor = LocalPrimaryColor.current, contentPadding = PaddingValues(12.dp)) {
                    LucideIcon("camera", contentDescription = "", tint = LocalContentColor.current)
                }
                GhostButton(onClick = { /* TODO Handle this */ }, contentColor = LocalPrimaryColor.current, contentPadding = PaddingValues(12.dp)) {
                    LucideIcon("image-play", contentDescription = "", tint = LocalContentColor.current)
                }
                TextField(value = "", onValueChange = { /* TODO Handle this */ }, modifier = Modifier.weight(1f, fill = false).fillMaxWidth(), maxLines = 5, placeholderText = "Type your message", contentPadding = PaddingValues(16.dp), contentColor = LocalOnSurfaceColor.current, backgroundColor = LocalSurfaceColor.current, borderWidth = 1.dp, shape = RoundedCornerShape(LocalCornerRadius.current), textStyle = TextStyle.Default, fontSize = 16.sp)
            }
        }
    }
}

