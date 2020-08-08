package javaoopatlessons_8_hw.page.content.base;

import io.qameta.allure.Step;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import javaoopatlessons_8_hw.block.HeaderBlock;
import javaoopatlessons_8_hw.block.LeftNavigation;
import javaoopatlessons_8_hw.page.BasePageObject;
import javaoopatlessons_8_hw.page.OpenUrl;

public abstract class ContentBasePage extends BasePageObject
	implements OpenUrl {

	@Getter
	protected LeftNavigation leftNavigation;
	@Getter
	protected HeaderBlock headerBlock;

	@FindBy(css = "div button svg[class='svg-icon icon-popup-close-button ']")
	private WebElement buttonPopUpClosed;

	public ContentBasePage(WebDriver driver) {
		super(driver);
		this.headerBlock = new HeaderBlock(driver);
		this.leftNavigation = new LeftNavigation(driver);
	}

	@Step("Закрытие Pop-UP")
	public ContentBasePage closedPopUp() {
		wait10second.until(ExpectedConditions.visibilityOf(buttonPopUpClosed));
		if (buttonPopUpClosed.isDisplayed()) {
			this.buttonPopUpClosed.click();
		}
		return this;
	}

	/**
	 * Адаптер над объектом HeaderBlock После работы с методом
	 * HeaderBlock#checkNamePage(String) сайт остается на тойже странице
	 */
	public ContentBasePage checkNamePage(String exampleNamePage) {
		headerBlock.checkNamePage(exampleNamePage);
		return this;
	}

	@Step("Переход на страницу {url}")
	public BasePageObject openUrl(String url) {
		driver.get(url);
		return this;
	}

	public HeaderBlock getHeaderBlock() {
		return headerBlock;
	}

	public LeftNavigation getLeftNavigation() {
		return leftNavigation;
	}
}
