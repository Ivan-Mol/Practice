package lesson3;
//неправильный размер массива
public class MyArraySizeException extends Exception {
    public MyArraySizeException() {
        super("Массив не 4х4");
    }
}