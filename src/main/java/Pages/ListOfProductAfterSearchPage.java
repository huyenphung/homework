package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.testBase;

public class ListOfProductAfterSearchPage {

	public ListOfProductAfterSearchPage() {
		PageFactory.initElements(testBase.driver, this);
	}

	@FindBy(xpath = "//*[@id='center_column']//span[@class='cat-name']")
	public static WebElement searchPageTitle;

	@FindBy(xpath = "//*[@id='center_column']/ul/li/div/div[2]/h5/a")
	public static WebElement TshirtThumbnail;
}
