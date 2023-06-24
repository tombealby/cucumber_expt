package cucumber_expt.implementation;

public class Checkout {
	
	private int total;

	public int getTotal() {
		return total;
	}

	public void add(Integer itemCount, Integer itemCost) {
		total += itemCount * itemCost;
		
	}

}
