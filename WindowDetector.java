public class WindowDetector implements Alarm{
    private boolean isActive = false;
    private boolean activeSirenWindow = false;
    private boolean active = false;


    @Override
    public void activate() {
        this.active = true;
        this.isActive = true;
        this.activeSirenWindow = true;
        System.out.println("Inbrottslarm och siren har aktiverats.");
        System.out.println("PIIPP PIIPP");

    }

    @Override
    public void deactivate() {
        this.active = false;
        this.isActive = false;
        this.activeSirenWindow = false;
        System.out.println("Inbrottslarm och siren är avaktiverat.");

    }

    @Override
    public boolean isActive() {
        return this.active = false;
    }

    @Override
    public String getLarmType() {
        return "Fönsterlarm";
    }

    public boolean isActiveSirenWindow() {
        return activeSirenWindow;
    }
}