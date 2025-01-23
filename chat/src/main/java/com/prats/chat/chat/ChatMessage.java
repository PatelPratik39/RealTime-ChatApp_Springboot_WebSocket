package com.prats.chat.chat;


import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ChatMessage {

    private String content;
    private String sender;
    private MessageType type;
}
