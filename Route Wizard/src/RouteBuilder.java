import java.util.ArrayList;
import java.util.List;

public class RouteBuilder {
    private BusRoute route;

    public RouteBuilder(String number, String name) {
        route = new BusRoute(number, name, new Schedule());
    }

    public RouteBuilder addStop(BusStop stop) {
        route.getSchedule().addStop(stop);
        return this;
    }

    public RouteBuilder addStops(List<BusStop> stops) {
        route.getSchedule().addStops(stops);
        return this;
    }

    public BusRoute build() {
        return route;
    }

    public void setSchedule(Schedule schedule) {
    }

    public void setBusRoute(String busNum) {
    }

    public void setBusStop(BusStop busStop) {
    }

    public String getBusStops(String busNum) {
        return null;
    }

    public ArrayList<String> getBusNumbers() {
        return null;
    }

    public String getRoute(String busNum) {
        return null;
    }

    public boolean saveRoute(String busNum) {
        return false;
    }

    public void addStop(String busStop) {
    }

    public void setBusRoute(BusRoute busRoute) {
    }
}
