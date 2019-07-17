package com.gshepur.serverless.service;

import org.springframework.stereotype.Service;


@Service
public class ReverseStringService {
    public String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}
