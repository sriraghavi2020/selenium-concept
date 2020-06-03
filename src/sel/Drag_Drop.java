package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kiriti\\eclipse-workspace\\Java_Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		//Method 1
		Actions action = new Actions(driver);
		action.clickAndHold(driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"))).moveToElement(driver.findElement(By.id("bank"))).release().build().perform();
	 
		
		
		
		//Method 2
		
		WebElement From = driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement To = driver.findElement(By.id("amt7"));
		action.dragAndDrop(From, To).build().perform();
		
		WebElement From1 = driver.findElement(By.xpath("//a[contains(text(), 'SALES')]"));
		WebElement To1 = driver.findElement(By.id("loan"));
		
		WebElement From2 = driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement To2 = driver.findElement(By.id("amt8"));
		
		action.dragAndDrop(From1, To1).build().perform();
		action.dragAndDrop(From2, To2).build().perform();
		
		if(driver.findElement(By.xpath("//a[contains(text(), 'Perfect')]")).isDisplayed()){
			System.out.println("Perfectly displayed");
		}
		else {
			System.out.println("ImPerfect display");
		}
	}
	
	
	

}
