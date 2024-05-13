package com.comcast.crm.objectrepositoryUtility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage {
	
	@FindBy(xpath="//img[@title='Create Product...']")
	private WebElement newProductlinkbtn;

	public WebElement getNewProductlinkbtn() {
		return newProductlinkbtn;
	}
	
	
	
	

}
