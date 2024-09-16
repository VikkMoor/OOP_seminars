package sem2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();

        // Создаем клиентов
        Actor client1 = new Client("John");
        Actor client2 = new Client("Alice");
        Actor client3 = new Client("Bob");

        // Принятие клиентов в магазин
        market.acceptToMarket(client1);
        market.acceptToMarket(client2);
        market.acceptToMarket(client3);

        // Обновляем состояние магазина
        market.update();

        // Освобождаем клиентов из магазина
        market.releaseFromMarket(Arrays.asList(client1, client2, client3));
    }
}
