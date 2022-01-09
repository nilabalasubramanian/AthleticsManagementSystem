package Service;

import Exceptions.InvalidTournamentException;
import Exceptions.NoSportsExist;
import Exceptions.TournamentAlreadyExistsException;
import com.sun.org.apache.xpath.internal.operations.String;
import utility.AthleticsManagementInterface;
import utility.DateValidator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class AthleteManagement implements AthleticsManagementInterface {
    List<TournamentDetails>tournamentDetails=new ArrayList<TournamentDetails>();
    DateValidator dv=new DateValidator();

    @Override
    public void addNewTournamentDetails(TournamentDetails t) throws TournamentAlreadyExistsException {
       long c= tournamentDetails.stream().filter(i->i.getTournamentId()==t.getTournamentId()).count();
       if(c!=0)
       throw new TournamentAlreadyExistsException();
       tournamentDetails.add(t);
    }

    @Override
    public boolean updateTournamentStatus(int tournamentId, int sportId, String winner) throws InvalidTournamentException {
        try
        {
            List<TournamentDetails>tournamentDetailsList=tournamentDetails.stream().filter(i->i.getTournamentId()==tournamentId).collect(Collectors.toList());
            List<Sports>sportsList=tournamentDetailsList.get(0).getSports().stream().filter(j->j.getSportId()==sportId).collect(Collectors.toList());
            sportsList.get(0).setWinner(winner);
        }catch (Exception e) {
            throw new InvalidTournamentException();
        }
        return true;
    }

    @Override
    public List<Sports> retrieveSports(int tournamentId) throws NoSportsExist {
        try
        {
            List<TournamentDetails>tournamentDetailsList=tournamentDetails.stream().filter(i->i.getTournamentId()==tournamentId).collect(Collectors.toList());
            List<Sports>sportsList=tournamentDetailsList.get(0).getSports().stream().filter(i-> {
                i.getWinner();
                return false;
            }).collect(Collectors.toList());
            if(sportsList.isEmpty())
             throw new NoSportsExist();
            return sportsList;
        }catch (Exception e){
          throw e;  }

    }

    @Override
    public int findParticipantCount(int tournamentId) {
        long c=tournamentDetails.stream().filter(i->i.getTournamentId()==tournamentId).iterator().next().getSports().stream().count();

        return (int)c;
    }

    @Override
    public List<Player> getAllPlayerwithExperience(int experience) {
        List<Player> players=tournamentDetails.stream().map(TournamentDetails::getSports).iterator().next().stream().map(Sports::getPlayer).filter(i->i.getExperience()>=experience).collect(Collectors.toList());
        return players;
    }
}
