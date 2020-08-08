package javaoopatlessons_8_hw;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import io.qameta.allure.Story;

import javaoopatlessons_8_hw.jav.base.BeforeAndAfterStep;
import javaoopatlessons_8_hw.page.content.PostPage;

@Story("Проверка отображения блоков")
@DisplayName("Страница Блог")
@Execution(ExecutionMode.CONCURRENT)

public class BlogWebTest extends BeforeAndAfterStep {

	@DisplayName("Проверка отображения меню страницы Блог")
	@Test
	void checkSingInValidLogin() {
		PostPage postPage = ((PostPage) new PostPage(driver).openUrl()
			.closedPopUp());

		postPage.checkingDisplayedPosts("Программирование", "Маркетинг",
			"Дизайн", "Управление", "Истории студентов", "GeekUniversity");

	}
}