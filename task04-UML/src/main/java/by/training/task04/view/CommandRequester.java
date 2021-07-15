package by.training.task04.view;

/**
 * View class that speaks with user
 * @author Pavel Kalinin
 */
public interface CommandRequester {
    /**
     * Requests input from the user
     */
    void requestInput();
    /**
     * Prints default error text for the user
     */
    void printError();
    /**
     * Prints specific text of the error
     * @param str text of the error to print
     */
    void printError(String str);
    /**
     * Asks user to change language
     */
    void changeLanguage();
    /**
     * Print help information for user
     */
    void printHelp();
}
