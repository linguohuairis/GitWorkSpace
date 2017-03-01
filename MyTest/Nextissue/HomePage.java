import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	public void swtichToCatalogPage(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver, 200);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Catalog")));
        element.click();
	}
	
	public void switchToFeaturesPage(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver, 200);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Features")));
        element.click();
	}
	
	public void swtichtToSignInPage(WebDriver driver){
		WebDriverWait wait = new WebDriverWait(driver, 200);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Sign In")));
        element.click();
	}

	public void switchToAccountSummaryPage(WebDriver driver){
		// to do click dropdown menu
		driver.findElement(By.linkText("Account Summary")).click();	
	}
	
	public void signOut(WebDriver driver){
		// to do click dropdown menu
		driver.findElement(By.linkText("Sign Out")).click();	
	}
	
	public void switchToChooseGiftPage(WebDriver driver){
		
	}
}
