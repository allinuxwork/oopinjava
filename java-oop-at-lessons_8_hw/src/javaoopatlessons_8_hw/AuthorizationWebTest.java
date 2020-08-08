package javaoopatlessons_8_hw;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import javaoopatlessons_8_hw.jav.base.BeforeAndAfterStep;
import javaoopatlessons_8_hw.page.sing.AuthorizationPage;

@Execution(ExecutionMode.CONCURRENT)
@Feature("Авторизация")
@Story("Проверка авторизации")
@DisplayName("Проверка авторизации")
public class AuthorizationWebTest extends BeforeAndAfterStep {

    @DisplayName("Проверка авторизации с корректными данными")
    @Test
    void events() {
        String login = "hao17583@bcaoo.com";
        String password = "hao17583";
        new AuthorizationPage(driver)
                .openUrl()
                .authorization(login, password)
                .checkNamePage("Главная");
    }

}
