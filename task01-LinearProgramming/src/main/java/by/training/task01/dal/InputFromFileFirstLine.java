package by.training.task01.dal;

import by.training.task01.interfaces.InputFromFile;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;

/**
 * Implementation of InputFromFile interface that
 * returns firstLine of the input file
 * @author Pavel Kalinin
 */
public class InputFromFileFirstLine implements InputFromFile {

    static final Logger inputLogger = LogManager.getLogger(InputFromFileFirstLine.class);

    @Override
    public String getInput(String fileName) {

        String firstLine = null;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(
                getClass().getClassLoader().getResourceAsStream(
                        fileName))))
        {

            firstLine = br.readLine();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }

        if (firstLine != null){
            inputLogger.debug(String.format("Input line is: %s", firstLine));
            return firstLine;
        } else inputLogger.error("Input file is empty");

        return null;
    }


}
