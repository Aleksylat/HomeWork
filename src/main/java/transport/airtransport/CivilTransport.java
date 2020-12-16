package transport.airtransport;

public class CivilTransport extends AirTransport {

    private int countPassengers;
    private boolean isBusinessClass;

    CivilTransport(
            int power,
            int maxVelocity,
            int mass, String brand, int wingSize, int minLengthRunWay,
            int countPassengers, boolean isBusinessClass) {
        super(power, maxVelocity, mass, brand, wingSize, minLengthRunWay);
        this.countPassengers = countPassengers;
        this.isBusinessClass = isBusinessClass;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public void setCountPassengers(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    public boolean isBusinessClass() {
        return isBusinessClass;
    }

    public void setBusinessClass(boolean businessClass) {
        isBusinessClass = businessClass;
    }


        }


