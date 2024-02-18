package org.example.myjavalibrary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.socket.server.support.WebSocketHandlerAdapter;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;
import org.springframework.web.socket.WebSocketHandler;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class MyJavaLibraryApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyJavaLibraryApplication.class, args);
    }
}
