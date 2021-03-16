package com.example.websocketdemo.model;

import lombok.Data;

@Data
public class ChatMessage {
    private MessageTypes type;
    private String content;
    private String sender;
}