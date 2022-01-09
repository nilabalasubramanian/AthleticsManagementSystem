package Service;

import java.util.Date;
import java.util.List;

public class TournamentDetails {
    private int tournamentId;

    public int getTournamentId() {
        return tournamentId;
    }

    public void setTournamentId(int tournamentId) {
        this.tournamentId = tournamentId;
    }

    public Date getTournamentStartDate() {
        return tournamentStartDate;
    }

    public void setTournamentStartDate(Date tournamentStartDate) {
        this.tournamentStartDate = tournamentStartDate;
    }

    public Date getTournamentEndDate() {
        return tournamentEndDate;
    }

    public void setTournamentEndDate(Date tournamentEndDate) {
        this.tournamentEndDate = tournamentEndDate;
    }

    public List<Sports> getSports() {
        return sports;
    }

    public void setSports(List<Sports> sports) {
        this.sports = sports;
    }

    private Date tournamentStartDate;
     private Date tournamentEndDate;
     public List<Sports> sports;

    public TournamentDetails(int tournamentId, Date tournamentStartDate, Date tournamentEndDate, List<Sports> sports) {
        this.tournamentId = tournamentId;
        this.tournamentStartDate = tournamentStartDate;
        this.tournamentEndDate = tournamentEndDate;
        this.sports = sports;

    }

    @Override
    public String toString() {
        return "TournamentDetails{" +
                "tournamentId=" + tournamentId +
                ", tournamentStartDate=" + tournamentStartDate +
                ", tournamentEndDate=" + tournamentEndDate +
                ", sports=" + sports +
                '}';
    }
}

