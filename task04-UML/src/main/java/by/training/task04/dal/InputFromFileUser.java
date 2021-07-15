package by.training.task04.dal;

import by.training.task04.dal.exception.DaoException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 * Implementation of InputFromFile interface that
 * returns firstLine of the input file
 * @author Pavel Kalinin
 */
public class InputFromFileUser implements InputFromFile {

    static final Logger inputLogger = LogManager.getLogger(InputFromFileUser.class);

    private final String INPUT_DIRECTORY = "data/";
    @Override
    public List<String> readFrom(String fileName) throws DaoException{

        List<String> inputLines = new ArrayList<>();
        try(BufferedReader br = new BufferedReader (new FileReader(INPUT_DIRECTORY + fileName))
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
