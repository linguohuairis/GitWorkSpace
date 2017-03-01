import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PricingPage {
	public void startBasicTrial(WebDriver driver){
		driver.findElement(By.linkText("Start Basic Trial")).click();
	}
	public void startPremiumTrial(WebDriver driver){
		driver.findElement(By.linkText("Start premium Trial")).click();
	}
	
}
