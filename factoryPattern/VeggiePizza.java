package factoryPattern;

public class VeggiePizza extends Pizza {
	private PizzaIngredientFactory ingredientFactory;
	public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
	public void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		veggies = ingredientFactory.createVeggies();
		cheese = ingredientFactory.createCheese();
	}
}
