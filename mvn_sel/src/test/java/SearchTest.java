
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import base.BaseTest;

public class SearchTest extends BaseTest {

//    Перейти на сайт https://geekbrains.ru/courses
//    Нажать на кнопку Поиск
//    В поле Поиск ввести текст: java
//    Проверить что отобразились блоки:
//    Профессии
//            Курсы
//    Вебинары
//            Блоги
//    Форум
//            Тесты
//    Проекты и компании


    @Test
    public void checkSearch() throws InterruptedException {

        chromeDriver.findElement(By.cssSelector("[class=\"show-search-form\"] [class=\"svg-icon icon-search \"]")).click();

        chromeDriver.findElementByCssSelector("input[class=\"search-panel__search-field\"]")
                .sendKeys("java");

        wait15second.until(ExpectedConditions.textToBePresentInElement(
                chromeDriver.findElementByCssSelector("[id=\"professions\"] h2"), "Профессии"));

        chromeDriver.findElementByXPath("//h2[text()='Курсы']");
        chromeDriver.findElementByXPath("//h2[text()='Вебинары']");
        chromeDriver.findElementByXPath("//h2[text()='Блоги']");
        chromeDriver.findElementByXPath("//h2[text()='Форум']");
//        chromeDriver.findElementByXPath("//h2[text()='Профессии']");
        chromeDriver.findElementByXPath("//h2[text()='Проекты и компании']");


        System.out.println("Первый тест");
    }
}
