package HomeWork9;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileFormatter {

    public static ArrayList<String> readFile(String path) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        File file = new File(path);
        FileReader fr = new FileReader(file);
        BufferedReader reader = new BufferedReader(fr);
        String line = reader.readLine();

        while (line != null) {
            list.add(line);
            line = reader.readLine();
        }
        return list;
    }

    /**
     * method for writing data on file with line separator
     *
     * @param path
     * @param list
     */
    public static void writeFile(String path, List<String> list) {
        try (FileWriter writer = new FileWriter(path, false)) {
            int i = 0;
            String lineSeparator = System.getProperty("line.separator");

            while (i < list.size()) {
                writer.write(list.get(i));
                writer.write(lineSeparator);
                i++;
            }
            writer.flush();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
