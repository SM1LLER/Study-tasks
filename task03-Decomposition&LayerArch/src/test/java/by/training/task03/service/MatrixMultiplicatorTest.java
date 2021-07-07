package by.training.task03.service;

import by.training.task03.entity.Matrix;
import by.training.task03.service.exception.ServiceException;
import by.training.task03.service.impl.MatrixMultiplicatorImpl;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MatrixMultiplicatorTest {
    private MatrixMultiplicator multiplicator = new MatrixMultiplicatorImpl();

    @DataProvider(name = "positiveDataForMultiply")
    public Object[][] createPositiveForMultiply(){
        int[][] in11 = new int[][]{
                {2, 0, -1},
                {0, -2, 2},
        };
        int[][] in12 = new int[][]{
                {4, 1, 0},
                {3, 2, 1},
                {0, 1, 0}
        };
        int[][] out1 = new int[][]{
                {8, 1, 0},
                {-6, -2, -2},
        };

        return new Object[][] {
                {new Matrix(in11), new Matrix(in12), new Matrix(out1)},
        };
    }

    @Test(description = "test with positive result for multiply()", dataProvider = "positiveDataForMultiply")
    public void multiplyTest(Matrix a, Matrix b, Matrix c){
        Matrix expected = c;
        Matrix actual = null;
        try {
             actual = multiplicator.multiply(a, b);
        } catch (ServiceException e){
            e.printStackTrace();
        }
        assertEquals(actual, expected);
    }
}
