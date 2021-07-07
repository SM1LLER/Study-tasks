package by.training.task03.entity;

/**
 * @author Pavel Kalinin
 */
public class Array {
    private int[] values;

    /**
     * Creates array object
     * @param array - array that will be stored inside Array object
     */
    public Array(int[] array) {
        this.values = array;
    }

    /**
     * Returns subarray from i to j
     * @param i - start index
     * @param j - end index
     * @return Array - sub array from i to j
     */
    public Array getSubArray(int i, int j) {
        int[] subVal = new int[j - i];
        System.arraycopy(values, i, subVal, 0, j - i);
        return new Array(subVal);
    }

    /**
     * Returns value from exact position
     * @param index of element
     * @return int - value
     */
    public int getValue(int index) {
        return values[index];
    }

    /**
     * Sets value on the position
     * @param value element
     * @param index of element
     */
    public void setValue(int value, int index) {
        this.values[index] = value;
    }

    /**
     * Returns length of the object
     * @return int - length
     */
    public int getLength() {
        return values.length;
    }

    /**
     * Swaps elements on positions i and j
     * @param i index of first element
     * @param j index of second element
     */
    public void swap(int i, int j) {
        if (i == j)
            return;
        int tmp = values[i];
        values[i] = values[j];
        values[j] = tmp;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Array array = (Array) obj;
        if (array.getLength() != this.getLength()) {
            return false;
        }
        for (int i = 0; i < getLength(); i++) {
            if (array.getValue(i) != this.getValue(i)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append("{");
        for(int i = 0; i < values.length - 1; i++){
            strBuilder.append(values[i]).append(", ");
        }
        strBuilder.append(values[values.length-1]).append("}");
        return strBuilder.toString();
    }

    @Override
    public Array clone(){
        Array array = new Array(values.clone());
        return array;
    }
}
