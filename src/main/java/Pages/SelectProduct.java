package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.testBase;

public class SelectProduct {

	public SelectProduct() {
		PageFactory.initElements(testBase.driver, this);
	}

	@FindBy(xpath = "//*[@id='quantity_wanted']")
	public static WebElement numberOfProduct;

	@FindBy(xpath = "//*[@name='Blue']")
	public static WebElement selectColor;

	@FindBy(xpath = "//*[@id='add_to_cart']//span")
	public static WebElement addToCard;

}
