package transport.landtransport;


import transport.Transport;

public class LandTransport extends Transport {

    private int numbersOfWheels;
    private int fuelConsumption;

    LandTransport(int power, int maxVelocity, int mass, String brand, int numbersOfWheels, int fuelConsumption) {
        super(power, maxVelocity, mass, brand);
        this.fuelConsumption = fuelConsumption;
        this.numbersOfWheels = numbersOfWheels;
    }

    public int getNumbersOfWheels() {
        return numbersOfWheels;
    }

    public void setNumbersOfWheels(int numbersOfWheels) {
        this.numbersOfWheels = numbersOfWheels;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}
