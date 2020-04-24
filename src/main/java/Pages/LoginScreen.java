package Pages;

import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.testBase;
import cucumber.api.DataTable;

public class LoginScreen {

	public LoginScreen() {
		PageFactory.initElements(testBase.driver, this);
	}

	@FindBy(xpath = "//div[@class='row']//h3")
	public static WebElement Authentication;
	
	@FindBy(xpath = "//*[@id='email']")
	public static WebElement email;
	
	@FindBy(xpath = "//*[@id='passwd']")
	public static WebElement password;
	
	@FindBy(xpath = "//*[@id='SubmitLogin']")
	public static WebElement signIn;
	
	public static void EnterUserAndPassword(DataTable dataTable) {
		Map<String, String> map = dataTable.asMap(String.class, String.class);
		email.sendKeys(map.get("username"));
		password.sendKeys(map.get("password"));
		signIn.click();
	}
	
}
