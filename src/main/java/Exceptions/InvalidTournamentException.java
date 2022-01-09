package Exceptions;

public class InvalidTournamentException extends Exception{
    public InvalidTournamentException(String message) {
        super(message);
    }

    public InvalidTournamentException() {
    }
}
