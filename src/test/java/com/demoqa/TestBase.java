package com.demoqa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {
    @BeforeAll
    static void configure() {
        Configuration.browserSize = "1920x1080";
        Configuration.browserPosition = "0x0";
        Configuration.baseUrl = "https://demoqa.com";
    }

    @AfterAll
    static void configureAll() {
        Configuration.holdBrowserOpen = true;
    }
}
