package selenium.basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserActions {

	public static void main(String[] args) {
		
//		1. Launch the Browser window
		WebDriver driver=  new ChromeDriver();
		
//		2. Maximize the browser window
		driver.manage().window().setSize(new Dimension(800,400));
		driver.manage().window().maximize();
		
//		3. Delete all browser cookies
		driver.manage().deleteAllCookies();
		
//		4. Enter URL and Launch the Application (https://www.google.co.in/)
		driver.get("https://www.google.co.in/"); //It will wait until all elements are loading 
		
//		5. Verify the application title (Google)
		String title= driver.getTitle();
		if(title.equals("Google"))
			System.out.println("Title is matching");
		else
			System.out.println("Title is not matching");
		
//		6. Navigate to Different application (https://www.selenium.dev/)
		driver.navigate().to("https://www.selenium.dev/"); //It won't wait until all elements are loading 
		
//		7. Go back to previous application
		driver.navigate().back();
		
//		8. Move forward to next application
		driver.navigate().forward();
		
//		9. Refresh the application
		driver.navigate().refresh();
		
//		Get window name (unique window handle id)
		String mainWindowId = driver.getWindowHandle();
		System.out.println(mainWindowId);
		
//		10.Launch new tab and Launch the application in new tab (https://in.search.yahoo.com/)
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://in.search.yahoo.com/");
		
//		11.Launch new window and Launch the application in new window (https://parabank.parasoft.com/parabank/index.htm)
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
//		12.Switch back to main window
		driver.switchTo().window(mainWindowId);
		
//		13. Get the Size of window
		System.out.println(driver.manage().window().getSize().getHeight());
		System.out.println(driver.manage().window().getSize().getWidth());
		
//		14. Close Current Window
		driver.close();
		
//		15. Close all remaining windows
		driver.quit();
		

	}

}
