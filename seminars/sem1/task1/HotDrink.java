package sem1.task1;

public class HotDrink extends Product {
    private int volume;
    private  int temp;

    public HotDrink(String name, Integer price, int volume, int temp) {
        super(name, price);
        this.volume = volume;
        this.temp = temp;
    }

    public HotDrink(String name, Integer price, int temp) {
        super(name, price);
        this.temp = temp;
    }

    public int getTemp() {
        return temp;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "name=" + getName() +
                ", volume=" + volume +
                ", temp=" + temp +
                '}';
    }
}
