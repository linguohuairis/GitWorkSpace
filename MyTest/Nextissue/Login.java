import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.*;

public class Login {
    public WebDriver driver;
    
    @Before
	public void setUp(){
		System.out.print("1111111111111");
		System.setProperty("webdriver.gecko.driver","D:/Selenium/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.qa3.texture.com");
		System.out.print("2222222222");
	}
    
	@Test
	public void SNF1(){
		WebDriverWait wait = new WebDriverWait(driver, 200);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Texture")));
	    element.click();
	    Assert.assertTrue(driver.getPageSource().contains("Account Creation Form Title"));		
	}
	
	@Test
	public void SNF2(){
		WebDriverWait wait = new WebDriverWait(driver, 200);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Catalog")));
        element.click();
		Assert.assertTrue(driver.getPageSource().contains("By Category"));
	}
	
	@After
	public void tearDown(){
		System.out.print("4444444");
		driver.quit();
	} 
}
