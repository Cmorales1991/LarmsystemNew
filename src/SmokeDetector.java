public class SmokeDetector implements Alarm {
    private boolean isActive = false;
    private boolean sprinklerActive = false;

    @Override
    public void activate() {
        isActive = true;
        sprinklerActive = true;
        System.out.println("Brandlarm har aktiverats. Sprinklersystemet aktiveras i rum.");
    }

    @Override
    public void deactivate() {
        isActive = false;
        sprinklerActive = false;
        System.out.println("Brandlarm och Sprinklersystem är avktiverat.");
    }

    @Override
    public boolean isActive() {
        return false;
    }

    @Override
    public String getLarmType() {
        return "Brandlarm";
    }

    public boolean isSprinklerActive() {
        return sprinklerActive;
    }
}
