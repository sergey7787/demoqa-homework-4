package com.demoqa;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

        public class TestAutomationPracticeForm {

            @BeforeAll
            static void configure() {
                Configuration.browserSize = "1920x1080";
                Configuration.browserPosition = "0x0";
                Configuration.baseUrl = "https://demoqa.com";
            }

            @Test
            void studentRegistrationFormTest(){
                open("/automation-practice-form");
                $ ("#firstName").setValue("Юзер");
                $ ("#lastName").setValue("Юзерович");

            }

}
