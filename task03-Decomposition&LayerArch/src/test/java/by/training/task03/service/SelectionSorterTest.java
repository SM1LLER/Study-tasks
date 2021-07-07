package by.training.task03.service;

import by.training.task03.entity.Array;
import by.training.task03.service.impl.SelectionSorter;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SelectionSorterTest {
    Sorter sorter = new SelectionSorter();

    @Test(description = "Test with positive result for selection sort()", dataProvider = "positiveForSorterTest"
            , dataProviderClass = SorterTestData.class)
    public void sortTest(Array a, boolean isIncreasing, Array c){
        Array expected = c;
        sorter.sort(a, isIncreasing);
        assertEquals(a, expected);
    }

    @Test(description = "Test with big input for selection sort()", dataProvider = "bigInputSorterTest"
            , dataProviderClass = SorterTestData.class)
    public void bigInputSortTest(Array a, boolean isIncreasing, Array c){
        Array expected = c;
        sorter.sort(a, isIncreasing);
        assertEquals(a, expected);
    }
}
