package Cosmos;

import java.util.Random;

public class Shuttle implements IStart {

    public boolean beforeCheckSystem() {
        Random random = new Random();
        int value = random.nextInt(11);

        if (value > 3) return true;
        return false;
    }

    public void startEngine() {
        System.out.println("Двигатели Шатла запущены.Все системы в норме");
    }

    public void start() {
        System.out.println("Старт шаттла");
    }
}
