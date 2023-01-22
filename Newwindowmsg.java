package tkusuma.kusumaraju;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newwindowmsg {
	public static void main(String[] args)  {
		ChromeDriver driver = null;
	
		
			System.setProperty("webdriver.chrome.driver","D:\\temp\\kusumaraju\\src\\Library\\driver\\chromedriver.exe");
			driver = new ChromeDriver();		//opens the chrome browser
			driver.manage().window().maximize();	////Maximizing the browser
			driver.get("https://demoqa.com/browser-windows");	//Load or navigate the URL
			
			driver.findElement(By.id("windowButton")).click();

	        //Get handles of the windows
	        String mainWindowHandle = driver.getWindowHandle();
	        Set<String> allWindowHandles = driver.getWindowHandles();
	        Iterator<String> iterator = allWindowHandles.iterator();

	        // Here we will check if child window has other child windows and will fetch the heading of the child window
	        while (iterator.hasNext()) {
	            String ChildWindow = iterator.next();
	                if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
	                driver.switchTo().window(ChildWindow);
	                WebElement text = driver.findElement(By.id("sampleHeading"));
	                System.out.println("Heading of child window is " + text.getText());
	            }
	               
	        }
	}
}
	    
