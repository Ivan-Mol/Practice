package lesson3;
//в ячейке массива лежит что-то не то
public class MyArrayDataException extends Exception {
    public MyArrayDataException(int i,int j) {
        super("Символ по адресу: строка - " + i + " столбец - " + j + " не является числом");
    }
}