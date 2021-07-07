package by.training.task03.entity;

import java.util.Arrays;
/**
 * @author Pavel Kalinin
 */
public class Matrix {
    private int[][] a;
    /**
     * Creates new Matrix with two-dimensional array
     * @param a - array that object will store
     */
    public Matrix(int[][] a) {
        this.a = a;
    }

    /**
     * Creates new Matrix with pre-initialized size
     * @param n - vertical size
     * @param m - horizontal size
     */
    public Matrix(int n, int m){
        a = new int[n][m];
    }

    /**
     * Returns vertical size of the matrix
     * @return int - verticalSize
     */
    public int getVerticalSize() {
        return a.length;
    }

    /**
     * Returns horizontal size of the matrix
     * @return int - horizontalSize
     */
    public int getHorizontalSize() {
        return a[0].length;
    }

    /**
     * Returns element from position ij
     * @param i - vertical index
     * @param j - horizontal index
     * @return int - element
     */
    public int getElement(int i, int j) {
            return a[i][j];
    }

    /**
     * Set element in position ij
     * @param i - vertical index
     * @param j - horizontal index
     * @return int - element
     */
    public void setElement(int i, int j, int value){
            a[i][j] = value;
    }

    @Override
    public String toString() {
        final String BLANK = " ";
        StringBuilder s = new StringBuilder("Matrix : " + a.length + "x"
                + a[0].length + "\n");
        for (int i = 0; i < a.length - 1; i++) {
            int[] row = a[i];
            for (int value : row) {
                s.append(value).append(BLANK);
            }
            s.append("\n");
        }

        for(int value : a[a.length - 1]){
            s.append(value).append(BLANK);
        }

        return s.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Matrix matrix = (Matrix) o;

        if(matrix.getVerticalSize() != this.getVerticalSize()
                || matrix.getHorizontalSize() != this.getHorizontalSize()){
            return false;
        }

        for (int i = 0; i < this.getVerticalSize(); i++){
            for(int j = 0; j < this.getHorizontalSize(); j++){
                if (this.getElement(i,j) != matrix.getElement(i, j)){
                    return false;
                }
            }
        }

        return true;
    }


    private boolean checkRange(int i, int j) {
        return (i >= 0 && i < a.length && j >= 0 && j < a[0].length);
    }
}