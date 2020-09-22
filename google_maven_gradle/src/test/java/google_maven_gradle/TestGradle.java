package google_maven_gradle;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestGradle {

	private WebDriver driver;
	private WebDriverWait wait;

	@Before
	public void start() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
//		Dimension size = driver.manage().window().getSize();
		driver.manage().window().setSize(new Dimension(1024, 768));
//		driver.manage().window().maximize();
//	driver.manage().window().setPosition(new Point(100, 100));

		wait = new WebDriverWait(driver, 10);
	}

	@Test
	public void myTestGradle() {
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("webdriver");
		driver.findElement(By.name("btnK")).click();
		wait.until(titleIs("webdriver - Поиск в Google"));
	}

	@After
	public void stop() {
		driver.quit();
		driver = null;
	}

}