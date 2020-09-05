package javaoopinlesson8_hw.page.sing;

import io.qameta.allure.Step;
import javaoopinlesson8_hw.page.BasePageObject;
import javaoopinlesson8_hw.page.OpenUrl;
import javaoopinlesson8_hw.page.content.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AuthorizationPage extends BasePageObject implements OpenUrl {

    @FindBy(css = "[data-testid='login-email']")
    private WebElement inputLogin;

    @FindBy(css = "[data-testid='login-password']")
    private WebElement inputPassword;

    @FindBy(css = "[data-testid='login-submit'")
    private WebElement buttonSingInd;

    public AuthorizationPage(WebDriver driver) {
        super(driver);
    }

    @Step("авторизация пользователем c логин: {login} пароль: {password}")
    public HomePage authorization(String login, String password) {
        inputLogin.sendKeys(login);
        inputPassword.sendKeys(password);
        buttonSingInd.click();
        return new HomePage(driver);
    }

    @Override
    public AuthorizationPage openUrl() {
        openUrl("https://geekbrains.ru/login");
        return this;
    }

    @Step("Переход на страницу {url}")
    private void openUrl(String url) {
        driver.get(url);
    }
}

