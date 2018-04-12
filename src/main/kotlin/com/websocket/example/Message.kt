package com.websocket.example;

import java.util.Date;
import java.time.Instant

data class Message (
 val subject:String = "",
 val content:String = "",
 var sent:Date = Date.from(Instant.now()) ,
 var received:Date = Date.from(Instant.now())
)
