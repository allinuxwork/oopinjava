package javaoopinlesson8_hw;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import javaoopinlesson8_hw.base.BeforeAndAfterStep;
import javaoopinlesson8_hw.page.sing.AuthorizationPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

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
