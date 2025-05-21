import java.util.Scanner;

public class antakshari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int players;

        System.out.print("Enter number of players: ");
        players = scanner.nextInt();
        scanner.nextLine();

        String previousWord = "";
        int turn = 0;

        while (true) {
            int currentPlayer = (turn % players) + 1;
            System.out.print("Player " + currentPlayer + ", enter your word: ");
            String currentWord = scanner.nextLine().trim().toLowerCase();


            if (turn == 0) {
                previousWord = currentWord;
                turn++;
                continue;
            }

            
            char lastChar = previousWord.charAt(previousWord.length() - 1);
            if (currentWord.charAt(0) == lastChar) {
                previousWord = currentWord;
                turn++;
            } else {
                System.out.println("❌ Invalid word! It should start with '" + lastChar + "'.");
                System.out.println("🎮 Player " + currentPlayer + " is out!");
                break;
            }
        }

        scanner.close();
    }
}
