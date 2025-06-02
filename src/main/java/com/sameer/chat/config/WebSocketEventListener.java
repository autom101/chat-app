package com.sameer.chat.config;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.messaging.SessionDisconnectEvent;

import java.util.logging.Logger;

@Component
@RequiredArgsConstructor
public class WebSocketEventListener {
    private static final Logger logger = Logger.getLogger(String.valueOf(WebSocketEventListener.class));

    @EventListener
    public void handleWebSocketDisconnectListener(SessionDisconnectEvent event) {
        logger.info("User disconnected");
    }
}
