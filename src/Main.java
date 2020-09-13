public class Main {
    public static void main(String[] args) {
        Games games = new Games();
        GameModel gameModel = new GameModel();
        var array = games.CreateArray("10");
        if (array.size() > 0)
        {
            var resultsFromGame = games.TotalAmountOfPoints(array, gameModel);
            System.out.println(resultsFromGame.WriteOutGameResults(resultsFromGame));
        }
    }
}