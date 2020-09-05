package javaoopinlesson8_hw.page.content;

import io.qameta.allure.Step;
import javaoopinlesson8_hw.page.content.base.ContentBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class PostPage extends ContentBasePage {

	@FindBy(xpath = "//div/*[@class=\"posts-nav-btn btn \"]")
	private List<WebElement> postsMenu;

	public PostPage(WebDriver driver) {
		super(driver);
	}

	@Step("Проверка отображения названий разделов страницы Блог: {args}")
	public PostPage checkingDisplayedPosts(String... args) {
		for (String text : args) {
			WebElement element = findElement(postsMenu, text);
			wait10second.until(ExpectedConditions.visibilityOf(element));
		}
		return this;
	}

	@Override
	public PostPage openUrl() {
		super.openUrl("https://geekbrains.ru/posts");
		return this;
	}
}
