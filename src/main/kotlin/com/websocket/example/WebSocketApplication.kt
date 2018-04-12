package com.websocket.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.socket.config.annotation.EnableWebSocket;

@SpringBootApplication
@EnableWebSocket
open class WebSocketApplication

fun main(args: Array<String>) {
  SpringApplication.run(WebSocketApplication::class.java, *args)
}

