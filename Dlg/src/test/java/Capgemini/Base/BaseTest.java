package Capgemini.Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.chrome.ChromeOptions;

import Utilities.Capgemini.Dlg.EnvironmentalVariables;
/*@Listeners(Utilities.Capgemini.Dlg.TestResultListener.class)*/
public class BaseTest {
  public WebDriver driver;
  public EnvironmentalVariables env;
  //@Parameters({"Browser"})
  @BeforeMethod
  public void beforeTest(/*String browser*/) {
	  env=new EnvironmentalVariables();
	  
//	  if(browser.equalsIgnoreCase("chrome")){
//		  System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");
//		  driver=new ChromeDriver();
//	  }
//	  else if(browser.equalsIgnoreCase("firefox")){
//		  System.setProperty("webdriver.gecko.driver", "./BrowserDrivers/geckodriver.exe");
//		  driver=new FirefoxDriver();
//	  }
//	  else if(browser.equalsIgnoreCase("ie")){
//		  System.setProperty("webdriver.ie.driver", "./BrowserDrivers/IEDriverServer.exe");
//		  driver=new InternetExplorerDriver();
//	  }
//	  else{
//		  System.setProperty("webdriver.chrome.driver", "./BrowserDrivers/chromedriver.exe");
//		  driver=new ChromeDriver();
//	  }
	
	  
		ChromeOptions options = new ChromeOptions();
options.addArguments("start-maximized"); // open Browser in maximized mode
options.addArguments("disable-infobars"); // disabling infobars
options.addArguments("--disable-extensions"); // disabling extensions
options.addArguments("--disable-gpu"); // applicable to windows os only
options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
options.addArguments("--no-sandbox"); // Bypass OS security model

	 if(env.prop.getProperty("OS").equalsIgnoreCase("windows")) {
		  System.setProperty("webdriver.chrome.driver", "BrowserDrivers/chromedriver.exe");
		  driver=new ChromeDriver();
	 }
	 else if(env.prop.getProperty("OS").equalsIgnoreCase("linux")) {
		  System.setProperty("webdriver.chrome.driver", "BrowserDrivers/chromedriver");
		  driver=new ChromeDriver(options);
	 }
	  
	  
	  
  }

  @AfterMethod
  public void afterTest() {
	
	  driver.quit();
  }

}
