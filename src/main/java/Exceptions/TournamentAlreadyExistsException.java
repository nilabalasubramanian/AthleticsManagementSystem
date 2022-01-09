package Exceptions;

public class TournamentAlreadyExistsException extends Exception {
    public TournamentAlreadyExistsException(String message) {
        super(message);
    }

    public TournamentAlreadyExistsException() {
    }
}
