import java.util.List;

public interface GameInterface {
    List<String> CreateArray(String games);
    GameModel MatchResults(GameModel gameModel);
    GameModel TotalAmountOfPoints(List<String> listOfGames, GameModel result);

}
