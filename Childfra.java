package tkusuma.kusumaraju;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childfra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver ch = null;
		try
		{
		
			System.setProperty("webdriver.chrome.driver","D:\\temp\\kaplanbeng\\driver\\chromedriver.exe");
			ch = new ChromeDriver();		//opens the chrome browser
			ch.manage().window().maximize();	////Maximizing the browser
			ch.get("https://demoqa.com/nestedframes");	//Load or navigate the URL
			Thread.sleep(2000);	 
			
			WebElement frame1=ch.findElement(By.id("frame1"));
	        ch.switchTo().frame(frame1);
	       
	        ch.switchTo().frame(0);
	        WebElement frame2Element= ch.findElement(By.tagName("p"));
	        String frame2Text=frame2Element.getText();
	        System.out.println("Frame2 is :"+frame2Text);

	        
	       ch.switchTo().defaultContent();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			
		}

	}

}


