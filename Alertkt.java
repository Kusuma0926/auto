package tkusuma.kusumaraju;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertkt {

	public static void main(String[] args) {
		ChromeDriver ch = null;
		
		try
		{
			System.setProperty("webdriver.chrome.driver","D:\\temp\\kusumaraju\\src\\Library\\driver\\chromedriver.exe");
			ch = new ChromeDriver();		//opens the chrome browser
			ch.manage().window().maximize();	////Maximizing the browser
			ch.get("https://demoqa.com/alerts");;	//Load or navigate the URL
			Thread.sleep(2000);		
			
			WebElement element = ch.findElement(By.id("confirmButton"));
			  ((JavascriptExecutor) ch).executeScript("arguments[0].click()", element);
			  Alert confirmationAlert = ch.switchTo().alert();
			  String alertText = confirmationAlert.getText();
			  System.out.println("Alert text is " + alertText);
			  confirmationAlert.accept();
			  WebElement element1 = ch.findElement(By.id("promtButton"));
			   ((JavascriptExecutor) ch).executeScript("arguments[0].click()", element1);
			   Alert promptAlert  = ch.switchTo().alert();
			   
			   String alertText1 = confirmationAlert.getText();
			   System.out.println("Alert2 text is " + alertText1);
			  //Send some text to the alert
			   confirmationAlert.sendKeys(" User KUSUMA");
			   confirmationAlert.accept();
			   try {
		            ch.findElement(By.id("timerAlertButton")).click();
		          //  WebDriverWait wait = new WebDriverWait();
		            //wait.until(ExpectedConditions.alertIsPresent());
		            Alert simpleAlert = ch.switchTo().alert();
		            simpleAlert.accept();
		            System.out.println("Unexpected alert accepted");
		        } catch (Exception e) {
		            System.out.println("unexpected alert not present");
		        }
			
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
