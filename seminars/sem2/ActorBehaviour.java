package sem2;

public interface ActorBehaviour {
    void setMakeOrder(boolean makeOrder);

    void setTakeOrder(boolean takeOrder);
    boolean isMakeOrder();

    boolean isTakeOrder();
}
