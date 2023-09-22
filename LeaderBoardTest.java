import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeaderBoardTest {
    public static void main(String[] args) {

        LeaderBoard l = new LeaderBoard(5);

        // Read the file and populate the leaderboard
        try (BufferedReader reader = new BufferedReader(new FileReader("names.txt"))) {

            // Read the line from the file and save it to currentLine variable
            String currentLine;

            // Check if it's null
            while ((currentLine = reader.readLine()) != null) {
                // Split the line by comma
                String[] parts = currentLine.split(",");

                // Sanity checking to see if parts have two elements
                if (parts.length == 2) {
                    // name is the first element
                    String name = parts[0];

                    // score is the second element
                    // convert to integer to follow class definition
                    int score = Integer.parseInt(parts[1]);
                    l.add(new Contestant(name, score));
                } else {
                    System.err.println("Invalid format in names.txt: " + currentLine);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading names.txt: " + e.getMessage());
        }

        Contestant[] finalBoard = l.finalBoard();

        System.out.println("Final Board (M=5):");
        for (Contestant c : finalBoard) {
            System.out.println(c);
        }
    }
}
