package by.training.loop.services;

public class RomanToArabImpl implements RomanToArab{
    @Override
    public int translate(String roman) {
        int arabic = 0;
        int curr = 0;
        int prev = 0;
        for (char ch : roman.toCharArray()){
            curr = fromLetterToDigit(ch);
            if (curr > prev) {
                arabic += curr - (prev * 2);
            } else {
                arabic += curr;
            }
            prev = curr;
        }
        return arabic;
    }

    private int fromLetterToDigit(char ch){
        switch (ch) {
            case ('I'):
                return 1;
            case ('V'):
                return 5;
            case ('X'):
                return 10;
            case ('L'):
                return 50;
            case ('C'):
                return 100;
            case ('D'):
                return 500;
            case ('M'):
                return 1000;
        }
        return 0;
    }
}
