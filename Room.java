import java.util.ArrayList;
import java.util.List;

public class Room {
    private String name;
    private List<Alarm> larmLista;
    protected static List<Room> rooms = new ArrayList<>();
    protected List<Alarm> roomAlarms = new ArrayList<>();
    protected boolean alarmsActive = false;


    public Room(String name) {
        this.name = name;
        this.larmLista = new ArrayList<>();
        rooms.add(this);
        this.alarmsActive = false;

    }

    public void addLarm(Alarm alarm) {
        larmLista.add(alarm);
        roomAlarms.add(alarm);
    }

    public List<Alarm> getAllAlarms() {
        return larmLista;
    }

    public List<Alarm> getRoomAlarms() {
        return roomAlarms;
    }


    public String getName() {
        return name;
    }

    public void activateAllAlarms() {
        for (Alarm alarm : roomAlarms) {
            alarm.activate();
        }
    }

    public void deactivateAllAlarms() {
        for (Alarm alarm : roomAlarms) {
            alarm.deactivate();
        }
    }

    public static void activeAllAlarms() {
        for (Room room : rooms) {
            room.activateAllAlarms();
        }
        System.out.println("Alla larm har aktiverats.");
    }

    public static void deactiveAllAlarms() {
        for (Room room : rooms) {
            room.deactivateAllAlarms();
        }
        System.out.println("Alla larm har avaktiverats.");
    }

    public static void restoreAlarms() {
        for (Room room : rooms) {
            room.deactivateAllAlarms();
        }
        System.out.println("Alla larm har återställts.");
    }

    public boolean areAlarmsActive() {
        for (Alarm alarm : roomAlarms) {
            if (alarm.isActive()) {
                return true;
            }
        }
        return false;
    }

    public static void createRooms() {
        Room kitchen = new Room("Kök");
        kitchen.addLarm(new SmokeDetector());
        kitchen.addLarm(new WindowDetector());

        Room livingroom = new Room("Vardagsrum");
        livingroom.addLarm(new SmokeDetector());
        livingroom.addLarm(new DoorDetector());
        livingroom.addLarm(new WindowDetector());

        Room entry = new Room("Hall");
        entry.addLarm(new DoorDetector());
        entry.addLarm(new SmokeDetector());
        entry.addLarm(new WindowDetector());

        Room bedroom1 = new Room("Sovrum 1");
        bedroom1.addLarm(new SmokeDetector());
        bedroom1.addLarm(new WindowDetector());

        Room bedroom2 = new Room("Sovrum 2");
        bedroom2.addLarm(new DoorDetector());
        bedroom2.addLarm(new SmokeDetector());
        bedroom2.addLarm(new WindowDetector());
        bedroom2.addLarm(new MovementDetector());

        Room garage = new Room("Garage");
        garage.addLarm(new SmokeDetector());
        garage.addLarm(new WindowDetector());
        garage.addLarm(new DoorDetector());

        Room backside = new Room("Baksida/pool område");
        backside.addLarm(new MovementDetector());
    }

    public static void showInfo() {
        if (rooms.isEmpty()) {
            System.out.println("Inga rum är skapade.");
            return;
        }
        for (Room room : rooms) {
            System.out.println("Rum: " + room.getName());
            System.out.println("Detektorer:");
            if (room.getRoomAlarms().isEmpty()) {
                System.out.println("  Inga larm installerade.");
            } else {
                for (Alarm alarm : room.getRoomAlarms()) {
                    System.out.println("  - " + alarm.getLarmType());
                }
            }
        }
    }

}
