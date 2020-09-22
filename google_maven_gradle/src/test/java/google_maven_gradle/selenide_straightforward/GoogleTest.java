package google_maven_gradle.selenide_straightforward;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.junit.TextReport;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class GoogleTest {
  @Rule
  public TestRule report = new TextReport().onFailedTest(true).onSucceededTest(true);

  @Test
  public void search_selenide_in_google() throws InterruptedException {
	  Configuration.headless = true;
	  Configuration.timeout = 6000;
	  Configuration.browser = "chrome";
      Configuration.browserSize = "1920x1080";
      Configuration.holdBrowserOpen = true;
    open("https://google.com/ncr");
    $(By.name("q")).val("selenide").pressEnter();
    $$("#ires .g").shouldHave(sizeGreaterThan(1));
    $("#ires .g").shouldBe(visible).shouldHave(
        text("Selenide: concise UI tests in Java"),
        text("selenide.org"));
        Thread.sleep(5000);
        System.out.println();
        refresh();
  }
}
