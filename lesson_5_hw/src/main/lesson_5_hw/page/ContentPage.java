package main.lesson_5_hw.page;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import main.lesson_5_hw.block.Navigation;

public class ContentPage extends PageFactory {

    @FindBy(css = "[class*='gb-header__content']")
    private WebElement header;

    @FindBy(css = "[class='site-footer__content']")
    private WebElement footer;

    @FindBy(css = "[id=\"top-menu\"] h2")
    private WebElement namePage;

    @FindBy(css = "[class=\"gb-empopup-close\"]")
    private WebElement buttonClosePopUp1;

    @FindBy(css = "button [class=\"svg-icon icon-popup-close-button \"]")
    private WebElement buttonClosePopUp2;
    
 //   @FindBy(css = "button [class='col'] [href=\"/login\"]")
  //  private WebElement buttonLogin;
    //[class='col'] [href="/login"]
    
    @FindBy(css = "button [class=\"i i-login\"]")
    private WebElement buttonLogin;
    //   [class="i i-login"] 
    
//    @FindBy(css = "button [class=\"gb__main-wrapper\"]")
//    private WebElement buttonMain;
   // [class="gb__main-wrapper"] 
    
   // [class="gb-header__title"]
//    @FindBy(css = "button [class=\"gb-header__title\"]")
//    private WebElement buttonMain;  
    
    // [class="gb-left-menu__logo "]
    @FindBy(css = "button [class=\"gb-left-menu__logo \"]")
    private WebElement buttonLogo;  

    private Navigation navigation;

    public ContentPage(WebDriver driver) {
        initElements(driver, this);
        navigation = new Navigation(driver);
    }

    public Navigation getNavigation() {
        return navigation;
    }

    public void checkNamePage(String expectedNamePage) {
        Assertions.assertEquals(expectedNamePage, namePage.getText());
    }

    public WebElement getButtonClosePopUp1() {
        return buttonClosePopUp1;
    }

    public WebElement getButtonClosePopUp2() {
        return buttonClosePopUp2;
    }

    public WebElement getHeader() {
        return header;
    }

    public WebElement getFooter() {
        return footer;
    }
    
	
	  public WebElement getButtonLogin() { 
		  return buttonLogin; 
		  }
	  
//	  public WebElement getButtonMain() { 
//		  return buttonMain; 
//		  }
	  
	  public WebElement getButtonLogo() { 
		  return buttonLogo; 
		  }
	 
}
