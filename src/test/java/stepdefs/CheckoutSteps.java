package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutSteps {
	
	@Given("^the price of a \"(.*?)\" is (\\d+)c$")
	public void the_price_of_a_is_c(String name, int price) {
	    int bananaPrice = price;
	}

	@When("I checkout {int} {string}")
	public void i_checkout(Integer int1, String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("the total price should be 40c")
	public void the_total_price_should_be_40c() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}
