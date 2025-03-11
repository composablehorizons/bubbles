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
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.draw.clip
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.zIndex
import com.builtwithpaper.LocalSurfaceColor
import com.builtwithpaper.LocalOnSurfaceColor
import com.composables.icons.lucide.LucideIcon
import com.builtwithpaper.TextField
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.width
import com.builtwithpaper.Text
import androidx.compose.foundation.Image
import coil3.compose.rememberAsyncImagePainter
import androidx.compose.ui.layout.ContentScale
import com.builtwithpaper.LocalPrimaryColor

@Composable
fun Search() {
    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxSize().background(LocalBackgroundColor.current)) {
        CompositionLocalProvider(LocalContentColor provides LocalOnBackgroundColor.current) {
            Column(verticalArrangement = Arrangement.spacedBy(16.dp), modifier = Modifier.widthIn(max = 600.dp).padding(16.dp)) {
                Row(horizontalArrangement = Arrangement.spacedBy(16.dp), verticalAlignment = Alignment.CenterVertically, modifier = Modifier.height(56.dp).fillMaxWidth().clip(RoundedCornerShape(100.dp)).shadow(4.dp, RoundedCornerShape(100.dp)).zIndex(4f).background(LocalSurfaceColor.current).padding(top = 0.dp, end = 8.dp, bottom = 0.dp, start = 16.dp)) {
                    CompositionLocalProvider(LocalContentColor provides LocalOnSurfaceColor.current) {
                        LucideIcon("search", contentDescription = "", tint = LocalContentColor.current)
                        TextField(value = "", onValueChange = { /* TODO Handle this */ }, modifier = Modifier.weight(1f, fill = false).fillMaxWidth(), maxLines = 1, placeholderText = "Search...", contentPadding = PaddingValues(start = 8.dp, top = 12.dp, end = 8.dp, bottom = 12.dp), textStyle = TextStyle.Default, fontSize = 16.sp)
                        Row {
                        }
                    }
                }
                Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxWidth().horizontalScroll(rememberScrollState())) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.spacedBy(8.dp), modifier = Modifier.padding(16.dp)) {
                        Box(contentAlignment = Alignment.Center, modifier = Modifier.width(58.dp).height(58.dp).clip(RoundedCornerShape(100.dp))) {
                            Text("K", fontSize = 16.sp, maxLines = 99)
                            Image(rememberAsyncImagePainter("https://images.unsplash.com/photo-1544725176-7c40e5a71c5e?q=80&w=3534&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"), contentDescription = "", modifier = Modifier.fillMaxSize(), contentScale = ContentScale.Crop)
                        }
                        Text("Jenny", fontSize = 16.sp, maxLines = 99)
                    }
                    Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.spacedBy(8.dp), modifier = Modifier.padding(16.dp)) {
                        Box(contentAlignment = Alignment.Center, modifier = Modifier.width(58.dp).height(58.dp).clip(RoundedCornerShape(100.dp))) {
                            Text("K", fontSize = 16.sp, maxLines = 99)
                            Image(rememberAsyncImagePainter("https://images.unsplash.com/photo-1599566147214-ce487862ea4f?q=80&w=3347&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"), contentDescription = "", modifier = Modifier.fillMaxSize(), contentScale = ContentScale.Crop)
                        }
                        Text("Peter", fontSize = 16.sp, maxLines = 99)
                    }
                    Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.spacedBy(8.dp), modifier = Modifier.padding(16.dp)) {
                        Box(contentAlignment = Alignment.Center, modifier = Modifier.width(58.dp).height(58.dp).clip(RoundedCornerShape(100.dp))) {
                            Text("K", fontSize = 16.sp, maxLines = 99)
                            Image(rememberAsyncImagePainter("https://images.unsplash.com/photo-1517841905240-472988babdf9?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=256&q=80"), contentDescription = "", modifier = Modifier.fillMaxSize(), contentScale = ContentScale.Crop)
                        }
                        Text("Naomi", fontSize = 16.sp, maxLines = 99)
                    }
                    Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.spacedBy(8.dp), modifier = Modifier.padding(16.dp)) {
                        Box(contentAlignment = Alignment.Center, modifier = Modifier.width(58.dp).height(58.dp).clip(RoundedCornerShape(100.dp))) {
                            Text("K", fontSize = 16.sp, maxLines = 99)
                            Image(rememberAsyncImagePainter("https://images.unsplash.com/photo-1544005313-94ddf0286df2?q=80&w=3388&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"), contentDescription = "", modifier = Modifier.fillMaxSize(), contentScale = ContentScale.Crop)
                        }
                        Text("Petra", fontSize = 16.sp, maxLines = 99)
                    }
                }
                Column(modifier = Modifier.fillMaxWidth()) {
                    Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth()) {
                        LucideIcon("file-image", contentDescription = "", tint = LocalPrimaryColor.current, modifier = Modifier.padding(16.dp))
                        Text("Photos", modifier = Modifier.padding(top = 16.dp, end = 0.dp, bottom = 16.dp, start = 0.dp), fontSize = 16.sp, maxLines = 99)
                    }
                    Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth()) {
                        LucideIcon("file-video", contentDescription = "", tint = LocalPrimaryColor.current, modifier = Modifier.padding(16.dp))
                        Text("Videos", modifier = Modifier.padding(top = 16.dp, end = 0.dp, bottom = 16.dp, start = 0.dp), fontSize = 16.sp, maxLines = 99)
                    }
                    Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth()) {
                        LucideIcon("headphones", contentDescription = "", tint = LocalPrimaryColor.current, modifier = Modifier.padding(16.dp))
                        Text("Music", modifier = Modifier.padding(top = 16.dp, end = 0.dp, bottom = 16.dp, start = 0.dp), fontSize = 16.sp, maxLines = 99)
                    }
                    Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth()) {
                        LucideIcon("globe", contentDescription = "", tint = LocalPrimaryColor.current, modifier = Modifier.padding(16.dp))
                        Text("Links", modifier = Modifier.padding(top = 16.dp, end = 0.dp, bottom = 16.dp, start = 0.dp), fontSize = 16.sp, maxLines = 99)
                    }
                }
            }
        }
    }
}

