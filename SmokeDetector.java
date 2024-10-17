public class SmokeDetector implements Alarm {
    private boolean isActive = false;
    private boolean sprinklerActive = false;
    private boolean active = false;


    @Override
    public void activate() {
        this.active = true;
        this.isActive = true;
        this.sprinklerActive = true;
        System.out.println("Brandlarm har aktiverats. Sprinklersystemet aktiveras i rum.");
    }

    @Override
    public void deactivate() {
        this.isActive = false;
        this.sprinklerActive = false;
        System.out.println("Brandlarm och Sprinklersystem är avktiverat.");
    }

    @Override
    public boolean isActive() {
        return this.active;
    }

    @Override
    public String getLarmType() {
        return "Brandlarm";
    }

    public boolean isSprinklerActive() {
        return sprinklerActive;
    }
}
