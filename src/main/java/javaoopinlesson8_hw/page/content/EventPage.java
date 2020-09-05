package javaoopinlesson8_hw.page.content;

import javaoopinlesson8_hw.page.content.base.ContentBasePage;
import org.openqa.selenium.WebDriver;

public class EventPage  extends ContentBasePage {
    public EventPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public EventPage openUrl() {
        super.openUrl("https://geekbrains.ru/eventts");
        return this;
    }
}
