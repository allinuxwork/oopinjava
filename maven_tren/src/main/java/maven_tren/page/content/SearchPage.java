package maven_tren.page.content;

import lombok.Getter;
import org.openqa.selenium.WebDriver;

import maven_tren.block.SearchTabsBlock;
import maven_tren.page.content.base.ContentBasePage;

public class SearchPage extends ContentBasePage {

	@Getter
	private SearchTabsBlock searchTabsBlock;

	public SearchPage(WebDriver driver) {
		super(driver);
		this.searchTabsBlock = new SearchTabsBlock(driver);
	}

	@Override
	public SearchPage openUrl() {
		super.openUrl("https://geekbrains.ru/search");
		return this;
	}

	public SearchTabsBlock getSearchTabsBlock() {
		return searchTabsBlock;
	}

}
