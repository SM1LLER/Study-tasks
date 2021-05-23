package by.training.task01.interfaces;

/**
 * Reads information from input file
 * @author Pavel Kalinin
 */
public interface InputFromFile {

    /**
     * Returns text information from the file
     * @param fileName Name of the input file
     * @return String that represents content of the input file
     */
    String getInput(String fileName);
}
