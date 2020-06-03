package sel;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandler_PopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kiriti\\eclipse-workspace\\Java_Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/popup.php");
	driver.findElement(By.xpath("//a[contains(text(), 'Click Here')]")).click();
	Set<String> handler = driver.getWindowHandles();
	Iterator<String> it = handler.iterator();
	String ParentWindow = it.next();
	System.out.println("ParentWindow is:"+ParentWindow);
	String ChildWindow = it.next();
	System.out.println("ChildWindow is:"+ChildWindow);
	driver.switchTo().window(ChildWindow);
	driver.findElement(By.name("emailid")).sendKeys("raghavi@gmail.com");
	driver.findElement(By.name("btnLogin")).click();
	Thread.sleep(1000);
	driver.close();
	driver.switchTo().window(ParentWindow);
	
	
	
	
	
	
	}
	
	
	

}
