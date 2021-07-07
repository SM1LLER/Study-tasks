package by.training.task03.service;

import by.training.task03.entity.Array;
import by.training.task03.service.impl.ShakerSorter;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ShakerSorterTest {
    Sorter sorter = new ShakerSorter();

    @Test(description = "Test with positive result for shaker sort()", dataProvider = "positiveForSorterTest"
            , dataProviderClass = SorterTestData.class)
    public void sortTest(Array a, boolean isIncreasing, Array c){
        Array expected = c;
        sorter.sort(a, isIncreasing);
        assertEquals(a, expected);
    }

//    @Test(description = "Test with big input for shaker sort()", dataProvider = "bigInputSorterTest"
//            , dataProviderClass = SorterTestData.class)
//    public void bigInputSortTest(Array a, boolean isIncreasing, Array c){
//        Array expected = c;
//        sorter.sort(a, isIncreasing);
//        assertEquals(a, expected);
//    }
}
