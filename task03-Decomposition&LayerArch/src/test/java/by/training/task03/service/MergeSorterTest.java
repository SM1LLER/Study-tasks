package by.training.task03.service;

import by.training.task03.entity.Array;
import by.training.task03.service.impl.MergeSorter;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MergeSorterTest {
    Sorter sorter = new MergeSorter();

    @Test(description = "Test with positive result for merge sort()", dataProvider = "positiveForSorterTest"
            , dataProviderClass = SorterTestData.class)
    public void sortTest(Array a, boolean isIncreasing, Array c){
        Array expected = c;
        sorter.sort(a, isIncreasing);
        assertEquals(a, expected);
    }

    @Test(description = "Test with big input for merge sort()", dataProvider = "bigInputSorterTest"
            , dataProviderClass = SorterTestData.class)
    public void bigInputSortTest(Array a, boolean isIncreasing, Array c){
        Array expected = c;
        sorter.sort(a, isIncreasing);
        assertEquals(a, expected);
    }
}
