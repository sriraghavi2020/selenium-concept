package sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kiriti\\eclipse-workspace\\Java_Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login");
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//link for scrool donw
		//driver.get("https://book.spicejet.com/");
		driver.findElement(By.id("email")).sendKeys("raghavi21@gmail.com");
		
		
		WebElement loginbtn = driver.findElement(By.id("loginbutton"));
		WebElement borderBtn = driver.findElement(By.id("loginbutton"));
		//WebElement contacts = driver.findElement(By.xpath("//a[contains(text(), 'Airports')]"));
		
		//System.out.println(element.getCssValue("backgroundColor"));
	
		//flash(loginbtn, driver);
		border(borderBtn, driver);
		generateAlert(driver, "There is an issue with login button");
		Alert alert = driver.switchTo().alert();
		alert.accept();
		ClickFunc(loginbtn, driver);
		refereshJs(driver);
		System.out.println(getTitlePage(driver));
		//scroolDown(driver);
		//scrollInto(contacts, driver);
		
	}

	public static void flash(WebElement element, WebDriver driver) {
//		JavascriptExecutor js = ((JavascriptExecutor)driver);
		String BgColor = element.getCssValue("backgroundColor");
		for(int i=0; i<5; i++) {
		changeColor("rgba(0, 230, 64, 1)", element, driver);
		changeColor(BgColor, element, driver);
		}
		
	}
	public static void changeColor(String color,WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.backgroundColor ='" +color+"'", element);
		try {
			Thread.sleep(200);
		}catch (InterruptedException e) {
			
		}
	}
	public static void border(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeAsyncScript("arguments[0].style.border='3px solid red'", element);
	}
	public static void generateAlert(WebDriver driver, String msg) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeAsyncScript("alert('"+msg+"')");
		
	}
    public static void ClickFunc(WebElement element, WebDriver driver) {
    	JavascriptExecutor js = ((JavascriptExecutor)driver);
    	js.executeScript("arguments[0].click();", element);
    }
    public static void refereshJs(WebDriver driver) {
    	JavascriptExecutor js = ((JavascriptExecutor)driver);
    	js.executeScript("history.go(0)");
    }
	
	public static String getTitlePage(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		String title = js.executeScript("return document.title;").toString();
		return title;
	}
	
	public static void scroolDown(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	
	public static void scrollInto(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}
	
	
	
	
}
