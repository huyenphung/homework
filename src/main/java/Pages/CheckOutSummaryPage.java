package Pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.testBase;

public class CheckOutSummaryPage {

	public CheckOutSummaryPage() {
		PageFactory.initElements(testBase.driver, this);
	}


	@FindBy(xpath = "//div[@class='cart_quantity_button clearfix']//a[2]//i")
	public static WebElement addMore;

	@FindBy(xpath = "//div[@class='cart_quantity_button clearfix']//a[1]//i")
	public static WebElement MinusProduct;



	@FindBy(xpath = "//td[@class='cart_quantity text-center']//input[@type]")
	public static WebElement ProductNumber;

	@FindBy(xpath = "//td[@class='cart_description']//small[2]//a")
	public static WebElement otherInfor;

	@FindBy(xpath = "//td[@class='price']//span[@id='total_price']")
	public static WebElement totalPrice;

}
