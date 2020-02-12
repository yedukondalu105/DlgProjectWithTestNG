package Pages.Capgemini.Dlg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewTest1Page {
	
	
	public WebDriver driver;
	public NewTest1Page(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//a[text()='Free Sign Up']")
	public WebElement freeSignUp;
	
	@FindBy(css="input#emailfield")
	public WebElement email;
	

	
	public void clickFreeSignUp(){
		freeSignUp.click();
	}
	
	public void enterCredentials(String emailAddress,String passWord){
		email.sendKeys(emailAddress);
		driver.findElement(By.cssSelector("input#password")).sendKeys(passWord);
	}

}
