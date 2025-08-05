package decoratorPattern;

public class HouseBlend extends Beverage {
	public HouseBlend() {
		description = "House Blend Coffee";
	}

	public String getDescription() {
		return description;
	}

	public double cost() {
		return 0.89; // Base cost for House Blend
	}
}
