package Pages;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Base.testBase;
import cucumber.api.DataTable;

public class ListOfCart {

	public ListOfCart() {
		PageFactory.initElements(testBase.driver, this);
	}

	public static String myProduct1(DataTable dataTable) throws InterruptedException {

		Map<String, String> map = dataTable.asMap(String.class, String.class);
		WebElement x = testBase.driver
				.findElement(By.xpath("//a[@title='"+map.get("item1")+"']"));
		String a = x.getAttribute("title");
		return a;
	}
	public static String myQuantity1(DataTable dataTable) throws InterruptedException {

		Map<String, String> map = dataTable.asMap(String.class, String.class);
		WebElement x = testBase.driver
				.findElement(By.xpath("//a[@title='"+map.get("item1")+"']//following-sibling::div//span[@class='quantity']"));
		String a = x.getText();
		return a;
	}
	
	
	
	public static String myProduct2(DataTable dataTable) throws InterruptedException {

		Map<String, String> map = dataTable.asMap(String.class, String.class);
		WebElement x = testBase.driver
				.findElement(By.xpath("//a[@title='"+map.get("item2")+"']"));
		String a = x.getAttribute("title");
		return a;
	}
	
	public static String myQuantity2(DataTable dataTable) throws InterruptedException {

		Map<String, String> map = dataTable.asMap(String.class, String.class);
		WebElement x = testBase.driver
				.findElement(By.xpath("//a[@title='"+map.get("item2")+"']//following-sibling::div//span[@class='quantity']"));
		String a = x.getText();
		return a;
	}
}
