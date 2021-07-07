package by.training.task03.service;

import by.training.task03.entity.Matrix;
import by.training.task03.service.exception.ServiceException;
import by.training.task03.service.impl.MatrixSubtractorImpl;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MatrixSubtractorTest {
    MatrixSubtractor subtractor = new MatrixSubtractorImpl();

    @DataProvider(name = "positiveDataForSubtract")
    public Object[][] createPositiveForSubtrac(){
        int[][] in11 = new int[][]{
                {4, 2},
                {9, 0},
        };
        int[][] in12 = new int[][]{
                {3, 1},
                {-3, 4},
        };
        int[][] out1 = new int[][]{
                {1, 1},
                {12, -4},
        };

        return new Object[][] {
                {new Matrix(in11), new Matrix(in12), new Matrix(out1)},
        };
    }

    @Test(description = "test with positive result for subtract()", dataProvider = "positiveDataForSubtract")
    public void subtractTest(Matrix a, Matrix b, Matrix c){
        Matrix expected = c;
        Matrix actual = null;
        try {
            actual = subtractor.subtract(a, b);
        } catch (ServiceException e){
            e.printStackTrace();
        }
        assertEquals(actual, expected);
    }
}
