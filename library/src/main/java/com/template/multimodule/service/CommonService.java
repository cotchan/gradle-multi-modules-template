package com.template.multimodule.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class CommonService {

    @Value("${service.message}")
    private String message;

    public String message() {
        return this.message;
    }
}
