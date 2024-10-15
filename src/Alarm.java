public interface Alarm {
        void activate();
        void deactivate();
        boolean isActive();
        String getLarmType();
}
