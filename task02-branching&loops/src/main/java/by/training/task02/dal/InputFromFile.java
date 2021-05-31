package by.training.task02.dal;

import java.util.List;

/**
 * Reads information from input file
 * @author Pavel Kalinin
 */
public interface InputFromFile {

    /**
     * Returns text information from the file
     * @param fileName Name of the input file
     * @return List of strings that represents content of the input file where each element is one line
     */
    List<String> getInput(String fileName);
}
