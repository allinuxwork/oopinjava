package javaoopinlesson8_hw.page.content;

import javaoopinlesson8_hw.block.SearchTabsBlock;
import javaoopinlesson8_hw.page.content.base.ContentBasePage;
import lombok.Getter;
import org.openqa.selenium.WebDriver;

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
