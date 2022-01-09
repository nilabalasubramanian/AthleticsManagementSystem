package Service;

import com.sun.org.apache.xpath.internal.operations.String;

public class Sports {
    private int sportId;
    private String sportName;
    private String gameType;
    private String winner;
    Player player;
    public Sports(int sportId,String  sportName, String gameType, String winner, Player player) {
        this.sportName = sportName;
        this.sportId = sportId;
        this.gameType = gameType;
        this.winner = winner;
        this.player=player;
    }

    public Sports(int sportId, java.lang.String tennis, java.lang.String outdoor, Object winner, Player p2) {
    }


    public int getSportId() {
        return sportId;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    public void setSportId(int sportId) {
        this.sportId = sportId;
    }

    public String getSportName() {
        return sportName;
    }

    public void setSportName(String sportName) {
        this.sportName = sportName;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }
    public String getWinner(String winner)
    {
        return winner;
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    @Override
    public java.lang.String toString() {
        return "Sports{" +
                "sportName=" + sportName +
                ", sportId=" + sportId +
                ", gameType=" + gameType +
                ", winner=" + winner +
                ", player=" + player +
                '}';
    }


    public boolean getWinner() {
        return false;
    }
}
