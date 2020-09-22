package google_maven_gradle.selenide_page_object_with_assertions;

import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.$;

public class GoogleTest {
  @Test
  public void userCanSearch() {
    open("https://google.com");
$(By.name("q")).setValue("Selenide").pressEnter();
  }
}
