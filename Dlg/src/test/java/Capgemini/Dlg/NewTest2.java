package Capgemini.Dlg;
import org.testng.annotations.Test;

import Capgemini.Base.BaseTest;
import Pages.Capgemini.Dlg.NewTest1Page;
import Utilities.Capgemini.Dlg.CaptureScreenshot;
import Utilities.Capgemini.Dlg.Data;
import Utilities.Capgemini.Dlg.EnvironmentalVariables;
import Utilities.Capgemini.Dlg.LoggerUtil;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTest2 extends BaseTest {
 
  
  public NewTest1Page test1Page;
  public Data data;
  
	//@Test(groups={"Regression"})
  public void testSignUP2() {
		CaptureScreenshot capScn=new CaptureScreenshot(driver);
		driver.get("https://www.zoho.com/");
		driver.manage().window().maximize();
		String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
		capScn.printScreen(NewTest2.class.getName(),methodName,"Step1");
		test1Page=new NewTest1Page(driver);
		test1Page.clickFreeSignUp();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		capScn.printScreen(NewTest2.class.getName(),methodName,"Step2");
		//data=new Data();
		//data.getData();
		//LoggerUtil logUtil=new LoggerUtil();
		//EnvironmentalVariables env=new EnvironmentalVariables();
		//logUtil.logger.debug("Test Log");
		//logUtil.logger.info(env.prop.getProperty("Browser"));
		
	 
  }
  

}
