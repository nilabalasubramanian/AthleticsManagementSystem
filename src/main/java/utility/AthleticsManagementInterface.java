package utility;

import Exceptions.InvalidTournamentException;
import Exceptions.NoSportsExist;
import Exceptions.TournamentAlreadyExistsException;
import Service.Player;
import Service.Sports;
import Service.TournamentDetails;


import java.util.List;

public interface AthleticsManagementInterface {
    public void addNewTournamentDetails(TournamentDetails t) throws TournamentAlreadyExistsException;
    boolean updateTournamentStatus(int tournamentId, int sportId, String winner) throws InvalidTournamentException;
    List<Sports> retrieveSports(int tournamentId)throws NoSportsExist;
    public int findParticipantCount(int sportId);
    List<Player>getAllPlayerwithExperience(int experience);

}
