package javaoopatlessons_8_hw.jav.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Collections;
import java.util.concurrent.TimeUnit;

public abstract class BeforeAndAfterStep {

	public WebDriver driver;
	public WebDriverWait wait15second;

	@BeforeEach
	public void baseTestBeforeAll() {
		WebDriverManager.chromedriver().setup();
//		System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--disable-popup-blocking");
		options.setExperimentalOption("excludeSwitches",
			Collections.singletonList("disable-popup-blocking"));
		options.addArguments("--no-sandbox");
		driver = new ChromeDriver(options);	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		wait15second = new WebDriverWait(driver, 15);
	}

	@AfterEach
	public void BaseTestAfterAll() {
		System.out.println("Tест завершен");
		driver.quit();
	}
}
