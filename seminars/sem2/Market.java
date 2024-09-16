package sem2;

import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehaviour, QueueBehaviour {

    private List<Actor> queue = new ArrayList<>();
    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + " came to the market.");
        takeInQueue(actor); // Actor get to the queue;
    }

    @Override
    public void releaseFromMarket(List<Actor> actorList) {
        for (Actor actor : actorList) {
            System.out.println(actor.getName() + " left the market.");
        }
    }

    @Override
    public void update() {
        takeOrders();
        giveOrder();
        releaseFromQueue();
    }

    @Override
    public void takeInQueue(Actor actor) {
        queue.add(actor);
        System.out.println(actor.getName() + " added to the queue.");
    }

    @Override
    public void takeOrders() {
        for (Actor actor : queue) {
            if (!actor.isMakeOrder()) {  // If the customer didnt make an order yet;
                actor.setMakeOrder(true);
                System.out.println(actor.getName() + " made the order.");
            }
        }
    }

    @Override
    public void giveOrder() {
        for (Actor actor : queue) {
            if (actor.isMakeOrder() && !actor.isTakeOrder()) {  // If the order was made but wasn't get;
                actor.setTakeOrder(true);
                System.out.println(actor.getName() + " got the order.");
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        List<Actor> actorsToRelease = new ArrayList<>();
        for (Actor actor : queue) {
            if (actor.isTakeOrder()) {  // Actor can leave the queue if he got the order;
                actorsToRelease.add(actor);
                System.out.println(actor.getName() + " is leaving the queue.");
            }
        }
        queue.removeAll(actorsToRelease);  // Remove all actors which got the orders;
    }
}
