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
import com.builtwithpaper.Text
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.layout.Row
import androidx.compose.ui.draw.clip
import androidx.compose.foundation.shape.RoundedCornerShape
import com.builtwithpaper.LocalCornerRadius
import androidx.compose.foundation.Image
import coil3.compose.rememberAsyncImagePainter
import androidx.compose.foundation.layout.width
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.draw.alpha
import com.builtwithpaper.PrimaryButton
import com.builtwithpaper.LocalPrimaryColor
import com.composables.icons.lucide.LucideIcon
import com.builtwithpaper.BottomNavigation
import androidx.compose.foundation.layout.heightIn
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.zIndex
import com.builtwithpaper.LocalSurfaceColor
import com.builtwithpaper.currentScreenWidthBreakpoint
import com.builtwithpaper.isAtLeast
import com.builtwithpaper.ScreenWidthBreakpoint
import com.builtwithpaper.LocalOnSurfaceColor
import com.builtwithpaper.TabItem

@Composable
fun Settings() {
    val breakpoint = currentScreenWidthBreakpoint()

    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxSize().background(LocalBackgroundColor.current)) {
        val breakpoint = currentScreenWidthBreakpoint()

        CompositionLocalProvider(LocalContentColor provides LocalOnBackgroundColor.current) {
            TopAppBar(
                modifier = Modifier.height(56.dp).fillMaxWidth(),
                title = {
                    Text("Settings", modifier = Modifier.padding(top = 0.dp, end = 0.dp, bottom = 0.dp, start = 12.dp), fontSize = 24.sp, fontWeight = FontWeight(700), maxLines = 99)
                },
                contentColor = LocalContentColor.current,
                backgroundColor = Color.Unspecified,
                contentPadding = PaddingValues(start = 0.dp, top = 4.dp, end = 0.dp, bottom = 4.dp)
            )
            Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Bottom, modifier = Modifier.widthIn(max = 600.dp).fillMaxWidth().weight(weight = 1f, fill = false).fillMaxHeight().padding(top = 16.dp, end = 16.dp, bottom = 0.dp, start = 16.dp)) {
                Column(modifier = Modifier.widthIn(max = 600.dp).fillMaxWidth().weight(weight = 1f, fill = false).fillMaxHeight().verticalScroll(rememberScrollState()).padding(top = 16.dp, end = 0.dp, bottom = 16.dp, start = 0.dp)) {
                    Row(horizontalArrangement = Arrangement.spacedBy(16.dp), verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth().clip(RoundedCornerShape(LocalCornerRadius.current)).padding(top = 16.dp, end = 0.dp, bottom = 16.dp, start = 0.dp)) {
                        Image(rememberAsyncImagePainter("https://images.unsplash.com/photo-1499996860823-5214fcc65f8f?q=80&w=3466&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"), contentDescription = "", modifier = Modifier.width(58.dp).height(58.dp).clip(RoundedCornerShape(100.dp)), contentScale = ContentScale.Crop)
                        Column(verticalArrangement = Arrangement.spacedBy(4.dp), modifier = Modifier.weight(1f, fill = false).fillMaxWidth()) {
                            Text("Daniel", modifier = Modifier.fillMaxWidth(), fontSize = 16.sp, maxLines = 99)
                            Text("+44 75 12 49384", modifier = Modifier.fillMaxWidth().alpha(0.6f), fontSize = 16.sp, maxLines = 99)
                        }
                        PrimaryButton(onClick = { /* TODO Handle this */ }, contentPadding = PaddingValues(start = 12.dp, top = 8.dp, end = 12.dp, bottom = 8.dp)) {
                            Text("Edit", fontSize = 16.sp, maxLines = 99)
                        }
                    }
                    Column(modifier = Modifier.fillMaxWidth()) {
                        Text("General", modifier = Modifier.padding(16.dp), fontSize = 16.sp, fontWeight = FontWeight(500), color = LocalPrimaryColor.current, maxLines = 99)
                        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth().clip(RoundedCornerShape(LocalCornerRadius.current))) {
                            LucideIcon("file-video", contentDescription = "", tint = LocalPrimaryColor.current, modifier = Modifier.padding(16.dp))
                            Text("Notifications", modifier = Modifier.padding(top = 16.dp, end = 0.dp, bottom = 16.dp, start = 0.dp), fontSize = 16.sp, maxLines = 99)
                        }
                        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth().clip(RoundedCornerShape(LocalCornerRadius.current))) {
                            LucideIcon("moon", contentDescription = "", tint = LocalPrimaryColor.current, modifier = Modifier.padding(16.dp))
                            Text("Appearance", modifier = Modifier.padding(top = 16.dp, end = 0.dp, bottom = 16.dp, start = 0.dp), fontSize = 16.sp, maxLines = 99)
                        }
                        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth().clip(RoundedCornerShape(LocalCornerRadius.current))) {
                            LucideIcon("lock-keyhole", contentDescription = "", tint = LocalPrimaryColor.current, modifier = Modifier.padding(16.dp))
                            Text("Privacy", modifier = Modifier.padding(top = 16.dp, end = 0.dp, bottom = 16.dp, start = 0.dp), fontSize = 16.sp, maxLines = 99)
                        }
                        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth().clip(RoundedCornerShape(LocalCornerRadius.current))) {
                            LucideIcon("cloud-cog", contentDescription = "", tint = LocalPrimaryColor.current, modifier = Modifier.padding(16.dp))
                            Text("Storage & Data", modifier = Modifier.padding(top = 16.dp, end = 0.dp, bottom = 16.dp, start = 0.dp), fontSize = 16.sp, maxLines = 99)
                        }
                        Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth().clip(RoundedCornerShape(LocalCornerRadius.current))) {
                            LucideIcon("info", contentDescription = "", tint = LocalPrimaryColor.current, modifier = Modifier.padding(16.dp))
                            Text("About", modifier = Modifier.padding(top = 16.dp, end = 0.dp, bottom = 16.dp, start = 0.dp), fontSize = 16.sp, maxLines = 99)
                        }
                    }
                }
            }
            BottomNavigation(modifier = Modifier.heightIn(56.dp).fillMaxWidth().shadow(4.dp, RectangleShape).zIndex(4f).background(if (breakpoint isAtLeast ScreenWidthBreakpoint.Small) LocalSurfaceColor.current else Color.Unspecified), contentColor = LocalOnSurfaceColor.current, backgroundColor = LocalSurfaceColor.current) {
                TabItem(selected = false, onSelected = { /* TODO Handle this */ }, modifier = Modifier.weight(1f, fill = false).fillMaxWidth().clip(RoundedCornerShape(LocalCornerRadius.current)), selectedColor = LocalPrimaryColor.current, contentColor = LocalContentColor.current) {
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
                TabItem(selected = true, onSelected = { /* TODO Handle this */ }, modifier = Modifier.weight(1f, fill = false).fillMaxWidth().clip(RoundedCornerShape(LocalCornerRadius.current)), selectedColor = LocalPrimaryColor.current, contentColor = LocalContentColor.current) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.spacedBy(space = 4.dp, alignment = Alignment.CenterVertically), modifier = Modifier.fillMaxWidth()) {
                        LucideIcon("settings", contentDescription = "", tint = LocalContentColor.current)
                        Text("Settings", fontSize = 16.sp, maxLines = 99)
                    }
                }
            }
        }
    }
}

