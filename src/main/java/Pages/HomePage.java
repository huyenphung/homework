package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.testBase;

public class HomePage {

	public HomePage() {
		PageFactory.initElements(testBase.driver, this);
	}

	@FindBy(xpath = "//*[@id='block_top_menu']//a")
	public static WebElement HoverWomen;

	@FindBy(xpath = "//*[@id='block_top_menu']//a[@title='T-shirts']")
	public static WebElement SelectTshirt;

}
