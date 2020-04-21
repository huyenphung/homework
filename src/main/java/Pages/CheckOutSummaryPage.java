package Pages;



import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.testBase;
import cucumber.api.DataTable;

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

	@FindBy(xpath = "//*[@id='columns']//span[@class='navigation_page']")
	public static WebElement listOfProductScreen;

	// add 1 more Blouse
	public static String addMoreBlouse(String product) {
		testBase.driver.findElement(By.xpath("//img[@alt='" + product
				+ "']//parent::a//parent::td//following-sibling::td[@class='cart_quantity text-center']//i[@class='icon-plus']"))
				.click();

		return product;
	}



//Remove "Faded Short Sleeve T-shirts" product
public static String remove1Product(String product) {
	testBase.driver.findElement(By.xpath("//img[@alt='" + product
			+ "']//parent::a//parent::td//following-sibling::td[@data-title='Delete']//i[@class='icon-trash']"))
			.click();

	return product;
}

public static String myProduct1(DataTable dataTable) throws InterruptedException {

	Map<String, String> map = dataTable.asMap(String.class, String.class);
	WebElement x = testBase.driver
			.findElement(By.xpath("//img[@alt='" + map.get("item1") + "']//parent::a//parent::td//parent::tr//p//a"));
	String a = x.getText();
	return a;
}

public static String expectedItem1(DataTable dataTable) throws InterruptedException {

	Map<String, String> map = dataTable.asMap(String.class, String.class);
	String a = map.get("item1");
	return a;
}

public static String myProduct2(DataTable dataTable) throws InterruptedException {

	Map<String, String> map = dataTable.asMap(String.class, String.class);
	WebElement x = testBase.driver
			.findElement(By.xpath("//img[@alt='" + map.get("item2") + "']//parent::a//parent::td//parent::tr//p//a"));
	String a = x.getText();
	return a;
}

public static String expectedItem2(DataTable dataTable) throws InterruptedException {

	Map<String, String> map = dataTable.asMap(String.class, String.class);
	String a = map.get("item2");
	return a;
}

public static String myQuantity1(DataTable dataTable) throws InterruptedException {

	Map<String, String> map = dataTable.asMap(String.class, String.class);
	WebElement x = testBase.driver
			.findElement(By.xpath("//img[@alt='" + map.get("item1")
					+ "']//parent::a//parent::td//following-sibling::td[@class='cart_quantity text-center']//input[@type='hidden' and @value]"));
	String a = x.getAttribute("value");
	return a;

}

public static String expectedquantity1(DataTable dataTable) throws InterruptedException {

	Map<String, String> map = dataTable.asMap(String.class, String.class);
	String a = map.get("quantity1");
	return a;
}

public static String myQuantity2(DataTable dataTable) throws InterruptedException {

	Map<String, String> map = dataTable.asMap(String.class, String.class);
	WebElement x = testBase.driver.findElement(By.xpath("//img[@alt='" + map.get(
			"item2")
			+ "']//parent::a//parent::td//following-sibling::td[@class='cart_quantity text-center']//input[@type='hidden' and @value]"));
	String a = x.getAttribute("value");
	return a;

}

public static String expectedquantity2(DataTable dataTable) throws InterruptedException {

	Map<String, String> map = dataTable.asMap(String.class, String.class);
	String a = map.get("quantity2");
	return a;
}
}
