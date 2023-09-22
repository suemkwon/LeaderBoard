import java.util.List;
import java.util.ArrayList;

public class LeaderBoard {
    private List<Contestant> leaderBoard;
    private int rank;

    // constructor: creates a new LeaderBoard of size m
    public LeaderBoard(int m) {
        this.rank = m;
        this.leaderBoard = new ArrayList<>();
    }

    // add the contestant to the board if appropriate
    public void add(Contestant c) {
        if (leaderBoard.size() == rank) {
            return;
        }
        leaderBoard.add(c);
    }

    // return the final board in sorted order
    public Contestant[] finalBoard() {
        return leaderBoard.toArray(new Contestant[0]);
    }
}