package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.testBase;

public class CheckOutPage {

	public CheckOutPage() {
		PageFactory.initElements(testBase.driver, this);
	}

	@FindBy(xpath = "//*[@id='layer_cart_product_title']")
	public static WebElement TitleOfProduct;

	@FindBy(xpath = "//*[@id='layer_cart']//a[@title='Proceed to checkout']")
	public static WebElement clickOnCheckOutBtn;

}
