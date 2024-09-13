package sem2;

public interface QueueBehaviour {
    void takeInQueue(Actor actor);
    void takeOrders();
    void  giveOrder();
    void releaseFromQueue();
}
