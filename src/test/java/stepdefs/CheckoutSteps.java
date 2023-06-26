package stepdefs;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import cucumber_expt.implementation.Checkout;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutSteps {

	private Map<String, Integer> priceCatalog = new HashMap<>();
	private Checkout checkout = new Checkout();

	@Given("^the price of a \"(.*?)\" is (\\d+)c$")
	public void the_price_of_a_is_c(String name, int price) {
		priceCatalog.put(name, price);
	}

	@When("I checkout {int} {string}")
	public void i_checkout(Integer itemCount, String itemName) {
		checkout.add(itemCount, priceCatalog.get(itemName));
	}

	@Then("the total price should be {int}c")
	public void the_total_price_should_be_c(Integer totalPrice) {
	    assertEquals(totalPrice, (Integer)checkout.getTotal());
	}


}
