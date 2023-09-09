import java.time.LocalTime;
// import java.util.ArrayList;
import java.util.List;

public class Schedule {
    private List<LocalTime> departureTimes;
    private int intervalMinutes;

    public void addDepartureTime(LocalTime time) {
        this.departureTimes.add(time);
    }

    public List<LocalTime> getDepartureTimes() {
        return this.departureTimes;
    }

    public int getIntervalMinutes() {
        return this.intervalMinutes;
    }

    public void addStop(BusStop stop1) {
    }

    public void addStops(List<BusStop> stops) {
    }

    public String getStops(){
        return null;
    }
}

