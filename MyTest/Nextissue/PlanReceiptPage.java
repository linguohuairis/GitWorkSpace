import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PlanReceiptPage {
	public void clickTexturelogo(WebDriver driver){
		driver.findElement(By.id("nim_layoutLogoImage")).click();		
	}

	public void switchToPrintablePage(WebDriver driver){
		driver.findElement(By.id("nim_purchaseReceiptPrint")).click();
	}
	
	public void switchToAppStore(WebDriver driver){
		driver.findElement(By.id("nim_purchaseReceiptiOSLink")).click();		
	}
	
	public void switchToGooglePlay(WebDriver driver){
		driver.findElement(By.id("nim_purchaseReceiptAndroidLink")).click();		
	}
	
	public void switchToAmazon(WebDriver driver){
		driver.findElement(By.id("nim_purchaseReceiptAmzLink")).click();		
	}

	public void switchToFriendBuy(WebDriver driver){
		driver.findElement(By.id("nim_friendbuyDiv")).click();
	}
	
	public String getUnlimitedReceiptHeader(WebDriver driver){
		return driver.findElement(By.id("nim_unlimitedReceiptHeader")).getText();
	}
	
	public String getUnlimitedSubReceiptHeader(WebDriver driver){
		return driver.findElement(By.id("nim_unlimitedReceiptSubHeader")).getText();
	}
	
	public String getUnlimitedFooterReceiptHeader(WebDriver driver){
		return driver.findElement(By.id("nim_unlimitedPurchReceiptFooter")).getText();
	}
	
	
	
}
