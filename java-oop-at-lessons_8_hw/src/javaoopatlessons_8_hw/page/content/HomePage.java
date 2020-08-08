package javaoopatlessons_8_hw.page.content;

import org.openqa.selenium.WebDriver;

import javaoopatlessons_8_hw.page.content.base.ContentBasePage;

public class HomePage extends ContentBasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public HomePage openUrl() {
        super.openUrl("https://geekbrains.ru/");
        return this;
    }
}
