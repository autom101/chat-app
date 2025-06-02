package com.sameer.chat.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Message {
    private String content;
    private String sender;
    private ChatMessageType type;
}
