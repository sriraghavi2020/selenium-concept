package TestNG_Concept;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Basic {
	
	@BeforeSuite
	public void SysSetUp() {
		System.out.println("@BeforeSuite--");
	}
	@BeforeTest
	public void Browser() {
		System.out.println("@BeforeTest--");
	}
	@BeforeClass
	public void url() {
		System.out.println("@BeforeClass--");
	}
	@BeforeMethod
	public void login() {
		System.out.println("@BeforeMethod--");
	}
	@Test
	public void loginSuc() {
		System.out.println("@Test 1--");
	}
	@Test
	public void loginSuc1() {
		System.out.println("@Test 2--");
	}
	@Test
	public void loginSuc2() {
		System.out.println("@Test 3--");
	}
	@AfterMethod
	public void logout() {
		System.out.println("@AfterMethod--");
	}
	@AfterClass
	public void cokkies() {
		System.out.println("@AfterClass--");
	}
	@AfterTest
	public void referesh() {
		System.out.println();
	}
	@AfterSuite
	public void close() {
		System.out.println();
	}
}
