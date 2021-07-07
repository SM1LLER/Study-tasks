package by.training.task03.service;

import by.training.task03.entity.Array;
import by.training.task03.service.impl.HashSorter;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HashSorterTest {
    Sorter sorter = new HashSorter();

    @Test(description = "Test with positive result for hash sort()", dataProvider = "positiveForSorterTest"
            , dataProviderClass = SorterTestData.class)
    public void sortTest(Array a, boolean isIncreasing, Array c){
        Array expected = c;
        sorter.sort(a, isIncreasing);
        assertEquals(a, expected);
    }

    @Test(description = "Test with big input for hash sort()", dataProvider = "bigInputSorterTest"
            , dataProviderClass = SorterTestData.class)
    public void bigInputSortTest(Array a, boolean isIncreasing, Array c){
        Array expected = c;
        sorter.sort(a, isIncreasing);
        assertEquals(a, expected);
    }
}
