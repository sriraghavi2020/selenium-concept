package sel;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class File_Upload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kiriti\\eclipse-workspace\\Java_Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/image_upload");
Dimension d = new Dimension(1500,1080);
		driver.manage().window().setSize(d);;
		Thread.sleep(1000);
		driver.findElement(By.name("photoimg")).sendKeys("C:\\Users\\Kiriti\\Downloads\\Sri_Raghavi_Resume.pdf");
		//Select select = new Select(driver.findElement(By.className("cta_four phantom dropdown-toggle")));
		//select.selectByVisibleText("Local Document").sendKeys("C:\\Users\\Kiriti\\Downloads\\Sri_Raghavi_Resume.pdf");
	}

}
