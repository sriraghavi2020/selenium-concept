package sel;

//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kiriti\\eclipse-workspace\\Java_Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/device-based/regular/login");
		driver.findElement(By.id("email")).sendKeys("raghavi@gmail.com");
	driver.findElement(By.id("loginbutton")).click();
	
	//Alert alert = driver.switchTo().alert();
	String alertmsg = driver.switchTo().alert().getText();
	System.out.println(alertmsg);
		
		
	
	driver.close();
	}

}
