package factoryPattern;

public class ClamPizza extends Pizza {
	private PizzaIngredientFactory ingredientFactory;
	public ClamPizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
	public void prepare() {
		System.out.println("Preparing " + name);
		clam = ingredientFactory.createClam();
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		veggies = ingredientFactory.createVeggies();
		pepperoni = ingredientFactory.createPepperoni();
	}
}
