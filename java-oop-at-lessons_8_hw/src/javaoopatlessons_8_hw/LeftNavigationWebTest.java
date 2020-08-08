package javaoopatlessons_8_hw;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import javaoopatlessons_8_hw.jav.base.BeforeAndAfterStep;
import javaoopatlessons_8_hw.page.content.TestPage;

import static javaoopatlessons_8_hw.block.LeftNavigation.Button;

import java.util.stream.Stream;

@Feature("Навигация")
@Story("Переход на страницы")
@DisplayName("Переход на страницы")
@Execution(ExecutionMode.CONCURRENT)
public class LeftNavigationWebTest extends BeforeAndAfterStep {

    public static Stream<Button> stringProviderNotPopUp() {
        return Stream.of(
                Button.TOPICS,
                Button.EVENTS,
                Button.TESTS,
                Button.CAREER
        );
    }

    @Description("Тесты которые проверяют функционал без Pop-UP")
    @DisplayName("Нажатие на элемент навигации")
    @ParameterizedTest(name = "{index} => Нажатие на: {0}")
    @MethodSource("stringProviderNotPopUp")
    public void checkNavigationNotPopUp(Button button) {
        new TestPage(driver)
                .openUrl()
                .getLeftNavigation().clickButton(button)
                .getHeaderBlock().checkNamePage(button.getText());
    }


    @Test
    @DisplayName("Нажатие на элемент навигации")
    public void checkNavigationPopUp() {
        new TestPage(driver)
                .openUrl()
                .getLeftNavigation().clickButton(Button.POSTS)
                .closedPopUp()
                .getHeaderBlock().checkNamePage(Button.POSTS.getText());
    }
}
