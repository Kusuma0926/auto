package tkusuma.kusumaraju;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart1 {

	public static void main(String[] args)  {
		ChromeDriver driver = null;
		
		
			System.setProperty("webdriver.chrome.driver","D:\\temp\\kusumaraju\\src\\Library\\driver\\chromedriver.exe");
			driver = new ChromeDriver();		
			driver.manage().window().maximize();	
			driver.get("https://www.flipkart.com");	
			//Thread.sleep(2000);	 
			driver.findElement(By.className("_2doB4z")).click();
			WebElement hovering = driver. findElement (By.xpath (" //div [contains (text () , 'Fashion') ]")) ;
			Actions action = new Actions (driver);
			action.moveToElement (hovering) .perform () ;
			
			WebElement kids = driver.findElement(By. xpath (" //div/a[@class='_6WOcW9 _2-k99T']")); 
			action.moveToElement(kids).perform () ;
			
			WebElement jeans = driver. findElement (By.xpath ("//div/a[text() = 'Boys & Girls Jeans']"));
			action.moveToElement(jeans).click () ;
			
			driver. findElement (By. xpath ("//div [text () = ' Price --Low to High' ]")).click ();
			driver.findElement (By.xpath (" //a[text() = 'Baby Boys Slim Mid Rise Blue Jeans']")).getText () ; 
			driver.findElement (By.xpath (" // a [text() = 'Baby Boys Slim Mid Rise Blue Jeans'")).click();
			
			String boyJeans = driver.findElement(By.xpath ("//span [text() = 'Baby Boys Slim Mid Rise Blue Jeans']")).getText();
			String Price = driver.findElement(By.xpath (" //div[@class '_30jeg3_16Jk6d' ]")).getText();
			driver. findElement (By. xpath (" //button [text () = 'Add to cart!]")) .click ();
			driver.findElement (By.xpath (" //a [text () = '6 - 12 Months']") ) . click () ;
			driver.findElement (By. xpath (" //button [text () = 'Add to cart']")) .click ();
			
			String totalAmount = driver.findElement(By.xpath ("//div[contains(text (),'Total Amount')1//following::div[1]")).getText();
					String CheckoutName =driver.findElement (By.xpath (" //div/a [@class-\" 2Kn22P gBNbID\"]") ).getText () ;
					if (boyJeans == CheckoutName && totalAmount == Price )
					{
						
					
					System. out. println("Price & Name matches with Checkout Page");
					}
					System. out.println ("Price & Name doesnot matches with Checkout Page");
				
		}
			

		}

	

	


