import java.util.Random;

public class HomeWork3{

    public static void exercise1() {

        int count = 0;

        for (int i = 2; i <= 20; i++) {
            if (i % 2 == 0) count++;
        }

        int[] array = new int[count];
        int index = 0;

        for (int i = 2; i <= 20; i++) {
            if (i % 2 == 0) {
                array[index] = i;
                index++;
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\n");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

    public static void exercise2() {

        int count = 0;

        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) count++;
        }

        int[] array = new int[count];

        int index = 0;

        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                array[index] = i;
                index++;
            }
        }

        System.out.println("\n");


        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }


    public static void exercise3() {

        int[] array = new int[15];

        int countEven = 0;

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {

            array[i] = random.nextInt(100);

            if (array[i] > 0 && array[i] % 2 == 0) countEven++;

        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.println("Всего в массиве " + countEven + " четных");

    }


    public static void exercise4() {

        int[] array = new int[20];

        int countOdd = 0;

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {

            array[i] = random.nextInt(21);

            if (array[i] > 0 && array[i] % 2 != 0) countOdd++;

        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.println("Всего в массиве " + countOdd + " нечетных");


    }


    public static void main(String... args) {
        HomeWork3.exercise1();
        HomeWork3.exercise2();
        HomeWork3.exercise3();
        HomeWork3.exercise4();
    }
}