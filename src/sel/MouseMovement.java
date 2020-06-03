package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kiriti\\eclipse-workspace\\Java_Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.spicejet.com");
		
		//driver.findElement(By.linkText("DEALS")).click();
		Actions action = new Actions(driver);
		Thread.sleep(10000);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(), 'Login / Signup')]"))).build().perform();
		Thread.sleep(300);
		//driver.findElement(By.linkText("Hot Meals")).click();
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(), 'SpiceClub Members')]"))).build().perform();
		Thread.sleep(200);
		driver.findElement(By.linkText("Member Login")).click();
		//wrong
		//driver.findElement(By.xpath("//a[contains(text(), 'Member Login')]")).click();
	}

}
