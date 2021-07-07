package by.training.task03.dal;

import by.training.task03.dal.exception.DaoException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Implementation of InputFromFile interface that
 * returns firstLine of the input file
 * @author Pavel Kalinin
 */
public class InputFromFileImpl implements InputFromFile {

    static final Logger inputLogger = LogManager.getLogger(InputFromFileImpl.class);

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
