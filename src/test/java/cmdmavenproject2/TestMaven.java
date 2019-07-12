package cmdmavenproject2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestMaven {
	
	
	
	@Test
	public void display() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\jars\\SeleniumJAR\\Chrome\\NewChrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println("jalaj");
		Thread.sleep(4000);
		driver.quit();
	}
}
