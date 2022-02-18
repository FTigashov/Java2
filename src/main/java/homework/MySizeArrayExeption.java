package homework;

import java.io.IOException;

public class MySizeArrayExeption extends RuntimeException {
    public MySizeArrayExeption(String output) {
        super("Ошибка размерности двумерного массива! " + output);
    }
}
