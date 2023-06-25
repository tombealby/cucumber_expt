package stepdefs.fruit;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

import cucumber_expt.fruit.Fruit;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;

public class FruitSteps {
	
	@DataTableType
	public Fruit authorEntry(Map<String, String> entry) {
        return new Fruit(
                entry.get("name"),
                entry.get("color"));
        }
	
	@Given("the system knows about the following Fruit")
	public void the_system_knows_about_the_following_fruit(List<Fruit> fruitList) throws FileNotFoundException, UnsupportedEncodingException {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		final Gson gson = new Gson();
		final PrintWriter writer = new PrintWriter("fruit.json", "UTF-8");
		final String json = gson.toJson(fruitList);
		writer.println(json);
		writer.close();
	}

}
