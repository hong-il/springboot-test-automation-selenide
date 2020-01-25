package test.automation.selenide.mobile;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;

public class GooglePage {

    public void search(String query) {
        $(byName("q")).setValue(query).pressEnter();
    }
}
