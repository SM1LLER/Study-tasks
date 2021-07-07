package by.training.task03.service;

import by.training.task03.entity.Array;
import org.testng.annotations.DataProvider;

import java.util.Arrays;

public class SorterTestData {


    @DataProvider(name = "positiveForSorterTest")
    public static Object[][] createPositiveForSorter(){
        return new Object[][]{
                {new Array(new int[]{9, 5, 3, 7, 2, 1, 0, 4, 6, 8})
                        , true
                        , new Array(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9})
                },
                {new Array(new int[]{1, 0})
                        , true
                        , new Array(new int[]{0, 1})
                },
                {new Array(new int[]{1, 1})
                        , true
                        , new Array(new int[]{1, 1})
                },
                {new Array(new int[]{0})
                        , true,
                        new Array(new int[]{0})
                },
                {new Array(new int[]{9, 5, 3, 7, 2, 1, 0, 4, 6, 8})
                        , false
                        , new Array(new int[]{9, 8 ,7 , 6, 5, 4, 3, 2, 1, 0})
                },
                {new Array(new int[]{1, 0})
                        , false
                        , new Array(new int[]{1, 0})
                },
                {new Array(new int[]{1, 1})
                        , false
                        , new Array(new int[]{1, 1})
                },
                {new Array(new int[]{0})
                        , false,
                        new Array(new int[]{0})
                }
        };
    }

    @DataProvider(name = "bigInputSorterTest")
    public static Object[][] createBigInputForSorter(){
        int[] el100 = createArray(100);
        int[] el1000 = createArray(1000);
        int[] el10000 = createArray(10000);
        int[] el100000 = createArray(100000);
        int[] sort100 = el100.clone();
        int[] sort1000 = el1000.clone();
        int[] sort10000 = el10000.clone();
        int[] sort100000 = el100000.clone();
        Arrays.sort(sort100);
        Arrays.sort(sort1000);
        Arrays.sort(sort10000);
        Arrays.sort(sort100000);
        return new Object[][]{
                {new Array(el100)
                        , true
                        , new Array(sort100)
                },
                {new Array(el1000)
                        , true
                        , new Array(sort1000)
                },
                {new Array(el10000)
                        , true
                        , new Array(sort10000)
                },
                {new Array(el100000)
                        , true,
                        new Array(sort100000)
                },
        };
    }

    private static int[] createArray(int size){
        int array[] = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 100));
            System.out.println(array[i]);
        }
        return array;
    }
}
