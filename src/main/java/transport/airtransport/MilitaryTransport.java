package transport.airtransport;

public class MilitaryTransport extends AirTransport {

    private boolean isInjectionSystem;
    private int countRockets;

    MilitaryTransport(
            int power,
            int maxVelocity, int mass, String brand, int wingSize, int minLengthRunWay,
                      boolean isInjectionSystem, int countRockets) {
        super(power, maxVelocity, mass, brand, wingSize, minLengthRunWay);
        this.countRockets = countRockets;
        this.isInjectionSystem = isInjectionSystem;
    }

    public boolean isInjectionSystem() {
        return isInjectionSystem;
    }

    public void setInjectionSystem(boolean injectionSystem) {
        isInjectionSystem = injectionSystem;
    }

    public int getCountRockets() {
        return countRockets;
    }

    public void setCountRockets(int countRockets) {
        this.countRockets = countRockets;
    }





}
