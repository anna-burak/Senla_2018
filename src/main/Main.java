package main;

import service.TaskService;
import service.impl.TaskServiceImpl;
import util.CustomScanner;
import util.Printer;

import java.util.Arrays;
import java.util.List;

import static util.MessageTitleStorage.*;

public class Main {

    private static final Integer LIMIT = 100;

    public static void main(String[] args) {
        Printer printer = new Printer();
        CustomScanner scanner = new CustomScanner();
        TaskService taskService = new TaskServiceImpl();

        printer.println(FIRST_TASK_TITLE);
        Integer firstTaskValue = scanner.enterInteger(INPUT_INTEGER_TITLE_MESSAGE);

        printer.println(String.format(PRIME_OR_COMPOSITE_NUMBER_ANSWER_TITLE, firstTaskValue,
                taskService.isPrimeNumber(firstTaskValue) ? PRIME_NUMBER_MESSAGE : COMPOSITE_NUMBER_MESSAGE));

        printer.println(String.format(EVEN_OR_ODD_NUMBER_ANSWER_TITLE, firstTaskValue,
                taskService.isEven(firstTaskValue) ? EVEN_NUMBER_MESSAGE : ODD_NUMBER_MESSAGE));

        printer.println(SECOND_TASK_TITLE);
        Integer secondTaskFirstValue = scanner.enterInteger(INPUT_FIRST_INTEGER_TITLE_MESSAGE);
        Integer secondTaskSecondValue = scanner.enterInteger(INPUT_SECOND_INTEGER_TITLE_MESSAGE);
        printer.println(String.format(GCD_NUMBER_ANSWER_TITLE, secondTaskFirstValue, secondTaskSecondValue,
                taskService.getGCD(secondTaskFirstValue, secondTaskSecondValue)));

        printer.println(String.format(LCM_NUMBER_ANSWER_TITLE, secondTaskFirstValue, secondTaskSecondValue,
                taskService.getLCM(secondTaskFirstValue, secondTaskSecondValue)));

        printer.println(String.format(SUM_NUMBER_ANSWER_TITLE, secondTaskFirstValue, secondTaskSecondValue,
                taskService.getSum(secondTaskFirstValue, secondTaskSecondValue)));

        printer.println(String.format(DIFFERENCE_NUMBER_ANSWER_TITLE, secondTaskFirstValue, secondTaskSecondValue,
                taskService.getDifference(secondTaskFirstValue, secondTaskSecondValue)));

        printer.println(THIRD_TASK_TITLE);
        String thirdTaskValue = scanner.enterText(INPUT_STRING_TITLE_MESSAGE);
        printer.println(String.format(PALINDROME_ANSWER_TITLE, thirdTaskValue, taskService.isPalindrome(thirdTaskValue) ? YES_MESSAGE : NO_MESSAGE));

        printer.println(FOURTH_TASK_TITLE);
        String fourthTaskValue = scanner.enterText(INPUT_SENTENCE_TITLE_MESSAGE);
        String[] words = taskService.getWordsFromSentence(fourthTaskValue);
        printer.println(String.format(COUNT_WORD_AND_SORT_ANSWER_TITLE, fourthTaskValue, words.length, Arrays.toString(words)));

        printer.println(FIFTH_TASK_TITLE);
        String fifthTaskValueWord = scanner.enterText(INPUT_STRING_TITLE_MESSAGE);
        String fifthTaskValueSentence = scanner.enterText(INPUT_SENTENCE_TITLE_MESSAGE);
        printer.println(String.format(COUNT_WORD_IN_SENTENCE_ANSWER_TITLE, fifthTaskValueWord, fifthTaskValueSentence,
                taskService.searchWord(fifthTaskValueWord, fifthTaskValueSentence)));

        printer.println(SIXTH_TASK_TITLE);
        Double a = scanner.enterDouble(INPUT_FIRST_DOUBLE_TITLE_MESSAGE);
        Double b = scanner.enterDouble(INPUT_SECOND_DOUBLE_TITLE_MESSAGE);
        Double c = scanner.enterDouble(INPUT_THIRD_DOUBLE_TITLE_MESSAGE);
        printer.println(String.format(MAKE_RECTANGULAR_TRIANGLE_ANSWER_TITLE, a, b, c,
                taskService.checkRectangularTriangle(a, b, c) ? YES_MESSAGE : NO_MESSAGE));

        printer.println(SEVENTH_TASK_TITLE);
        Integer length = scanner.enterInteger(INPUT_INTEGER_TITLE_MESSAGE);
        int array[] = taskService.generateArray(length);
        printer.println(String.format(ARRAY_AND_MAX_MIN_VALUE_ANSWER_TITLE, Arrays.toString(array),
                taskService.findMin(array), taskService.findMax(array)));

        printer.println(EIGHTH_TASK_TITLE);
        Integer palindromeSequenceLength = scanner.enterInteger(INPUT_INTEGER_TITLE_MESSAGE, LIMIT);
        printer.println(String.format(PALINDROME_LIST_ANSWER_TITLE, palindromeSequenceLength, taskService.getPalindromes(palindromeSequenceLength)));

        printer.println(NINTH_TASK_TITLE);
        Integer evenSequenceLength = scanner.enterInteger(INPUT_INTEGER_TITLE_MESSAGE);
        List<Integer> evenNumbers = taskService.getEvenNumbers(evenSequenceLength);
        printer.println(String.format(EVEN_NUMBERS_ANSWER_TITLE, evenSequenceLength, evenNumbers, taskService.getSum(evenNumbers)));

        printer.println(TENTH_TASK_TITLE);
        Integer firstIntValue = scanner.enterInteger(INPUT_FIRST_INTEGER_TITLE_MESSAGE, 9);
        Integer secondIntValue = scanner.enterInteger(INPUT_SECOND_INTEGER_TITLE_MESSAGE, 9);
        Integer thirdIntValue = scanner.enterInteger(INPUT_THIRD_INTEGER_TITLE_MESSAGE, 9);
        printer.println(String.format(COMBINATIONS_OF_THREE_DIGIT_NUMBERS, firstIntValue, secondIntValue, thirdIntValue,
                taskService.getCombinations(firstIntValue, secondIntValue, thirdIntValue).toString()));
    }
}
