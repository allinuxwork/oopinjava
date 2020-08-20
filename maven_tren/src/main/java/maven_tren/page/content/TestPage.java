package maven_tren.page.content;

import org.openqa.selenium.WebDriver;

import maven_tren.page.content.base.ContentBasePage;

public class TestPage extends ContentBasePage {

    public TestPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public TestPage openUrl() {
        super.openUrl("https://geekbrains.ru/tests");
        return this;
    }
}
