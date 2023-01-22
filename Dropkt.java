package tkusuma.kusumaraju;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dropkt {
	public static void main(String[] args)  {
		ChromeDriver ch = null;
		try
		{
		
			System.setProperty("webdriver.chrome.driver","D:\\temp\\kusumaraju\\src\\Library\\driver\\chromedriver.exe");
			ch = new ChromeDriver();		//opens the chrome browser
			ch.manage().window().maximize();	////Maximizing the browser
			ch.get("https://demoqa.com/droppable");;	//Load or navigate the URL
			Thread.sleep(2000);	 
			ch.findElement(By.id("droppableExample-tab-accept")).click();
			Actions act = new Actions(ch);
			WebElement From=ch.findElement(By.xpath("//*[@id='notAcceptable']"));
			
			WebElement to =ch.findElement(By.xpath("//*[@id='droppable']"));
					
		
			//Perform drag and drop
			act.dragAndDropBy(From,135,40).build().perform();
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


	
			
				

			
	
	


