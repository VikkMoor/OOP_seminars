package sem2;

public class Client extends Actor{
    public Client(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return name;
    }
}
