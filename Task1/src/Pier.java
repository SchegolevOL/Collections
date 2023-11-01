import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pier {
    private ArrayList<Boat> boats;
    private String name;
    private HashMap<String, Integer> averageTimePassenger;
    private HashMap<String, Integer> averageTimeBoat;

    public Pier() {
        averageTimePassenger = new HashMap<String, Integer>();
        averageTimeBoat = new HashMap<String, Integer>();
        boats = new ArrayList<>();
    }

    public Map<String, Integer> getAverageTimePassenger() {
        return averageTimePassenger;
    }

    public void setAverageTimePassenger(String partDay, int time) {
        averageTimePassenger.put(partDay, time);
    }

    public Map<String, Integer> getAverageTimeBoat() {
        return averageTimeBoat;
    }

    public void setAverageTimeBoat(String partDay, int time) {
        averageTimeBoat.put(partDay, time);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {

        return "Pear: " + this.name+"\n"
                ;
    }
}
