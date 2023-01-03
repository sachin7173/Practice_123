package POM_Classes;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseClass {
public static WebDriver driver;
public static void openBrowser() throws IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\automation\\Practice_123\\src\\test\\resources\\Browser\\chromedriver.exe");
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--disable-notifications");
	driver=new ChromeDriver(option);
	
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.get(UtilityClass.getPropertyFileData("url"));
	Thread.sleep(2000);
}
}
