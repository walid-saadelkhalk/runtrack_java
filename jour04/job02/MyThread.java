package jour04.job02;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyThread {
    private static final String COUNTER_FILE = "jour04/job02/listCount.txt";
    private static final String OUTPUT_FILE = "jour04/job02/output.txt";

    Scanner input = new Scanner(System.in);

    public int input() {
        System.out.print("Entrez un nombre : ");
        int number = input.nextInt();
        System.out.println("Vous allez générer " + number + " caractères!");
        return number;
    }

    public List<Character> createList() {
        char[] charLetter = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char[] charSpecial = {'!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '+', '=', '{', '}', '[', ']', '|', ':', ';', '"', '<', '>', ',', '.', '?', '/'};
        char[] charNumber = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

        List<Character> charList = new ArrayList<>();
        for (char c : charLetter) charList.add(c);
        for (char c : charSpecial) charList.add(c);
        for (char c : charNumber) charList.add(c);
        return charList;
    }

    public List<Character> generateList() {
        int number = input();
        List<Character> charList = createList();
        List<Character> generatedList = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            int randomIndex = (int) (Math.random() * charList.size());
            generatedList.add(charList.get(randomIndex));
        }
        System.out.println("Liste générée : " + generatedList);
        return generatedList;
    }

    public void writeInFile(List<Character> generatedList) {
        int listCount = readListCount() + 1; 
        try (FileWriter writer = new FileWriter(OUTPUT_FILE, true)) {
            writer.write("List " + listCount + ": ");
            for (char c : generatedList) {
                writer.write(c);
            }
            writer.write(System.lineSeparator()+"\n");
            saveListCount(listCount); 
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } finally {
            System.out.println("Le fichier a été généré avec succès!");
        }
    }

    private int readListCount() {
        try {
            File file = new File(COUNTER_FILE);
            if (!file.exists()) {
                return 0; 
            }
            String content = new String(Files.readAllBytes(Paths.get(COUNTER_FILE)));
            return Integer.parseInt(content.trim()); 
        } catch (IOException | NumberFormatException e) {
            return 0;
        }
    }

    private void saveListCount(int count) {
        try (FileWriter writer = new FileWriter(COUNTER_FILE, false)) {
            writer.write(String.valueOf(count));
        } catch (IOException e) {
            System.out.println("Unable to save list count.");
            e.printStackTrace();
        }
    }
}