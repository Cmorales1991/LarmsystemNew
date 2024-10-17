public class DoorDetector implements Alarm{
    private boolean isActive = false;
    private boolean activeSirenDoor = false;
    private boolean active = false;

    @Override
    public void activate() {
        this.active = true;
        this.isActive = true;
        this.activeSirenDoor = true;
        System.out.println("Inbrottslarm och siren har aktiverats.");
        System.out.println("PIIPP PIIPP");

    }

    @Override
    public void deactivate() {
        this.isActive = false;
        this.activeSirenDoor = false;
        System.out.println("Inbrottslarm och siren är avaktiverat.");

    }

    @Override
    public boolean isActive() {
        return this.active= false;
    }

    @Override
    public String getLarmType() {
        return "Dörrlarm";
    }

    public boolean isActiveSirenDoor() {
        return activeSirenDoor;
    }
}
