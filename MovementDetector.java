public class MovementDetector implements Alarm{
    private boolean isActive = false;
    private boolean activeSirenMove = false;
    private boolean activeCamera = false;
    private boolean active = false;


    @Override
    public void activate() {
        this.active = true;
        this.isActive = true;
        this.activeSirenMove = true;
        this.activeCamera = true;
        System.out.println("Rörlelselarm med siren och kamera inspelning aktiverat.");
        System.out.println("PIIPP PIIPP");

    }

    @Override
    public void deactivate() {
        this.active = false;
        this.isActive = false;
        this.activeSirenMove = false;
        this.activeCamera = false;
        System.out.println("Rörlelselarm med siren och kamera inspelning avaktiverat.");
    }

    @Override
    public boolean isActive() {
        return this.active = false;
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