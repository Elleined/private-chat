package com.elleined.privatechat.dto;

import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

public record APIResponse (
        HttpStatus status,
        String message,
        LocalDateTime timeStamp
) {
}
