package sel;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Object_repository {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
Properties prop = new Properties();
	FileInputStream file = new FileInputStream("C:\\Users\\Kiriti\\eclipse-workspace\\sel\\src\\sel\\register.properties");
	prop.load(file);
	
	System.out.println(prop.getProperty("name"));
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kiriti\\eclipse-workspace\\Java_Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get(prop.getProperty("URL"));
	
	driver.findElement(By.id(prop.getProperty("firstname_id"))).sendKeys(prop.getProperty("firstname"));
	driver.findElement(By.id(prop.getProperty("surname_id"))).sendKeys(prop.getProperty("surname"));
	driver.findElement(By.id(prop.getProperty("email_id"))).sendKeys(prop.getProperty("email"));
	driver.findElement(By.id(prop.getProperty("Re_email_id"))).sendKeys(prop.getProperty("Re_email"));
	driver.findElement(By.id(prop.getProperty("password_id"))).sendKeys(prop.getProperty("password"));
	Select select = new Select(driver.findElement(By.id(prop.getProperty("day_id"))));
	select.selectByValue(prop.getProperty("day_value"));
	Select select1 = new Select(driver.findElement(By.id(prop.getProperty("month_id"))));
	select1.selectByValue(prop.getProperty("month_value"));
	Select select2 = new Select(driver.findElement(By.id(prop.getProperty("year_id"))));
	select2.selectByValue(prop.getProperty("year_value"));
	
	}

}
