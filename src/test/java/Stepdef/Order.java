package Stepdef;

import org.openqa.selenium.interactions.Actions;

import Base.testBase;
import Pages.CheckOutPage;
import Pages.HomePage;
import Pages.ListOfProductAfterSearchPage;
import Pages.SelectProduct;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Order {

	HomePage homePage = new HomePage();
	ListOfProductAfterSearchPage productList = new ListOfProductAfterSearchPage();
	SelectProduct selectProduct = new SelectProduct();
	CheckOutPage checkOut = new CheckOutPage();
	testBase testbase = new testBase();

	@Given("^I launch the page$")
	public void i_launch_the_page() throws Throwable {
		testBase.driver.get(testBase.reader.getUrl());
	}

	@When("^i hover on Women$")
	public void i_hover_on_Women() throws Throwable {
		Actions action = new Actions(testbase.driver);
		action.moveToElement(homePage.HoverWomen).perform();



	}

	@And("^i select T-shirt$")
	public void i_select_T_shirt() throws Throwable {
		Thread.sleep(5000);
		homePage.SelectTshirt.click();

	}

	@And("^i can see list of T-shirt page$")
	public void i_can_see_list_of_T_shirt_page() throws Throwable {
		Assert.assertTrue(productList.searchPageTitle.isDisplayed());
	}
	@And("^click on a product$")
	public void click_on_a_product() throws Throwable {
		productList.TshirtThumbnail.click();
		Thread.sleep(2000);

	}

	@And("^buy \"([^\"]*)\" T-shirt$")
	public void buy_T_shirt(String number) throws Throwable {
		selectProduct.numberOfProduct.clear();
		selectProduct.numberOfProduct.sendKeys(number);

	}

	@And("^select blue color$")
	public void select_blue_color() throws Throwable {
		selectProduct.selectColor.click();

	}

	@And("^click on Add to card$")
	public void click_on_Add_to_card() throws Throwable {
		selectProduct.addToCard.click();
		Thread.sleep(3000);

	}

	@Then("^app shows the order information$")
	public void app_shows_the_order_information() throws Throwable {

	}

}
