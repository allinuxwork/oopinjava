package javaoopinlesson8_hw.page.content;

import javaoopinlesson8_hw.page.content.base.ContentBasePage;
import org.openqa.selenium.WebDriver;

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
