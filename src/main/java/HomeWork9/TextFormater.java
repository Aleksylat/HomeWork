package HomeWork9;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TextFormater {

    public static Boolean isPolindrom(String stf) {
        StringBuilder sb = new StringBuilder(stf);
        return stf.equals(sb.reverse().toString());
    }

    //get sentences from text
    public static List<String> getAllTextSentences(String str) {
        return Arrays.asList(str.split("\\."));
    }

    public static List<String> splitWords(String sentences) {
        return Arrays.asList(sentences.split(" "));
    }

    //check string on length and polindrom
    public static void checkString(String str, List<String> stringsOnWrite) {
        List<String> strings = splitWords(str);
        boolean flag = false;

        for (String string : strings) {
            if (string.length() > 2 && isPolindrom(string)) {
                stringsOnWrite.add(str);
                flag = true;
                break;
            }
        }
        if (!flag) {
            int length = str.split(" ").length;
            if (length >= 3 && length <= 5) stringsOnWrite.add(str);
        }
    }

    public static void main(String[] args) throws IOException {
        String readPathFormatter = "C:\\Users\\Aleksy\\Desktop\\input2.txt";
        String writePathFormatter = "C:\\Users\\Aleksy\\Desktop\\output2.txt";
        StringBuilder stringBuilder = new StringBuilder();
        List<String> stringsOnWrite = new ArrayList<>();

        for (String str : FileFormatter.readFile(readPathFormatter)) {
            stringBuilder.append(str);
        }

        List<String> sentences = TextFormater.getAllTextSentences(stringBuilder.toString());

        for (String str : sentences) {
            TextFormater.checkString(str, stringsOnWrite);
        }

        FileFormatter.writeFile(writePathFormatter, stringsOnWrite);
    }
}
