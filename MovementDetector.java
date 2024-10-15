public class MovementDetector implements Alarm{
    private boolean isActive = false;
    private boolean activeSirenMove = false;
    private boolean activeCamera = false;

    @Override
    public void activate() {
        isActive = true;
        activeSirenMove = true;
        activeCamera = true;
        System.out.println("Rörlelselarm med siren och kamera inspelning aktiverat.");
        System.out.println("PIIPP PIIPP");

    }

    @Override
    public void deactivate() {
        isActive = false;
        activeSirenMove = false;
        activeCamera = false;
        System.out.println("Rörlelselarm med siren och kamera inspelning avaktiverat.");
    }

    @Override
    public boolean isActive() {
        return false;
    }

    @Override
    public String getLarmType() {
        return "Rörelselarm";
    }

    public boolean isActiveSirenMove() {
        return activeSirenMove;
    }

    public boolean isActiveCamera() {
        return activeCamera;
    }
}