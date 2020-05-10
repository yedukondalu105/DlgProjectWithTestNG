package Capgemini.Dlg;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Capgemini.Base.BaseTest;
import Pages.Capgemini.Dlg.NewTest1Page;
import Utilities.Capgemini.Dlg.Data;
import Utilities.Capgemini.Dlg.EnvironmentalVariables;

public class NewTest1 extends BaseTest {
 
  
  public NewTest1Page test1Page;
  public Data data;
  
  @DataProvider(name="data")
  public Object[][] passData(){
	  Object[][] pData=new Object[2][1];
	  pData[0][0] = "Sachin";
	  
	 
	  pData[1][0] = "Tendulkar";
	
	  
	  
	  
	  
	return pData;
	  
  }
  
	@Test(/*groups={"Regression"},*/dataProvider="data" )
  public void testSignUP1(String userName) {
	//	CaptureScreenshot capScn=new CaptureScreenshot(driver);
		driver.get("https://www.zoho.com/");
		driver.manage().window().maximize();
		String methodName=Thread.currentThread().getStackTrace()[1].getMethodName();
	//	capScn.printScreen(NewTest1.class.getName(),methodName,"Step1");
		test1Page=new NewTest1Page(driver);
		test1Page.clickFreeSignUp();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//We can forcebly focus on a specific element by using this
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].focus();", driver.findElement(By.cssSelector("input#password")));
		
		//To enter text into current focussed element
		//driver.switchTo().activeElement().sendKeys("HI");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*try {
			Robot robot=new Robot();
			StringSelection ss=new StringSelection("upal.yk@gmail.com");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
			robot.setAutoDelay(2000);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);
			robot.setAutoDelay(2000);
			
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		test1Page.enterCredentials("test", "dontknow");
		System.out.println("Credentials entered");
	//	capScn.printScreen(NewTest1.class.getName(),methodName,"Step2");
		
		
		//data=new Data();
		//data.getData();
		//LoggerUtil logUtil=new LoggerUtil();
		EnvironmentalVariables env=new EnvironmentalVariables();
		System.out.println("All steps executed");
		//logUtil.logger.debug("Test Log");
		//logUtil.logger.info(env.prop.getProperty("Browser"));
		
	 
  }
//	@Test(groups={"Regression"})
//	public void test2(){
//		System.out.println("Test2 2nd annotation");
//	}
  

}
