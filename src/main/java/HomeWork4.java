import java.util.Scanner;

public class HomeWork4 {

    private String core = "intel core i5-4770u";
    private String hdd = "500gb";
    private String ram = "16gb";
    private byte stateComputer = 0;   // 0 - выключен // 1 - включен  // -1  -> сгорел
    private final byte resource = 10;
    private byte count_turnOn;

    public void printDescription() {
        System.out.println("Core: " + core + " Hdd: " + hdd + " Ram: " + ram);
    }

    public void turnOn() {
        if (count_turnOn < resource) {
            stateComputer = 1;
            System.out.println("Computer turn on");
            count_turnOn++;
            System.out.println("Resources: " + resource + " Count turn on: " + getCount_turnOn());
        } else System.out.println("Computer burn out");

    }

    public void turnOff() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number 0 or 1");

        byte number = scanner.nextByte();
        byte numberRandom = (byte) (Math.random() * 2);

        if (numberRandom == number && count_turnOn < resource) {
            stateComputer = 0;
            System.out.println("Computer turn off");
        }

        if (numberRandom != number || count_turnOn >= resource) {
            System.out.println("Computer burned out");
            stateComputer = -1;
        }
    }

    public int getCount_turnOn() {
        return count_turnOn;
    }

    public int getStateComputer() {
        return stateComputer;
    }

    public int getResource() {
        return resource;
    }

    public static void main(String[] args) {
        HomeWork4 myPc = new HomeWork4();
        myPc.printDescription();

        while (myPc.getCount_turnOn() < myPc.getResource()) {

            if (myPc.getStateComputer() < 0) break;
            myPc.turnOn();
            myPc.turnOff();

        }
    }

}
