package com.websocket.example;

import java.time.Instant
import java.util.Date;

data class Message (
 val subject:String,
 val content:String,
 var sent:Date = Date.from(Instant.now()),
 var received:Date = Date.from(Instant.now())
)
