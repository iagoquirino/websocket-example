package com.websocket.example;

import java.util.Date;

data class Message (
 val subject:String,
 val content:String,
 var sent:Date,
 var received:Date
)
