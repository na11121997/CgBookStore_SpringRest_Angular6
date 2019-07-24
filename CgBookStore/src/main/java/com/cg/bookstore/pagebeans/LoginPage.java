package com.cg.bookstore.pagebeans;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	@FindBy(how=How.NAME,name="categoryName")
	private WebElement categoryName;
	
	
	@FindBy(how=How.NAME,name="cate")
	private WebElement button;
	
	@FindBy(how=How.XPATH,xpath="/html/body/app-root/html/body/app-categories/div/div/form/div/div")
	private WebElement actualErrorMesssage;
	
	public LoginPage() {}

	public String getCategoryName() {
		return categoryName.getAttribute("value");
	}

	public void setCategoryName(String categoryName) {
		this.categoryName.sendKeys(categoryName);
	}

	public WebElement getButton() {
		return button;
	}

	public String getActualErrorMesssage() {
		return actualErrorMesssage.getText();
	}

	public void clickSignIn() {
		button.submit();
	}
}
