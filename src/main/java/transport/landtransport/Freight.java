package transport.landtransport;

public class Freight extends LandTransport {

    private int liftingCapacity;

    public Freight(
            int power,
            int maxVelocity,
            int mass,
            String brand,
            int numbersOfWheels,
            int fuelConsumption,
            int liftingCapacity
    ) {
        super(power, maxVelocity, mass, brand, numbersOfWheels, fuelConsumption);
        this.liftingCapacity = liftingCapacity;
    }

    public int getLiftingCapacity() {
        return liftingCapacity;
    }

    public void setLiftingCapacity(int liftingCapacity) {
        this.liftingCapacity = liftingCapacity;
    }



        }



