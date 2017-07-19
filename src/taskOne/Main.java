package taskOne;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("file1.txt")));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("file2.txt")))) {

            Set<Character> characters = new HashSet<>();
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                if (!line.isEmpty()) {
                    line = line.trim();
                    String[] split = line.split(" ");
                    char[] chars = split[split.length - 1].toCharArray();

                    for (char c : chars) {
                        characters.add(c);
                    }

                    if (characters.size() < 4) {
                        bufferedWriter.write(line + "\n");
                    }

                    characters.clear();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        ArrayList<String> strings = new ArrayList<>();
        Collections.sort(strings);
    }
}
