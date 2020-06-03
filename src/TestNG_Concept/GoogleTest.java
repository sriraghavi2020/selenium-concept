package TestNG_Concept;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	WebDriver driver;

@BeforeMethod
public void setUp() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kiriti\\eclipse-workspace\\Java_Selenium\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
//driver.manage().window().maximize();
//driver.manage().deleteAllCookies();
//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.get("https://www.google.com/");
}
@Test(priority=1, groups="Google Test")
public void pageTitle() {
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("aus");
	String t = driver.getTitle();
	System.out.println(t);
	Assert.assertEquals(t, "Google");
}
@Test(priority=3, groups="Google Test", dependsOnMethods="linkTest")
public void logo() {
	boolean b1 = driver.findElement(By.xpath("//*[@id=\"hplogo\"]/a/img")).isDisplayed();
	System.out.println(b1);
	Assert.assertEquals(b1, true);
}
@Test(priority=2, groups="Google Test")
public void linkTest() {
	boolean b2 = driver.findElement(By.xpath("//a[contains(text(), 'Gmail')]")).isDisplayed();
	System.out.println(b2);
	Assert.assertTrue(true);
}

/*@Test(invocationCount = 1)
public void sum() {
	int a=1; 
	int b=2;
	int c= a+b;
	System.out.println("Sum: " +c);
}
@Test(expectedExceptions=NumberFormatException.class)
public void test4() {
	String a = "Raghavi";
	Integer.parseInt(a);
}
@Test(/*priority=4, groups="Simple Test")
public void test1() {
	System.out.println("Test1, groups");
}
@Test(/*priority=5, groups="Simple Test")
public void test2() {
	System.out.println("Test2, groups");
}
@Test(/*priority=6, groups="Simple Test")
public void test3() {
	System.out.println("Test3, groups");
}
*/
@AfterMethod
public void close() {
	driver.quit();
}

}
