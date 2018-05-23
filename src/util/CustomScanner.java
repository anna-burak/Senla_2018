package util;

import java.util.Scanner;

public class CustomScanner {

    private static final String INTEGER_REGEX = "[+-]?[0-9]+";
    private static final String REAL_NUMBER_REGEX = "[+-]?([0-9]*[.])?[0-9]+";

    private static final String INTEGER_ERROR = "Введенная строка '%s' не является целым числом. Повторите ввод.";
    private static final String REAL_NUMBER_ERROR = "Введенная строка '%s' не является дробным числом. Повторите ввод.";
    private static final String LIMIT_ERROR = "Значение должно быть не больше '%d'.";

    private static final String ERROR_CODE = "-1";

    private Scanner in = new Scanner(System.in, "Cp1251");
    private Printer printer = new Printer();

    public CustomScanner() {
    }

    /**
     * Ввести целое число
     *
     * @return Целое число (Integer)
     */
    public Integer enterInteger(String title) {
        return enterInteger(title, null);
    }

    public Integer enterInteger(String title, Integer limit) {
        boolean success = false;

        while (!success) {
            printer.print(title);

            String value = enterText();

            if (value.matches(INTEGER_REGEX)) {
                Integer intValue = Integer.valueOf(value);
                if (limit != null && intValue > limit) {
                    printer.println(String.format(LIMIT_ERROR, limit));
                    continue;
                }

                return intValue;
            }

            printer.println(String.format(INTEGER_ERROR, value));
        }

        return Integer.valueOf(ERROR_CODE);
    }

    /**
     * Ввести дробное число
     *
     * @return Дробное число (Double)
     */
    public Double enterDouble(String title) {
        boolean success = false;

        while (!success) {
            printer.print(title);

            String value = enterText();

            if (value.matches(REAL_NUMBER_REGEX)) {
                return Double.valueOf(value);
            }

            printer.println(String.format(REAL_NUMBER_ERROR, value));
        }

        return Double.valueOf(ERROR_CODE);
    }

    public String enterText(String title) {
        printer.print(title);
        return in.nextLine();
    }

    private String enterText() {
        return enterText("");
    }
}
