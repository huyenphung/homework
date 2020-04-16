package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.testBase;

public class SelectProduct {

	public SelectProduct() {
		PageFactory.initElements(testBase.driver, this);
	}

	@FindBy(xpath = "//input[@id='quantity_wanted']")
	public static WebElement numberOfProduct;

	@FindBy(xpath = "//fieldset[@class='attribute_fieldset']//a[@name='Blue']")
	public static WebElement selectColor;

	@FindBy(xpath = "//*[@id='add_to_cart']//span")
	public static WebElement addToCard;

	public String selectColor(String color) {
		testBase.driver.findElement(By.xpath("//a[@name='"+color+"']")).click();
		return color;
	}

}
