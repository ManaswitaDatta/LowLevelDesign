package strategyPattern;

public class FlyWithoutWings implements FlyBehaviour{
	public void fly() {
		System.out.println("I can't fly!");
	}
}
