package selenide_page_object_with_assertions;

import static com.codeborne.selenide.CollectionCondition.*;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

import com.codeborne.selenide.ElementsCollection;

public class SearchResultsPage {
	  private ElementsCollection results = $$("#res .g");

	  public void checkResultsSizeIsAtLeast(int expectedSize) {
	    results.shouldHave(sizeGreaterThan(expectedSize));
	  }

	  public void checkResultHasTest(int index, String expectedText) {
	    results.get(index).shouldHave(text(expectedText));
	  }

	  public ElementsCollection getResults() {
	    return results;
	  }
	}