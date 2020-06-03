package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Register {

	public static void maintttt() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kiriti\\eclipse-workspace\\Java_Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//*[@id=\"u_0_m\"]")).sendKeys("Sri");
		driver.findElement(By.name("lastname")).sendKeys("Raghavi");
		driver.findElement(By.id("u_0_r")).sendKeys("raghavi@gmail.com");
		driver.findElement(By.cssSelector("#u_0_u")).sendKeys("raghavi@gmail.com");
		driver.findElement(By.cssSelector("#u_0_w")).sendKeys("buvimr94");
		Select select = new Select(driver.findElement(By.id("day")));
		select.selectByValue("30");
		Select select1 = new Select(driver.findElement(By.id("month")));
	   
		select1.selectByValue("6");
		driver.findElement(By.id("year"));
		Select select2 = new Select(driver.findElement(By.id("year")));
		select2.selectByValue("1994");
	driver.findElement(By.cssSelector("#u_0_6")).click();
	
	}
	

}
