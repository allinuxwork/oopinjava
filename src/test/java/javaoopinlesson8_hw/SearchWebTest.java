package javaoopinlesson8_hw;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import javaoopinlesson8_hw.base.BeforeAndAfterStep;
import javaoopinlesson8_hw.block.SearchTabsBlock;
import javaoopinlesson8_hw.page.content.TestPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.Matchers.*;

@Feature("Поиск")
@Story("Проверка отображения блоков")
@DisplayName("Проверка отображения блоков")
@Execution(ExecutionMode.CONCURRENT)
public class SearchWebTest extends BeforeAndAfterStep {

    @BeforeEach
    void beforeSearchTest() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @DisplayName("Проверка количества контента")
    @Test
    void searchTest() {
        new TestPage(driver).openUrl().getHeaderBlock().searchText("java")
                .getSearchTabsBlock()
                .checkCount(SearchTabsBlock.Tab.PROFESSIONS,
                        greaterThanOrEqualTo(3))
                .checkCount(SearchTabsBlock.Tab.COURSES, greaterThan(7))
                .checkCount(SearchTabsBlock.Tab.WEBINARS,
                        allOf(greaterThan(180), lessThan(300)))
                .checkCount(SearchTabsBlock.Tab.BLOGS, greaterThan(300))
                .checkCount(SearchTabsBlock.Tab.FORUMS, not(350))
                .checkCount(SearchTabsBlock.Tab.TESTS, not(0));
    }
}
