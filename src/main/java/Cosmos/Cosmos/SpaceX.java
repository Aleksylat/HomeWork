package Cosmos;

import java.util.Random;

public class SpaceX implements IStart {
    public boolean beforeCheckSystem() {
        Random random = new Random();
        int value = random.nextInt(11);

        if (value > 6) return true;
        return false;
    }

    public void startEngine() {
        System.out.println("Двигатели SpaceX запущены.Все системы в норме");
    }

    public void start() {
        System.out.println("Старт SpaceX");
    }
}
