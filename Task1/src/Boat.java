import java.util.ArrayList;
import java.util.List;

public class Boat {
    private List<Pier> routeOfBoat;
    private int number;
    private int numberOfSeats;
    private Pier finalPier;
    public Boat() {
        this.routeOfBoat = new ArrayList<>();
        this.numberOfSeats = (int)(Math.random()*14+3);
    }

    public List<Pier> getRouteOfBoat() {
        return routeOfBoat;
    }

    public void setRouteOfBoat(Pier pier) {
        this.routeOfBoat.add(pier);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }


}
