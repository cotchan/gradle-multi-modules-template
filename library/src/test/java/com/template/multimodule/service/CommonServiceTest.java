package com.template.multimodule.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest("service.message=Hello")
class CommonServiceTest {

    @Autowired
    private CommonService commonService;

    @Test
    public void func() {
        assertThat(commonService.message()).isEqualTo("Hello");
    }

    @SpringBootApplication
    static class TestConfiguration {
    }
}