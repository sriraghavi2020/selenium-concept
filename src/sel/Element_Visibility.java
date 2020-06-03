package sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Element_Visibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kiriti\\eclipse-workspace\\Java_Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://reg.ebay.com.au/reg/PartialReg");
	boolean b1= driver.findElement(By.id("ppaFormSbtBtn")).isDisplayed();
	System.out.println(b1);
	boolean b2= driver.findElement(By.name("checkbox-default")).isSelected();
	System.out.println(b2);
	boolean b3 = driver.findElement(By.id("ppaFormSbtBtn")).isEnabled();
	System.out.println(b3);
	}

}
