package by.training.task03.dal;

import by.training.task03.dal.exception.DaoException;
import by.training.task03.entity.Array;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class ArrayDaoImpl implements ArrayDao{
    private static final Logger inputLogger = LogManager.getLogger();
    InputFromFile inputFromFile = new InputFromFileImpl();

    @Override
    public Array[] getArrays(String fileName) throws DaoException{
        List<String> input = inputFromFile.readFrom(fileName);
        Array[] arrays = new Array[input.size()];
        int i = 0;
        for(String str : input){
            String[] strNums = str.split("\\s");
            int[] nums = new int[strNums.length];
            for(int j = 0; j < strNums.length; j++){
                nums[j] = Integer.parseInt(strNums[j]);
            }
            arrays[i] = new Array(nums);
            inputLogger.debug("Added array: " + i + ". array: " + arrays[i].toString());
            i++;
        }
        return arrays;
    }
}
