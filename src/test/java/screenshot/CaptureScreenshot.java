package screenshot;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureScreenshot 
{
	@Test
	public void takeScreenshot() throws Exception {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.browserstack.com");
		screenshotMethod(driver, "C://Interview_Preparation//Workspace//Selenium_Preparation//screenshots//test.png");
		
	}
	public void screenshotMethod(WebDriver webdriver, String path) throws Exception 
	{
		
		TakesScreenshot ts=((TakesScreenshot)webdriver);
		File srcFile=ts.getScreenshotAs(OutputType.FILE);
		//store image into destination 
		File desFile = new File(path);
		FileUtils.copyFile(srcFile, desFile);
	}
}
