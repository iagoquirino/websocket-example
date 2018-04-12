package com.websocket.example;

import java.util.Date;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Message {

  private String subject;

  private String content;

  private Date sent;

  private Date received;

}
