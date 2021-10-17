package com.careerhack.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;    //Instance Variable
	public HomePage(WebDriver driver){  // parameter inside the paranthesis
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		
	}

	//WebElement searchBox = driver.findElement(By.name("q"));
	//searchBox.sendKeys(term);
	@FindBy(name="q")
	WebElement searchBox;
	
	public void enterSearchItem(String term) {
		searchBox.sendKeys(term);
	}
		//WebElement searchButtonElement = driver.findElement(By.name("btnK"));
	    //searchButtonElement.click();
		
		@FindBy(name = "btnK")
		WebElement searchButtonElement;
		
		public void clickSearch() {
			searchButtonElement.submit();
	}
}
