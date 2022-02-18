package homework;

import java.util.Arrays;
import java.util.Random;

public class HomeApp {
    private static final int arrayLength = 4;
    private static int sumOfElements = 0;

    static Random random = new Random();

    public static void main(String[] args) {

        // тестирование на размерность не равное 4 на 4
        String[][] data = new String[5][5];
        makeIntAndSum(data);

        // тестирование при идеальном варианте
        data = new String[4][4];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = String.valueOf(random.nextInt(10));
            }
        }
        makeIntAndSum(data);

        // Тестирование массива на преобразование элементов отличных от типа int
        data = new String[][] {
                {"1", "a", "b", "4"},
                {"1", "2", "3", "1"},
                {"1", "4", "5", "a"},
                {"1", "6", "7", "b"}
        };
        makeIntAndSum(data);
    }

    public static void makeIntAndSum(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            arrayLengthCheck(array.length);
            for (int j = 0; j < array[i].length; j++) {
                arrayLengthCheck(array[i].length);
                try {
                    sumOfElements += Integer.parseInt(array[i][j]);
                }
                catch (NumberFormatException e) {
                    throw new MyArrayDataException(String.format("Элемент [%d][%d] не является типом int.\n", i, j));
                }
            }
        }
        System.out.printf("Сумма элементов массива: %d\n", sumOfElements);
    }

    public static void arrayLengthCheck(int length) {
        if (length != arrayLength) {
            throw new MySizeArrayExeption(String.format("Необходимая размерность %s на %s.\n", arrayLength, arrayLength));
        }
    }

}
