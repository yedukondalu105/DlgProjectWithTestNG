package Utilities.Capgemini.Dlg;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenshot {
	public WebDriver driver;
	public TakesScreenshot scn;
	public CaptureScreenshot(WebDriver driver){
		scn=(TakesScreenshot)driver;
		
		
	}
	public void printScreen(String className,String methodName,String scnName){
		File file=scn.getScreenshotAs(OutputType.FILE);
		//FileUtils.copy
		try {
			FileUtils.copyFile(file, new File("./test-output/Screenshots/"+className+"/"+methodName+"/"+scnName+".jpg"));
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
