package javaoopinlesson8_hw;

import io.qameta.allure.Story;
import javaoopinlesson8_hw.base.BeforeAndAfterStep;
import javaoopinlesson8_hw.page.content.TestPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@Story("Проверка отображения блоков")
@DisplayName("Страница Тест")
public class TestWebTests extends BeforeAndAfterStep {
    @FindBy(css = "[class=\"test-card__name\"]")
    private List<WebElement> testBlocks;

    @DisplayName("Проверка отображения меню страницы Тест")
    @Test

    public void pageTests() {
        TestPage testPage = ((TestPage)
                new TestPage(driver)
                        .openUrl()
//                        .closedPopUp()
        );

        testPage.checkingTestBlocks(
              "Основы программирования",
                "Факультет DevOps",
                "GU: SEO-оптимизация",
                "Факультет дизайна",
                "Разработка игр", "PHP", "Unity 3D");
    }
}