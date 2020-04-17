package Pages;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.testBase;
import cucumber.api.DataTable;

public class ListOfProductAfterSearchPage {
	public static testBase testbase = new testBase();
	public ListOfProductAfterSearchPage() {
		PageFactory.initElements(testBase.driver, this);
	}

	@FindBy(xpath = "//*[@id='center_column']//span[@class='cat-name']")
	public static WebElement searchPageTitle;

	@FindBy(xpath = "//*[@id='center_column']/ul/li/div/div[2]/h5/a")
	public static WebElement TshirtThumbnail;

	@FindBy(xpath = "//*[@id='categories_block_left']/h2")
	public static WebElement listOfWomendress;

	@FindBy(xpath = "//img[@title='Faded Short Sleeve T-shirts']")
	public static WebElement ThishoverOnProduct;


	@FindBy(xpath = "//div[@id='layer_cart']//span[@title='Continue shopping']")
	public static WebElement ContinueShopping;

	@FindBy(xpath = "//a[@title='View my shopping cart']")
	public static WebElement hoverOnListOfCart;

	@FindBy(xpath = "// li//div//a//img[@itemprop]")
	public static WebElement listOfProduct;

	public static String addToCartBtn(String number) {
		testBase.driver
				.findElement(By.xpath("//div[@class='product-container']//a[@data-id-product='" + number
						+ "' and @title='Add to cart']"))
				.click();

		return number;
	}

	public static String verifyItem1(DataTable dataTable) throws InterruptedException {
		Thread.sleep(3000);
		Map<String, String> map = dataTable.asMap(String.class, String.class);
		WebElement x = testBase.driver
				.findElement(By.xpath("//div[@class='cart_block_list']//a[@title='" + map.get("item1") + "']"));
		String a = x.getAttribute("title");
		return a;
	}

	public static String verifyItem2(DataTable dataTable) throws InterruptedException {
		Thread.sleep(3000);
		Map<String, String> map = dataTable.asMap(String.class, String.class);
		WebElement y = testBase.driver
				.findElement(By.xpath("//div[@class='cart_block_list']//a[@title='" + map.get("item2") + "']"));
		String b = y.getAttribute("title");
		return b;
	}

	public static void hoverOnProduct(String product) {
		WebElement x = testBase.driver.findElement(By.xpath("//img[@title='" + product + "']"));
		Actions action = new Actions(testbase.driver);
		action.moveToElement(x).clickAndHold().perform();
	}






}
