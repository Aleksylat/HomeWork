package HomeWork9;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static String one(char a, char b, String str) {
        return str.substring(str.indexOf(a), str.lastIndexOf(b));
    }

    public static String two(String str) {
        return str.replaceAll(String.valueOf(str.charAt(3)), String.valueOf(str.charAt(0)));
    }

    public static String reverse(String stf) {
        StringBuilder sb = new StringBuilder(stf);
        return sb.reverse().toString();
    }

    public static void three(String readPath, String writePath) throws IOException {

        ArrayList<String> old = FileFormatter.readFile(readPath);
        ArrayList<String> reverseList = new ArrayList<>();
        ArrayList<String> newList = new ArrayList<>();

        for (int i = 0; i < old.size(); i++) {
            reverseList.add(reverse(old.get(i)));
            if (reverseList.get(i).equals(old.get(i))) newList.add(old.get(i));
        }

        FileFormatter.writeFile(writePath, newList);

    }


    public static void main(String[] args) throws IOException {
        String s = "Vladimi Vladimir Vladimir Vladimir Vladimir";

        System.out.println(Main.one('r', 'r', s));
        System.out.println(Main.two(s));

        String readPath = "C:\\Users\\Aleksy\\Desktop\\input1.txt";
        String writePath = "C:\\Users\\Aleksy\\Desktop\\output1.txt";

        Main.three(readPath, writePath);

    }
}
