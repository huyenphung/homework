package Stepdef;

import org.openqa.selenium.interactions.Actions;

import Base.testBase;
import Pages.CheckOutPage;
import Pages.CheckOutSummaryPage;
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
	CheckOutSummaryPage checkOutSummary = new CheckOutSummaryPage();
	testBase testbase = new testBase();

	@Given("^I launch the page$")
	public void i_launch_the_page() {
		testBase.driver.get(testBase.reader.getUrl());
	}

	@When("^i hover on Women$")
	public void i_hover_on_Women() {

		Actions action = new Actions(testbase.driver);
		action.moveToElement(homePage.HoverWomen).clickAndHold().perform();
		

	}

	@And("^i select T-shirt$")
	public void i_select_T_shirt() throws InterruptedException {
		Thread.sleep(2000);
		homePage.SelectTshirt.click();


	}

	@And("^i can see list of T-shirt page$")
	public void i_can_see_list_of_T_shirt_page() {
		Assert.assertTrue(productList.searchPageTitle.isDisplayed());
	}
	@And("^click on a product$")
	public void click_on_a_product() throws InterruptedException {
		productList.TshirtThumbnail.click();
		Thread.sleep(2000);

	}

	@And("^buy \"([^\"]*)\" T-shirt$")
	public void buy_T_shirt(String number) {
		selectProduct.numberOfProduct.clear();
		selectProduct.numberOfProduct.sendKeys(number);

	}

	@And("^select blue color$")
	public void select_blue_color() {
		selectProduct.selectColor.click();

	}

	@And("^click on Add to card$")
	public void click_on_Add_to_card() throws InterruptedException {
		selectProduct.addToCard.click();
		Thread.sleep(3000);

	}

	@And("^app shows \"([^\"]*)\" on checkout popup$")
	public void app_shows_number_of_product_is_on_checkout_popup(String expected) {
		Assert.assertEquals(expected, checkOut.TitleOfProduct.getText());
	}

	@And("^click on Proceed to checkout$")
	public void click_on_Proceed_to_checkout() {
		checkOut.clickOnCheckOutBtn.click();
	}

	@Then("^Verify information of product is \"([^\"]*)\" products$")
	public void verify_number_of_product_on_is_on_Shoping_card_summary_screen(String expected)
			throws InterruptedException {
		Thread.sleep(3000);
		Assert.assertEquals(expected, checkOutSummary.informationOfProduct.getAttribute("value"));

	}

	@And("^Buy one more product$")
	public void buy_more_product() throws InterruptedException {
		checkOutSummary.addMore.click();
		Thread.sleep(3000);
	}

	@And("^verify the price of ordered products is \"([^\"]*)\"$")
	public void verify_the_price_of_ordered_products_is(String price) {
		Assert.assertEquals(price, checkOutSummary.totalPrice.getText());

	}

	@And("^minus one production$")
	public void minus_one_production() throws InterruptedException {

		checkOutSummary.MinusProduct.click();
		Thread.sleep(3000);
	}

	@Then("^verify the total price of the product is \"([^\"]*)\"$")
	public void verify_the_total_price_of_the_product_is(String price) throws InterruptedException {
		Assert.assertEquals(price, checkOutSummary.totalPrice.getText());
		Thread.sleep(3000);
	}

}
