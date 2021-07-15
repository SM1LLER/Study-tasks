package by.training.task04.dal;

import by.training.task04.dal.exception.DaoException;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class OutputToFileImpl implements OutputToFile{

    private final String OUTPUT_DIRECTORY = "data/";



    @Override
    public void writeTo(List<String> data, String fileName) throws DaoException {
        File file = new File(OUTPUT_DIRECTORY + fileName);
        try
        {
            if(!file.exists()){
                file.createNewFile();
            }

            BufferedWriter bw = new BufferedWriter(new FileWriter(OUTPUT_DIRECTORY + fileName));
            try {
                for(String str : data){
                    bw.write(str);
                    bw.newLine();
                }
            }
            finally {
                bw.close();
            }
        }
        catch(IOException | NullPointerException e){
            throw new DaoException(e);
        }

    }
}
