package javaoopinlesson8_hw.page.content;

import io.qameta.allure.Step;
import javaoopinlesson8_hw.page.content.base.ContentBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class CareerPage  extends ContentBasePage {

    @FindBy(xpath = "//div/*[@class=\"project__row-2__title h3\"]")
    private List<WebElement> careerMenu;

    public CareerPage(WebDriver driver) {
        super(driver);
    }

    @Step("Проверка отображения названий разделов страницы Карьера: {args}")
    public CareerPage checkingDisplayedCareer(String... args) {
        for (String text : args) {
            WebElement element = findElement(careerMenu, text);
            wait10second.until(ExpectedConditions.visibilityOf(element));
        }
        return this;
    }

    @Override
    public CareerPage openUrl() {
        super.openUrl("https://geekbrains.ru/career");
        return this;
    }
}