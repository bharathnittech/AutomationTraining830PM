package selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumClass {

	public static void main(String[] args) throws InterruptedException {
		
		//1. Launch Browser (Browser=Chrome)
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe"); //set the browser properties
		WebDriver driver = new ChromeDriver();
			
		//2. Enter URL and Launch Application (URL =https://www.google.co.in/)
		driver.get("https://www.google.co.in/");
		
		//3. Wait for 3 Sec
		Thread.sleep(3000);
		
		//4. Close the browser	
		driver.close();//close current window
		//driver.quit();//close all the windows launched by selenium
		
		

	}

}
