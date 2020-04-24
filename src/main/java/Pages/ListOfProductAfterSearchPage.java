package Pages;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

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
	public static WebElement ListOfCart;
	

	public static String quantity() {

		WebElement x = testBase.driver
				.findElement(By.xpath("//div[@class='header-container']//span[@class='ajax_cart_quantity']"));
		String a = x.getText();
		return a;
	}

	public static String addToCartBtn(String product) {
		testBase.driver
				.findElement(By.xpath(
						"//div[@class='product-container']//a[@title='" + product
								+ "']//parent::h5//parent::div//a[@title='Add to cart']"))
				.click();

		return product;
	}

	public static void hoverOnProduct(String product) {
		WebElement x = testBase.driver.findElement(By.xpath("//img[@title='" + product + "']"));
		Actions action = new Actions(testbase.driver);
		action.moveToElement(x).clickAndHold().perform();
	}

	public static String verifyItem1(DataTable dataTable) throws InterruptedException {

		Map<String, String> map = dataTable.asMap(String.class, String.class);
		WebElement x = testBase.driver
				.findElement(By.xpath("//div[@class='cart_block_list']//a[@title='" + map.get("item1") + "']"));
		String a = x.getAttribute("title");
		return a;
	}


	public static String verifyItem2(DataTable dataTable) throws InterruptedException {

		Map<String, String> map = dataTable.asMap(String.class, String.class);
		WebElement y = testBase.driver
				.findElement(By.xpath("//div[@class='cart_block_list']//a[@title='" + map.get("item2") + "']"));
		String b = y.getAttribute("title");
		return b;
	}

	public static void addToCart(String product) {
		Actions action = new Actions(testbase.driver);
		JavascriptExecutor js = (JavascriptExecutor) testbase.driver;
		WebElement productImage = testBase.driver.findElement(By.xpath("//img[@title='" + product + "']"));
		WebElement btnAddToCart = testBase.driver.findElement(By.xpath("//div[@class='product-container']//a[@title='" + product
				+ "']//parent::h5//parent::div//a[@title='Add to cart']"));
		
		js.executeScript("arguments[0].scrollIntoView();", productImage);
		
		
		action.moveToElement(productImage).moveToElement(btnAddToCart).click().build().perform();
		
	}

	public static void waitForPopupDisplayed() {
		waitForElementAttributeContainValue("//*[@id='layer_cart']", "style", "block", 7);
	}
	
	public static void waitForPopupClosed() {
		waitForElementAttributeContainValue("//*[@id='layer_cart']", "style", "none", 7);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void waitForElementAttributeContainValue(String _xpath, String _attributeName, String _attributeValue,
			int _timeOutInSecond) {
		WebDriverWait wait = new WebDriverWait(testbase.driver, _timeOutInSecond);

		wait.until(new ExpectedCondition<Boolean>() {
			@Override
			public Boolean apply(WebDriver driver) {
				return driver.findElement(By.xpath(_xpath)).getAttribute(_attributeName).contains(_attributeValue);
			}
		});
	}




}
