package com.demoqa;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TestAutomationPracticeForm extends TestBase {

            @Test
            void studentRegistrationFormTest(){
                open("/automation-practice-form");
                executeJavaScript("$('footer').remove()");
                $("#firstName").setValue("Sergey");
                $("#lastName").setValue("Grigorev");
                $("#userEmail").setValue("mail@mail.ru");
                $(byText("Female")).click();
                $(byText("Other")).click();
                $("[for='gender-radio-1']").click();
                $("#userNumber").setValue("8911111111");
                $("#dateOfBirthInput").sendKeys(Keys.CONTROL + "a");
                $("#dateOfBirthInput").sendKeys("01 August 1987`" + Keys.ENTER);
                $("#subjectsInput").setValue("History").pressEnter();
                $(byText("Sports")).click();
                $(byText("Reading")).click();
                $(byText("Music")).click();
                $(byText("Sports")).click();
                $("#uploadPicture").uploadFile(new File("src/test/resources/1.jpg"));
                $("#currentAddress").setValue("Moscow");
                $("#react-select-3-input").setValue("Uttar Pradesh").pressEnter();
                $("#react-select-4-input").setValue("Agra").pressEnter();
                $("#submit").scrollTo().pressEnter();
                $("[class=table-responsive]").shouldHave(text("Sergey Grigorev"), text("mail@mail.ru"),
                text("Male"), text("8911111111"), text("01 August,1987"), text("History"),
                text("Reading, Music"), text("1.jpg"), text("Moscow"), text("Uttar Pradesh Agra"));
                }
}
