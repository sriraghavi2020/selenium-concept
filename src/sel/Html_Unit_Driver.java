package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Html_Unit_Driver {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kiriti\\eclipse-workspace\\Java_Selenium\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new HtmlUnitDriver();
		driver.get("https://www.facebook.com/login");
		String b = driver.getTitle();
		System.out.println("Tile before login:"+ b);
		
		driver.findElement(By.xpath("//a[contains(text(), 'Create New Account')]")).click();
		String a = driver.getTitle();
		System.out.println("Tilete after login:"+ a);
	}

}
