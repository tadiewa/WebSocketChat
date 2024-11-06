/**
 * @author : tadiewa
 * date: 11/5/2024
 */


package com.tadiew.chat;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChatMessage {

    private String content;
    private String sender;
    private MessageType type;
}

