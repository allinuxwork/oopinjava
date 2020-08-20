package maven_tren.page.sing;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import maven_tren.page.BasePageObject;
import maven_tren.page.OpenUrl;
import maven_tren.page.content.HomePage;

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

