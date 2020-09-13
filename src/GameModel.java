import java.util.List;


@SuppressWarnings("unused")
public class GameModel {

    public int CountPoints;
    public int CountMatches;
    public int CountWinMatches;
    public int CountEvenMatches;
    public int CountLostMatches;

    public int getCountPoints() {
        return CountPoints;
    }
    public void setCountPoints(int newName) {
        this.CountPoints = newName;
    }
    public int getCountMatches() {
        return CountMatches;
    }
    public void setCountMatches(int x) {
        this.CountMatches = x;
    }
    public int getCountWinMatches() {
        return CountWinMatches;
    }
    public void setCountWinMatches(int x) {
        this.CountWinMatches = x;
    }
    public int getCountEvenMatches() {
        return CountEvenMatches;
    }
    public void setCountEvenMatches(int x) {
        this.CountEvenMatches = x;
    }
    public int getCountLostMatches() {
        return CountLostMatches;
    }
    public void setCountLostMatches(int x) {
        this.CountLostMatches = x;
    }

    @Override
    public String toString() {
        return "GameModel{" +
                "CountPoints=" + CountPoints +
                ", CountMatches=" + CountMatches +
                ", CountWinMatches=" + CountWinMatches +
                ", CountEvenMatches=" + CountEvenMatches +
                ", CountLostMatches=" + CountLostMatches +
                '}';
    }

    public String WriteOutGameResults(GameModel gameModel) {
        return "GameModel{" +
                "CountPoints=" + gameModel.CountPoints +
                ", CountMatches=" + gameModel.CountMatches +
                ", CountWinMatches=" + gameModel.CountWinMatches +
                ", CountEvenMatches=" + gameModel.CountEvenMatches +
                ", CountLostMatches=" + gameModel.CountLostMatches +
                '}';
    }
}




