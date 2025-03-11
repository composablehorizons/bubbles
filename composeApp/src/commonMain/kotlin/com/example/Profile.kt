package com.example

import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Column
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.background
import com.builtwithpaper.LocalSurfaceColor
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
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.Image
import coil3.compose.rememberAsyncImagePainter
import androidx.compose.foundation.layout.width
import androidx.compose.ui.draw.clip
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.layout.ContentScale
import com.builtwithpaper.Text
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight
import com.builtwithpaper.LocalPrimaryColor
import androidx.compose.ui.draw.alpha
import androidx.compose.foundation.layout.Row
import com.builtwithpaper.PrimaryButton

@Composable
fun Profile() {
    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxSize().background(LocalSurfaceColor.current)) {
        CompositionLocalProvider(LocalContentColor provides LocalOnSurfaceColor.current) {
            TopAppBar(
                modifier = Modifier.height(56.dp).fillMaxWidth(),
                navigation = {
                    GhostButton(onClick = { /* TODO Handle this */ }, contentPadding = PaddingValues(8.dp)) {
                        LucideIcon("arrow-left", contentDescription = "", tint = LocalContentColor.current)
                    }
                },
                contentColor = LocalContentColor.current,
                backgroundColor = Color.Unspecified,
                contentPadding = PaddingValues(4.dp)
            )
            Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.widthIn(max = 600.dp).fillMaxWidth().weight(weight = 1f, fill = false).fillMaxHeight().verticalScroll(rememberScrollState())) {
                Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.spacedBy(8.dp), modifier = Modifier.widthIn(max = 600.dp).fillMaxWidth().padding(top = 8.dp, end = 0.dp, bottom = 8.dp, start = 0.dp)) {
                    Image(rememberAsyncImagePainter("https://images.unsplash.com/photo-1494790108377-be9c29b29330?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=256&q=80"), contentDescription = "Kim's Photo", modifier = Modifier.width(120.dp).height(120.dp).clip(RoundedCornerShape(100.dp)), contentScale = ContentScale.Crop)
                    Text("Kim", fontSize = 32.sp, fontWeight = FontWeight(500), color = LocalPrimaryColor.current, maxLines = 99)
                    Text("+44 7519 654123", modifier = Modifier.alpha(0.66f).clip(RoundedCornerShape(4.dp)), fontSize = 16.sp, maxLines = 99)
                }
                Row {
                    Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.spacedBy(8.dp), modifier = Modifier.weight(1f, fill = false).fillMaxWidth().padding(16.dp)) {
                        PrimaryButton(onClick = { /* TODO Handle this */ }, contentPadding = PaddingValues(8.dp)) {
                            LucideIcon("send", contentDescription = "", tint = LocalContentColor.current)
                        }
                        Text("Message", fontSize = 16.sp, color = LocalPrimaryColor.current, maxLines = 99)
                    }
                    Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.spacedBy(8.dp), modifier = Modifier.weight(1f, fill = false).fillMaxWidth().padding(16.dp)) {
                        PrimaryButton(onClick = { /* TODO Handle this */ }, contentPadding = PaddingValues(8.dp)) {
                            LucideIcon("phone", contentDescription = "", tint = LocalContentColor.current)
                        }
                        Text("Message", fontSize = 16.sp, color = LocalPrimaryColor.current, maxLines = 99)
                    }
                    Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.spacedBy(8.dp), modifier = Modifier.weight(1f, fill = false).fillMaxWidth().padding(16.dp)) {
                        PrimaryButton(onClick = { /* TODO Handle this */ }, contentPadding = PaddingValues(8.dp), borderWidth = 0.dp) {
                            LucideIcon("video", contentDescription = "", tint = LocalContentColor.current)
                        }
                        Text("Video", fontSize = 16.sp, color = LocalPrimaryColor.current, maxLines = 99)
                    }
                }
                Column(modifier = Modifier.fillMaxWidth()) {
                    Text("More actions", modifier = Modifier.padding(16.dp), fontSize = 16.sp, fontWeight = FontWeight(500), color = LocalPrimaryColor.current, maxLines = 99)
                    Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth()) {
                        LucideIcon("file-video", contentDescription = "", tint = LocalPrimaryColor.current, modifier = Modifier.padding(16.dp))
                        Text("View Media", modifier = Modifier.padding(top = 16.dp, end = 0.dp, bottom = 16.dp, start = 0.dp), fontSize = 16.sp, maxLines = 99)
                    }
                    Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth()) {
                        LucideIcon("search", contentDescription = "", tint = LocalPrimaryColor.current, modifier = Modifier.padding(16.dp))
                        Text("Search in conversation", modifier = Modifier.padding(top = 16.dp, end = 0.dp, bottom = 16.dp, start = 0.dp), fontSize = 16.sp, maxLines = 99)
                    }
                    Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth()) {
                        LucideIcon("bell", contentDescription = "", tint = LocalPrimaryColor.current, modifier = Modifier.padding(16.dp))
                        Text("Notifications", modifier = Modifier.padding(top = 16.dp, end = 0.dp, bottom = 16.dp, start = 0.dp), fontSize = 16.sp, maxLines = 99)
                    }
                }
            }
        }
    }
}

