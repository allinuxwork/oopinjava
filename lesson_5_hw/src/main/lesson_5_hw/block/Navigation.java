package main.lesson_5_hw.block;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Navigation extends PageFactory {

    public Navigation(WebDriver driver) {
        initElements(driver, this);
    }

    @FindBy(css = "[id=\"nav\"] [href=\"/posts\"]")
    private WebElement buttonPosts;

    @FindBy(css = "[id=\"nav\"] [href=\"/topics\"]")
    private WebElement buttonTopics;

    @FindBy(css = "[id=\"nav\"] [href=\"/events\"]")
    private WebElement buttonEvents;

    @FindBy(css = "[id=\"nav\"] [href=\"/tests\"]")
    private WebElement buttonTests;

    @FindBy(css = "[id=\"nav\"] [href=\"/career\"]")
    private WebElement buttonCareer;

    @FindBy(css = "[id=\"nav\"] [href=\"/courses\"]")
    private WebElement buttonCourses;
    
    @FindBy(css = "[class=\"i i-login\"]")
    private WebElement buttonLogin;
    
    @FindBy(css = "button [class=\"gb-header__title\"]")
    private WebElement buttonMain;
    
    @FindBy(css = "button [class=\"gb-left-menu__logo \"]")
    private WebElement buttonLogo;

    public WebElement getButton(String nameButton) {

        switch (nameButton) {
            case "Курсы": {
                return buttonCourses;
            }
            case "Вебинары": {
                return buttonEvents;
            }
            case "Форум": {
                return buttonTopics;
            }
            case "Блог": {
                return buttonPosts;
            }
            case "Тесты": {
                return buttonTests;
            }
            case "Карьера": {
                return buttonCareer;
            }
            
            case "Вход": {
                return buttonLogin;
            }
            
            case "Главная": {
                return buttonMain;
            }
            case "": {
                return buttonLogo;
            }
        }
        throw new RuntimeException("кнопки: " + nameButton + " нет на странице!");
    }

}