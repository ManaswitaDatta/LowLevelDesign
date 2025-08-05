package decoratorPattern;

public class DarkRoast extends Beverage {
	public DarkRoast() {
		description = "Dark Roast Coffee";
	}

	public String getDescription() {
		return description;
	}

	public double cost() {
		return 0.99; // Base cost for Dark Roast
	}
}
