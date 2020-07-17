
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import base.BaseTest;

public class NavigationTest extends BaseTest {

//    Перейти на сайт https://geekbrains.ru/courses
//    Нажать на кнопку Курсы
//    Проверить что страница Курсы открылась
//    Повторить для
//    Курсы
//            Вебинары
//    Форум
//            Блог
//    Тесты
//            Карьера



    @Test
    public void topics() throws InterruptedException {
        chromeDriver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/topics\"]")).click();
        Assertions.assertEquals(
                "Форум",
                chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText()
        );
    }

    @Test
    public void posts() throws InterruptedException {
        chromeDriver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/posts\"]")).click();
        Assertions.assertEquals(
                "Блог",
                chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText()
        );
    }

//    Проблемы теста
//    дубликаты кода
//

    @Test
    public void checkNavigation() throws InterruptedException {
        chromeDriver.get("https://geekbrains.ru/events");

        chromeDriver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/topics\"]")).click();
        Assertions.assertEquals(
                "Форум",
                chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText()
        );

        chromeDriver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/events\"]")).click();
        Assertions.assertEquals(
                "Вебинары",
                chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText()
        );

        chromeDriver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/posts\"]")).click();
        Assertions.assertEquals(
                "Блог",
                chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText()
        );


        chromeDriver.findElement(By.cssSelector("[class=\"gb-empopup-close\"]")).click();
        chromeDriver.findElement(By.cssSelector("button [class=\"svg-icon icon-popup-close-button \"]")).click();

        chromeDriver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/tests\"]")).click();

        Assertions.assertEquals(
                "Тесты",
                chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText()
        );

        chromeDriver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/career\"]")).click();
        Assertions.assertEquals(
                "Карьера",
                chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText()
        );

        chromeDriver.findElement(By.cssSelector("[id=\"nav\"] [href=\"/courses\"]")).click();
        Assertions.assertEquals(
                "Курсы",
                chromeDriver.findElement(By.cssSelector("[id=\"top-menu\"] h2")).getText()
        );

    }

}
