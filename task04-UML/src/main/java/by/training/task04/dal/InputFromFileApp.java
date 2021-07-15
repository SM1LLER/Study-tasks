package by.training.task04.dal;

import by.training.task04.dal.exception.DaoException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Reads information from input file that user can access
 * @author Pavel Kalinin
 */
public class InputFromFileApp implements InputFromFile{
    static final Logger inputLogger = LogManager.getLogger(InputFromFileApp.class);

    @Override
    public List<String> readFrom(String fileName) throws DaoException{

        List<String> inputLines = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new InputStreamReader(
                getClass().getClassLoader().getResourceAsStream(fileName)))
        )
        {
            String s;
            while((s = br.readLine())!=null){
                inputLines.add(s);
            }
        }
        catch(IOException | NullPointerException e){
            throw new DaoException(e);
        }

        if (!inputLines.isEmpty()){
            return inputLines;
        } else throw new DaoException("Input file is empty");

    }
}
