package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.testBase;

public class AddressScreen {

	public AddressScreen() {
		PageFactory.initElements(testBase.driver, this);
	}

	@FindBy(xpath = "//div[@class='row']//h1")
	public static WebElement address;

	@FindBy(xpath = "//div[@class='col-xs-12 col-sm-6']//h3")
	public static WebElement DeliveryAddress;

}
