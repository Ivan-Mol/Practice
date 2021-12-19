package lesson3;
//в ячейке массива лежит что-то не то
public class MyArrayDataException extends NumberFormatException {
    @Override
    public StackTraceElement[] getStackTrace() {
        return super.getStackTrace();
    }

    public MyArrayDataException(String message) {
        super(message);
    }
}
