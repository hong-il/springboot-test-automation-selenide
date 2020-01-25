package test.automation.selenide.mobile;

import org.junit.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class GooglePageTest {

    @Test
    public void searchTest() {
        open("http://www.google.com");
        new GooglePage().search("github hong-il");

        $$("h3").shouldHave(sizeGreaterThan(1));
        $$("h3").get(0).shouldHave(text("hong-il"));

        sleep(1000);
    }
}
