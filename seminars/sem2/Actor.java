package sem2;

public abstract class Actor implements ActorBehaviour {

    protected boolean isTakeOrder;
    protected boolean isMakeOrder;
    protected final String name;

    public Actor(String name) {
        this.name = name;
    }

    public abstract String getName(); // Abstract method fot getting name;

    // Realization of interface ActorBehaviour:
    @Override
    public void setMakeOrder(boolean makeOrder) {
        this.isMakeOrder = makeOrder;
    }

    @Override
    public void setTakeOrder(boolean takeOrder) {
        this.isTakeOrder = takeOrder;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                '}';
    }
}
