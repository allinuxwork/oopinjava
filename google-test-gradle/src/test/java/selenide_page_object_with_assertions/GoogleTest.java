package selenide_page_object_with_assertions;

import org.junit.Test;

import static com.codeborne.selenide.Selenide.*;

public class GoogleTest {
	  @Test
	  public void userCanSearch() {
	    open("https://google.com/ncr");
	    new GooglePage().searchFor("selenide");

	    SearchResultsPage results = new SearchResultsPage();
	    results.checkResultsSizeIsAtLeast(1);
	    results.checkResultHasTest(0, "Selenide: concise UI tests in Java");
	  }
	}
