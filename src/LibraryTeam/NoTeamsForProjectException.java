package LibraryTeam;

public class NoTeamsForProjectException extends RuntimeException {
    public NoTeamsForProjectException(String message) {
        super(message);
    }
}
