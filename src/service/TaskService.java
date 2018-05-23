package service;

import java.util.List;

public interface TaskService {

    boolean isPrimeNumber(Integer number);

    boolean isEven(Integer number);

    int getGCD(int a, int b);

    int getLCM(int a, int b);

    int getSum(int a, int b);

    int getSum(List<Integer> list);

    int getDifference(int a, int b);

    boolean isPalindrome(String text);

    String[] getWordsFromSentence(String text);

    int searchWord(String word, String text);

    boolean checkRectangularTriangle(Double a, Double b, Double c);

    int[] generateArray(int length);

    int findMin(int array[]);

    int findMax(int array[]);

    List<Integer> getPalindromes(Integer length);

    List<Integer> getEvenNumbers(Integer length);

    List<String> getCombinations(int a, int b, int c);
}
