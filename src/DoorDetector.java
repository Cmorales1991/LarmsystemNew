public class DoorDetector implements Alarm{
    private boolean isActive = false;
    private boolean activeSirenDoor = false;

    @Override
    public void activate() {
        isActive = true;
        activeSirenDoor = true;
        System.out.println("Inbrottslarm och siren har aktiverats.");
        System.out.println("PIIPP PIIPP");
    }

    @Override
    public void deactivate() {
        isActive = false;
        activeSirenDoor = false;
        System.out.println("Inbrottslarm och siren är avaktiverat.");
    }

    @Override
    public boolean isActive() {
        return false;
    }

    @Override
    public String getLarmType() {
        return "Dörrlarm";
    }

    public boolean isActiveSirenDoor() {
        return activeSirenDoor;
    }
}
