package by.training.task02.dal;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
    public List<String> getInput(String fileName) {

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
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }

        if (!inputLines.isEmpty()){
            return inputLines;
        } else inputLogger.error("Input file is empty");

        return new ArrayList<>();
    }


}
