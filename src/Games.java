import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Games implements GameInterface {

    @Override
    public List<String> CreateArray(String games) {
        List<String> createMatchList = new ArrayList<>();
        try {
            var numberOfGames = Integer.parseInt(games);
            for (int i = 0; i < numberOfGames; i++) {
                int x = getRandomNumberInRange(0, 20);

                int y = getRandomNumberInRange(0, 20);
                createMatchList.add(x + ":" + y);
            }
        } catch (Exception e) {
            System.out.println("Must be a number 1-9");
        }
        return createMatchList;
    }


    @Override
    public GameModel MatchResults(GameModel gameModel) {

        return gameModel ;
    }

    @Override
    public GameModel TotalAmountOfPoints(List<String> listOfGames, GameModel result) {
        for (var item : listOfGames)
        {
            var splitByColonMatches = Arrays.stream(item.split(":")).mapToInt(Integer::parseInt).toArray();
            if (splitByColonMatches[0] > splitByColonMatches[1])
            {
                result.CountPoints += 3;
                result.CountWinMatches++;
            }
            if (splitByColonMatches[0] < splitByColonMatches[1])
                result.CountLostMatches++;
            if (splitByColonMatches[0] == splitByColonMatches[1])
            {
                result.CountPoints += 1;
                result.CountEvenMatches++;
            }
            result.CountMatches++;
        }
        return MatchResults(result);
    }

    private int getRandomNumberInRange(int min, int max) {

        Random r = new Random();
        return r.ints(min, (max + 1)).limit(1).findFirst().getAsInt();

    }
}
