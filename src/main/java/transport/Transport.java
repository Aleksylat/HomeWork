package transport;

public class Transport {

    private int power;
    private int maxVelocity;
    private int mass;
    private String brand;

    public Transport(int power, int maxVelocity, int mass, String brand) {
        this.power = power;
        this.maxVelocity = maxVelocity;
        this.mass = mass;
        this.brand = brand;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getMaxVelocity() {
        return maxVelocity;
    }

    public void setMaxVelocity(int maxVelocity) {
        this.maxVelocity = maxVelocity;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPowerInKilowatts(int power) {
        return power * 0.74;
    }
}
