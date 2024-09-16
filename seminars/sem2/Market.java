package sem2;

import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehaviour, QueueBehaviour {

    private List<Actor> queue = new ArrayList<>();
    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + " came to the market.");
        takeInQueue(actor); // actor get to the queue;
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
            System.out.println(actor.getName() + " made the order.");
        }
    }

    @Override
    public void giveOrder() {
        for (Actor actor : queue) {
            System.out.println(actor.getName() + " got the order.");
        }
    }

    @Override
    public void releaseFromQueue() {
        while (!queue.isEmpty()) {
            Actor actor = queue.remove(0);  // delete the first actor from queue;
            System.out.println(actor.getName() + " left the queue.");
        }
    }
}
