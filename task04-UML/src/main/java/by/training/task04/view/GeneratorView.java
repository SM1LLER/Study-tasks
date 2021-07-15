package by.training.task04.view;
/**
 * Displays message about generator
 * @author Pavel Kalinin
 */
public interface GeneratorView {

    /**
     * Displays message that generation completed
     * @param fileName file that stores generated Clients
     */
    public void printGenerated(String fileName);
}
