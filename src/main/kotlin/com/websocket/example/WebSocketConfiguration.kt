package com.websocket.example;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketTransportRegistration;

@Configuration
@EnableWebSocketMessageBroker
open class WebSocketConfiguration : WebSocketMessageBrokerConfigurer {

    override fun registerStompEndpoints(registry:StompEndpointRegistry ) {
        registry.addEndpoint("/messages").withSockJS()
    }

    override fun configureMessageBroker(registry:MessageBrokerRegistry ) {
        registry.enableSimpleBroker("/topic")
        registry.setApplicationDestinationPrefixes("/ws")
    }

}
