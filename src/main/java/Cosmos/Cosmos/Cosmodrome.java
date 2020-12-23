package Cosmos;

public class Cosmodrome {
    public void start(IStart iStart) {
        if (!iStart.beforeCheckSystem()) {
            System.out.println("Предстартовая проверка провалена");
        } else {
            iStart.startEngine();
            int i = 10;
            while (i > 0) {
                System.out.println("Обратный отсчет " + i);
                i--;
            }
            iStart.start();
        }
    }


    public static void main(String[] args) {
        Shuttle shuttle = new Shuttle();
        SpaceX spaceX = new SpaceX();
        Cosmodrome cosmodrome = new Cosmodrome();

        cosmodrome.start(spaceX);
        cosmodrome.start(shuttle);
    }
}

