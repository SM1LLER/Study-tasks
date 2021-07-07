package by.training.task03.service;

import by.training.task03.entity.Array;
import by.training.task03.service.impl.BubbleSorter;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class BubbleSorterTest {
    Sorter bubble = new BubbleSorter();

    @Test(description = "Test with positive result for buble sort()", dataProvider = "positiveForSorterTest"
            , dataProviderClass = SorterTestData.class)
    public void sortTest(Array a, boolean isIncreasing, Array c){
        Array expected = c;
        bubble.sort(a, isIncreasing);
        assertEquals(a, expected);
    }

    @Test(description = "Test with big input for buble sort()", dataProvider = "bigInputSorterTest"
            , dataProviderClass = SorterTestData.class)
    public void bigInputSortTest(Array a, boolean isIncreasing, Array c){
        Array expected = c;
        bubble.sort(a, isIncreasing);
        assertEquals(a, expected);
    }
}
