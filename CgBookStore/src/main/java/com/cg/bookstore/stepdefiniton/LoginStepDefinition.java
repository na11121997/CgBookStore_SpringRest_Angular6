package com.cg.bookstore.stepdefiniton;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.cg.bookstore.pagebeans.LoginPage;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {
	private LoginPage loginPage;
	private WebDriver driver;
	
	@Before
	public void setUpStepEnv() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver=new ChromeDriver();	
	}

	//--------------------------------------------------------------
	@Given("^Admin is on BookStore Book Category Page$")
	public void admin_is_on_BookStore_Book_Category_Page() throws Throwable {
		driver.get("http://localhost:4200/categories");
		loginPage=PageFactory.initElements(driver,LoginPage.class);
	}

	@When("^Admin enter valid Category Information$")
	public void admin_enter_valid_Category_Information() throws Throwable {
		loginPage.setCategoryName("a");
		loginPage.clickSignIn();
	}

	@Then("^Admin should successfully add a Category$")
	public void admin_should_successfully_add_a_Category() throws Throwable {
		String expectedErrorMessage="Name must be at least 4 characters long.";
		Assert.assertEquals(expectedErrorMessage, loginPage.getActualErrorMesssage());
	}
	//--------------------------------------------------------------


	@After
	public void tearDownStepEnv() {
		//driver.close();
	}
	
}