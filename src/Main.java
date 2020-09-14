import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter how many games you want: ");
            String gameValue = scanner.next();
            Games games = new Games();
            GameModel gameModel = new GameModel();
            List<String> array = games.CreateArray(gameValue);
            if (array.size() > 0) {
                GameModel resultsFromGame = games.TotalAmountOfPoints(array, gameModel);
                System.out.println(resultsFromGame.WriteOutGameResults(resultsFromGame));
            } else {
                System.out.println("Nothing was entered. Please try again");
            }
        }
    }
}