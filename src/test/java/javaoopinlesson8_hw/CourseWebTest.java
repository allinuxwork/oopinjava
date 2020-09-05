package javaoopinlesson8_hw;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import javaoopinlesson8_hw.base.BeforeAndAfterStep;
import javaoopinlesson8_hw.block.ContentNavigationCourseBlock;
import javaoopinlesson8_hw.block.LeftNavigation;
import javaoopinlesson8_hw.page.content.CoursePage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

@Feature("Поиск")
@Story("Проверка отображения блоков")
@DisplayName("Страница Курсы")
@Execution(ExecutionMode.CONCURRENT)
public class CourseWebTest extends BeforeAndAfterStep {

    @DisplayName("Проверка работы фильтров")
    @Test
    void checkSingInValidLogin() {
        CoursePage coursePage = ((CoursePage) new CoursePage(driver).openUrl()
               .closedPopUp()
                .getLeftNavigation()
                .clickButton(LeftNavigation.Button.COURSES));

        coursePage.getContentNavigationCourseBlock()
                .clickTab(ContentNavigationCourseBlock.Tab.COURSES)
                .configFilter("Бесплатные", "Тестирование")
                .checkingDisplayedCourses("Тестирование ПО. Уровень 1",
                        "Тестирование ПО. Уровень 2");
    }
}
