package com.example.demo;

import java.time.LocalDateTime;

public class ChatMessage
{
    String from;
    LocalDateTime time;
    String message;

    public ChatMessage(String from, String message)
    {
        this.from = from;
        this.message = message;
        this.time = LocalDateTime.now();
    }

    public String getFrom() { return from; }
    public LocalDateTime getTime() { return time; }
    public String getMessage() { return message; }
}