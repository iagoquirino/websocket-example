package com.websocket.example;

import java.time.Instant;
import java.util.Date;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
class WebSocketController {

  @MessageMapping("/send")
  @SendTo("/topic/messages/response")
  fun send(message : Message):Message {
    message.received = Date.from(Instant.now())
    Thread.sleep(1000L) // simulate service calls.
    message.sent = Date.from(Instant.now())
    return message
  }


}
