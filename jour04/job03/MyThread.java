package jour04.job03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyThread {
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

    public String generateString(int length) {
        List<Character> charList = createList();
        StringBuilder generatedString = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int randomIndex = (int) (Math.random() * charList.size());
            generatedString.append(charList.get(randomIndex));
        }
        System.out.println("Chaîne générée : " + generatedString);
        return generatedString.toString();
    }

        public void writeToFile(String data, int start, int end, String fileName) {
        synchronized (MyThread.class) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
                writer.write(data, start, end - start);
                writer.newLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
