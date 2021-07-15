package by.training.task04.service;

/**
 * Parses request
 * @author Pavel Kalinin
 */
public interface RequestParser {
    /**
     * Finds file name from input request
     * @param request
     * @return String file name
     */
    String getFileName(String request);
    /**
     * Parse number of clients from request
     * @param request
     * @return int - number of clients
     */
    int getNumOfClients(String request);
    /**
     * Parse client id from request
     * @param request
     * @return int - client id
     */
    int getClientId(String request);
}
