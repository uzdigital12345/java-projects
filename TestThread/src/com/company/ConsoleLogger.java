package com.company;


import java.time.LocalDateTime;

public class ConsoleLogger implements Logger {

    @Override
    public void Log(String message) {
        System.out.println(LocalDateTime.now() + ": " + message);
    }
}
