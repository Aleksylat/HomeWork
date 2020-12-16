package transport.airtransport;


import transport.Transport;

public class AirTransport extends Transport {
    private int wingSize;
    private int minLengthRunWay;

    AirTransport(int power, int maxVelocity, int mass, String brand, int wingSize, int minLengthRunWay) {
        super(power, maxVelocity, mass, brand);
        this.wingSize = wingSize;
        this.minLengthRunWay = minLengthRunWay;
    }

    public int getWingSize() {
        return wingSize;
    }

    public void setWingSize(int wingSize) {
        this.wingSize = wingSize;
    }

    public int getMinLengthRunWay() {
        return minLengthRunWay;
    }

    public void setMinLengthRunWay(int minLengthRunWay) {
        this.minLengthRunWay = minLengthRunWay;
    }
}
