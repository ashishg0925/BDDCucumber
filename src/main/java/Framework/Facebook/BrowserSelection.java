package Framework.Facebook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserSelection {
	
	public WebDriver Driver;
	public Properties prop;
	public WebDriver initializeBrowser() throws IOException
	{
		prop = new Properties();
		FileInputStream File = new FileInputStream("C:\\Users\\Ashu\\git\\BDDCucumber\\src\\main\\java\\resources\\GLobalParameters.properties");
		prop.load(File);
		String BrowserName=prop.getProperty("Browser");
		if (BrowserName.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashu\\Downloads\\chromedriver.exe");
			 Driver=new ChromeDriver();
			
		}
		else if(BrowserName.equals("Firefox"))
		{
			System.setProperty("webdriver.firefox.driver", "C:\\Users\\Ashu\\Downloads\\Software Download\\chromedriver.exe");
			 Driver=new FirefoxDriver();
		}
		
		Driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return Driver;
		
		
	}
	
}
