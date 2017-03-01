import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChooseGiftPage {
	public void selectGiftFor30(WebDriver driver){
		//driver.
		driver.findElement(By.id("gift-select-submit")).click();
	}
	
	public void selectGiftFor60(WebDriver driver){
		//driver.
		driver.findElement(By.id("gift-select-submit")).click();
	}
    
	public void selectGiftFor75(WebDriver driver){
		//driver.
		driver.findElement(By.id("gift-select-submit")).click();
	}
	
	public void switchToRedeemGiftPage(WebDriver driver){
		driver.findElement(By.linkText("Redeem it here")).click();
	}
}
