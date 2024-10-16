public class WindowDetector implements Alarm{
    private boolean isActive = false;
    private boolean activeSirenWindow = false;

    @Override
    public void activate() {
        isActive = true;
        activeSirenWindow = true;
        System.out.println("Inbrottslarm och siren har aktiverats.");
        System.out.println("PIIPP PIIPP");
    }

    @Override
    public void deactivate() {
        isActive = false;
        activeSirenWindow = false;
        System.out.println("Inbrottslarm och siren är avaktiverat.");
    }

    @Override
    public boolean isActive() {
        return false;
    }

    @Override
    public String getLarmType() {
        return "Fönsterlarm";
    }

    public boolean isActiveSirenWindow() {
        return activeSirenWindow;
    }
}