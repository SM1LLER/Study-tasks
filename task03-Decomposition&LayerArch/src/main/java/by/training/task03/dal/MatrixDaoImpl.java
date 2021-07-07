package by.training.task03.dal;

import by.training.task03.dal.exception.DaoException;
import by.training.task03.entity.Matrix;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MatrixDaoImpl implements MatrixDao{
    private static final Logger inputLogger = LogManager.getLogger();
    InputFromFile inputFromFile = new InputFromFileImpl();

    @Override
    public List<Matrix> getMatrices(String fileName) throws DaoException {
        List<String> input = inputFromFile.readFrom(fileName);
        List<String> strMatrix = new ArrayList<>();
        List<Matrix> matrices = new ArrayList<>();
        Iterator<String> iterator = input.listIterator();
        while (iterator.hasNext()){
            String str = iterator.next();
            inputLogger.debug(String.format("Parsing string: %s", str));
            if (str.trim().equals("") || !iterator.hasNext()){
                if(!str.trim().equals("")) {
                    strMatrix.add(str);
                }

                inputLogger.debug("Creating new matrix");
                int k = 0;
                int[][] matrix = new int[strMatrix.size()][];
                for(String strRow : strMatrix){
                    String[] strNums = strRow.split("\\s");
                    int[] row = new int[strNums.length];
                    for(int j = 0; j < strNums.length; j++){
                        row[j] = Integer.parseInt(strNums[j]);
                    }
                    inputLogger.debug("Row of the new matrix: " + Arrays.toString(row));
                    matrix[k++] = row;
                }
                inputLogger.debug("Double array that used to create new Matrix " + Arrays.toString(matrix));
                Matrix newMtx = new Matrix(matrix);
                matrices.add(newMtx);
                inputLogger.debug("Added new matrix to return list: " + newMtx.toString());
                strMatrix.clear();
                continue;
            }
            strMatrix.add(str);
            inputLogger.debug("Added string to matrix row list:" + str);
        }
        return matrices;
    }
}
