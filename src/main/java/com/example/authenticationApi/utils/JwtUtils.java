package com.example.authenticationApi.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class JwtUtils {
    @Value("${settings.app.jwtSecret}")
    private String secretKey;
    @Value("${settings.app.jwtExpirationMs}")
    private int expirationTime;
}
