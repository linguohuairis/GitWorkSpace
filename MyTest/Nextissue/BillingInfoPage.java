import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BillingInfoPage {
	public void enterValidCreditCard(WebDriver driver, String name, String cardNumber, String securityCode, String zipCode){
		driver.findElement(By.id("nim_billingCCAccountNameInput")).sendKeys(name);
		driver.findElement(By.id("nim_billingCCAccountNum")).sendKeys(cardNumber);
		Select selectMonth = new Select(driver.findElement(By.tagName("cardExpMon")));
		selectMonth.selectByVisibleText("Dec [12]");	
		Select selectYear = new Select(driver.findElement(By.tagName("cardExpYr")));
		selectYear.selectByVisibleText("2017");
		driver.findElement(By.id("nim_billingCCCVNInput")).sendKeys(securityCode);
		driver.findElement(By.id("nim_billingCCPostalCodeInput")).sendKeys(zipCode);
		driver.findElement(By.id("nim_billingCCSubmitBtn")).click();
	}

	public void enterValidPayPal(WebDriver driver, String email, String password){
		driver.findElement(By.id("nim_billingInfoPmtMethodTab2")).click();
		driver.findElement(By.id("nim_billingPayPalSubmitBtn")).click();
		WebDriverWait waitforPayPalLoad = new WebDriverWait(driver, 200);
		WebElement elementLogin = waitforPayPalLoad.until(ExpectedConditions.elementToBeClickable(By.id("btnLogin")));
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("password")).sendKeys(email);
		elementLogin.click();
		WebDriverWait waitforPayPalConfirmation = new WebDriverWait(driver, 200);
		WebElement elementAgree = waitforPayPalConfirmation.until(ExpectedConditions.elementToBeClickable(By.id("confirmButtonTop")));
		elementAgree.click();
	}
	public void useDifferentCard(WebDriver driver, String name, String cardNumber, String securityCode, String zipCode){
		driver.findElement(By.id("nim_billingInfoUseNewCard")).click();
		driver.findElement(By.id("nim_billingCCAccountNameInput")).sendKeys(name);
		driver.findElement(By.id("nim_billingCCAccountNum")).sendKeys(cardNumber);
		Select selectMonth = new Select(driver.findElement(By.tagName("cardExpMon")));
		selectMonth.selectByVisibleText("Dec [12]");	
		Select selectYear = new Select(driver.findElement(By.tagName("cardExpYr")));
		selectYear.selectByVisibleText("2017");
		driver.findElement(By.id("nim_billingCCCVNInput")).sendKeys(securityCode);
		driver.findElement(By.id("nim_billingCCPostalCodeInput")).sendKeys(zipCode);
		driver.findElement(By.id("nim_billingCCSubmitBtn")).click();
	}
}
