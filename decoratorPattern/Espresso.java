package decoratorPattern;

public class Espresso extends Beverage {
	public Espresso() {
		description = "Espresso Coffee";
	}
	public String getDescription() {
		return description;
	}
	
	public double cost() {
		return 1.99; // Base cost for Espresso
	}
}
