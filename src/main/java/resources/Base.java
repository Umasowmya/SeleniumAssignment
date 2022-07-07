package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Base {
	  public WebDriver driver;
	  public Properties prop;
	  public WebDriver initializeDriver() throws IOException {
		  prop= new Properties();
		  FileInputStream fis=new FileInputStream("src/main/java/resources/data.properties");
		  prop.load(fis);
		  String browserName=prop.getProperty("browser");
		  if(browserName.equals("chrome")) {
			  System.setProperty("webdriver.chrome.driver", "/home/umaS/Downloads/chromedriver_linux64/chromedriver");
			  driver= new ChromeDriver();
		  }

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	  }

		public void getScreenshot(String result) throws IOException {
		  File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(src, new File("src/main/resources/"+result+"screenshot.png"));

		}


}
