package com.template.multimodule.application;

import com.template.multimodule.service.CommonService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = "com.template.multimodule")
@RestController
@RequiredArgsConstructor
public class SampleApplication {

    private final CommonService commonService;

    @GetMapping("/")
    public String home() {
        return commonService.message();
    }

    public static void main(String[] args) {
        SpringApplication.run(SampleApplication.class, args);
    }
}
