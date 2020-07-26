package test.lesson_5_hw;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.lesson_5_hw.page.AuthorizationPage;
import test.lesson_5_hw.base.BaseWebTest;

@DisplayName("Авторизация")
public class AuthorizationWebTest extends BaseWebTest {

    @DisplayName("Успешная авторизация")
    @Test
    public void auth() {
        driver.get("https://geekbrains.ru/");
        String login = "hks47018@eoopy.com";
        String password = "hks47018";

        new AuthorizationPage(driver)
                .authorization(login,password)
                .checkNamePage("Главная");
    }
}
