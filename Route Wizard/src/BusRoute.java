public class BusRoute {
    private String number;
    private String name;
    private Schedule schedule;

    public BusRoute(String number, String name, Schedule schedule) {
        this.number = number;
        this.name = name;
        this.schedule = schedule;
    }

    public BusRoute() {

    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public Schedule getSchedule() {
        return schedule;
    }
}
