package com.websocket.example;

import java.time.Instant;
import java.util.Date;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketController {

  @MessageMapping("/send")
  @SendTo("/topic/messages/response")
  public Message send(Message message) throws Exception{
    message.setReceived(Date.from(Instant.now()));

    Thread.sleep(1000L); // simulate service calls.

    message.setSent(Date.from(Instant.now()));
    return message;
  }


}
