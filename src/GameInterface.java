import java.util.List;

public interface GameInterface {
    List<String> CreateArray(String games);
    GameModel MatchResults(int _countPoints, int _countMatches, int _countWinMatches, int _countEvenMatches, int _countLostMatches);
    GameModel TotalAmountOfPoints(List<String> listOfGames, GameModel result);

}
