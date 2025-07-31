package strategyPattern;

public class ModelDuck extends Duck {
    public ModelDuck() {
        super(new FlyWithoutWings(), new Squeak());
    }
    
    public void display() {
        System.out.println("I'm a decoy!");
    }
}