package transport.landtransport;

public class Passenger extends LandTransport {

    private String bodyType;
    private int countPassengers;

    public Passenger(
            int power,
            int maxVelocity,
            int mass,
            String brand,
            int numbersOfWheels,
            int fuelConsumption,
            String bodyType,
            int countPassengers
    ) {
        super(power, maxVelocity, mass, brand, numbersOfWheels, fuelConsumption);
        this.bodyType = bodyType;
        this.countPassengers = countPassengers;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public void setCountPassengers(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    public void maxWay(int time) {
        System.out.println("За время: " + time + " ч " + " автомобиль: " + getBrand()
                + " двигаясь с максимальной скоростью " + getMaxVelocity() + " км/ч " + " проедет " +
                getMaxVelocity() * time + "км  и израсходует " + getSpentOn(time) + " литров топлива.");
    }

    private double getSpentOn(int time) {
        return (double) ((getMaxVelocity() * time) / 100) * getFuelConsumption();
    }

}

