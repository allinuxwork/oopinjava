package test.lesson_5_hw;

import java.util.stream.Stream;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import main.lesson_5_hw.page.ContentPage;
import test.lesson_5_hw.base.BaseWebTest;

@DisplayName("Д-З-5 Паттерны")
public class HomeWorkPage extends BaseWebTest {
	@BeforeEach
	public void beforeEach() {
		driver.get("https://geekbrains.ru/events");
	}

	@AfterEach
	void tearDown() {
		ContentPage contentPage = PageFactory.initElements(driver,
			ContentPage.class);

		wait15second
			.until(ExpectedConditions.visibilityOf(contentPage.getHeader()));
		wait15second
			.until(ExpectedConditions.visibilityOf(contentPage.getFooter()));
	}

//	@DisplayName("Вход")
//	@Test
//	public void posts() {
//		String namePage = "Вход";
//		ContentPage contentPage = new ContentPage(driver);
//
//		contentPage.getNavigation().getButton(namePage).click();
//		//contentPage.getButtonClosePopUp1().click();
//		//contentPage.getButtonClosePopUp2().click();
//
//		contentPage.checkNamePage(namePage);
//	}

//	@DisplayName("Нажатие на элемент навигации")
//	@ParameterizedTest
//	@MethodSource("dataProvider")
//	public void courses(String namePage) {
//		ContentPage contentPage = new ContentPage(driver);
//		contentPage.getNavigation().getButton(namePage).click();
//		contentPage.checkNamePage(namePage);
//	}
//
//	public static Stream<Arguments> dataProvider() {
//		return Stream.of(Arguments.of("Вход"), Arguments.of()
//			, Arguments.of("Главная"),
//			Arguments.of("Лицензия"), Arguments.of("Карьера"),
//             Arguments.of("Курсы", "courses")
//		);
//	}

}
