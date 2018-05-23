package service.impl;

import service.TaskService;
import util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaskServiceImpl implements TaskService {

    @Override
    public boolean isPrimeNumber(Integer number) {
        boolean isPrimeNumber = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrimeNumber = false;
                break;
            }
        }

        return isPrimeNumber;
    }

    @Override
    public boolean isEven(Integer number) {
        return number % 2 == 0;
    }

    @Override
    public int getGCD(int a, int b) {
        int gcd = 1;

        if (a > b) {
            for (int i = b; i >= 1; i--) {
                if (a % i == 0 && b % i == 0) {
                    return i;
                }
            }
        } else {
            for (int j = a; j >= 1; j--) {
                if (a % j == 0 && b % j == 0) {
                    return j;
                }
            }
        }
        return gcd;

    }

    @Override
    public int getLCM(int a, int b) {
        return a / getGCD(a, b) * b;
    }

    @Override
    public int getSum(int a, int b) {
        return a + b;
    }

    @Override
    public int getSum(List<Integer> list) {
        int sum = 0;
        for (int item : list) {
            sum += item;
        }
        return sum;
    }

    @Override
    public int getDifference(int a, int b) {
        return a - b;
    }

    @Override
    public boolean isPalindrome(String text) {
        String lowerCaseText = text.toLowerCase();
        String reverseText = new StringBuilder(lowerCaseText).reverse().toString();
        return reverseText.equals(lowerCaseText);
    }

    @Override
    public String[] getWordsFromSentence(String text) {
        String[] words = text.trim().split("[ ,\\s]+");
        Arrays.sort(words);
        return words;
    }

    @Override
    public int searchWord(String word, String text) {
        text = text.toLowerCase();
        word = word.toLowerCase();
        int i = text.indexOf(word);
        int count = 0;
        while (i >= 0) {
            count++;
            i = text.indexOf(word, i + 1);
        }
        return count;
    }

    @Override
    public boolean checkRectangularTriangle(Double a, Double b, Double c) {
        return (a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == a * a + b * b);
    }

    @Override
    public int[] generateArray(int length) {
        int array[] = new int[length];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((10 + Math.random() * (99 - 10)));
        }

        return array;
    }

    @Override
    public int findMin(int array[]) {
        int min = array[0];
        for (int i = 0; i != array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }

    @Override
    public int findMax(int array[]) {
        int max = array[0];
        for (int i = 0; i != array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }

    @Override
    public List<Integer> getPalindromes(Integer length) {
        List<Integer> palindromes = new ArrayList<>();
        for (int i = 0; i <= length; i++) {
            if (isPalindrome(Integer.valueOf(i).toString())) {
                palindromes.add(i);
            }
        }

        return palindromes;
    }

    @Override
    public List<Integer> getEvenNumbers(Integer length) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (int i = 0; i <= length; i++) {
            if (isEven(i)) {
                evenNumbers.add(i);
            }
        }

        return evenNumbers;
    }

    @Override
    public List<String> getCombinations(int a, int b, int c) {
        List<String> result = new ArrayList<>();
        int[] array = new int[]{a, b, c};
        comb(array, 0, result);

        return result;
    }

    private void comb(int[] array, int i, List<String> result) {
        if (i == array.length - 1) {
            result.add(StringUtils.convert(array));
        } else {
            for (int j = i; j < array.length; j++) {
                change(array, i, j);
                comb(array, i + 1, result);
            }
        }
    }

    private void change(int[] A, int i, int j) {
        int z = A[i];
        A[i] = A[j];
        A[j] = z;
    }
}
