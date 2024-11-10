package dev.anupjoseph.runners;

import org.springframework.stereotype.Component;

@Component
public class WelcomeMessage {

    public String getWelcomeMessage() {
        return "Hi, welcome to my Spring Boot App!";
    }

}
