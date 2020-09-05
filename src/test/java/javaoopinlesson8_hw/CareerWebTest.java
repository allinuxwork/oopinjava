package javaoopinlesson8_hw;

import javaoopinlesson8_hw.base.BeforeAndAfterStep;
import javaoopinlesson8_hw.page.content.CareerPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CareerWebTest extends BeforeAndAfterStep {

    @DisplayName("Проверка отображения меню страницы Карьера")
    @Test
    void checkSingInValidLogin() {
        CareerPage careerPage = ((CareerPage) new CareerPage(driver).openUrl());
//                .closedPopUp());

        careerPage.checkingDisplayedCareer("AGIMA", "Образовательный портал GeekBrains", "Superjob", "English Journey", "Wigro");

    }
}