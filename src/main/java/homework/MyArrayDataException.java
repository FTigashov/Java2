package homework;

public class MyArrayDataException extends RuntimeException {
    public MyArrayDataException(String output) {
        super("Не удалось преобразовать элемент массива. " + output);
    }
}
