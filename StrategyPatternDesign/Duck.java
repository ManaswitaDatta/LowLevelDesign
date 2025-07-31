package strategyPattern;

public abstract class Duck {
    private FlyBehaviour fb;
    private QuackBehaviour qb;
    
    public Duck(FlyBehaviour fb, QuackBehaviour qb) {
        this.fb = fb;
        this.qb = qb;
    }
    
    public abstract void display();
    
    public void performFly() {
        fb.fly();
    }
    
    public void setFlyBehaviour(FlyBehaviour newFb) {
        fb = newFb;
    }
    
    public void performQuack() {
        qb.quack();
    }
    
    public void setQuackBehaviour(QuackBehaviour newQb) {
        qb = newQb;
    }
    
    public void swim() {
        System.out.println("All ducks can float, even decoys");
    }
}