package javaoopinlesson8_hw.page.content;

import io.qameta.allure.Step;
import javaoopinlesson8_hw.page.content.base.ContentBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class TestPage extends ContentBasePage {

    @FindBy(css = "[class=\"test-card__name\"]")
    public List<WebElement> testBlocks;

    public TestPage(WebDriver driver) {
        super(driver);
    }

    @Step("Проверка отображения названий блоков с тестами: {args}")
    public TestPage checkingTestBlocks(String... args) {
        for (String text : args) {
            WebElement element = findElement(testBlocks, text);
            wait10second.until(ExpectedConditions.visibilityOf(element));
        }
        return this;
    }

    @Override
    public TestPage openUrl() {
        super.openUrl("https://geekbrains.ru/tests");
        return this;
    }
}
