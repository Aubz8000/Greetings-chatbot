import java.util.Scanner;

public class Chatbot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String greeting = "Hello, how can I help you today?";

        System.out.println("Chatbot: " + greeting);

        while (true) {
            String input = scanner.nextLine();

            if (input.toLowerCase().contains("hello") || input.toLowerCase().contains("hi")) {
                System.out.println("Chatbot: Hi there!");
            } else if (input.equalsIgnoreCase("bye")) {
                System.out.println("Chatbot: Goodbye!");
                break;
            } else {
                System.out.println("Chatbot: I'm sorry, I didn't understand. Can you please rephrase that?");
            }
        }

        scanner.close();
    }
}
