package javaoopinlesson8_hw.block;

import io.qameta.allure.Step;
import javaoopinlesson8_hw.page.BasePageObject;
import javaoopinlesson8_hw.page.content.*;
import javaoopinlesson8_hw.page.content.base.ContentBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeftNavigation extends BasePageObject {

    @FindBy(css = "[class='svg-icon icon-logo']")
    private WebElement icon;

    @FindBy(css = "[id='nav'] [href='/courses']")
    private WebElement buttonCourses;

    @FindBy(css = "[id='nav'] [href='/topics']")
    private WebElement buttonTopics;
    
    @FindBy(css = "[id='nav'] [href='/events']")
    private WebElement buttonEvents;

    @FindBy(css = "[id='nav'] [href='/posts']")
    private WebElement buttonPosts;

    @FindBy(css = "[id='nav'] [href='/tests']")
    private WebElement buttonTests;

    @FindBy(css = "[id='nav'] [href='/career']")
    private WebElement buttonCareer;

    public LeftNavigation(WebDriver driver) {
        super(driver);
    }

    @Step("Нажатие кнопки {button}")
    public ContentBasePage clickButton(Button button) {
        ContentBasePage contentBasePage = null;

        switch (button) {
            case ICON:
                icon.click();
                contentBasePage = new HomePage(driver);
                break;
            case COURSES:
                buttonCourses.click();
                contentBasePage = new CoursePage(driver);
                break;
            case EVENTS:            
            	 buttonEvents.click();
                 contentBasePage = new EventPage(driver);
                 break;
            case TOPICS:        
                buttonTopics.click();
                break;
            case POSTS:
            	contentBasePage = new PostPage(driver);
                buttonPosts.click();
                break;
            case TESTS:
                buttonTests.click();
                contentBasePage = new TestPage(driver);
                break;
            case CAREER:
                buttonCareer.click();
                break;
        }

        if (contentBasePage == null) {
            contentBasePage = new HomePage(driver);
        }

        return contentBasePage;
    }

    public enum Button {
        ICON("Главная"),
        COURSES("Курсы"),
        EVENTS("Вебинары"),
        TOPICS("Форум"),
        POSTS("Блог"),
        TESTS("Тесты"),
        CAREER("Карьера");

        private String text;

        Button(String text) {
            this.text = text;
        }

        public String getText() {
            return text;
        }
    }

}