package lesson3;

import java.util.Arrays;

/*      1. Создайте исключения: MyArraySizeException (неправильный размер массива), и
        MyArrayDataException (в ячейке массива лежит что-то не то);

        2. Напишите метод, на вход которого подаётся двумерный строковый массив (String[][]) размером
        4×4. При подаче массива другого размера необходимо бросить исключение
        MyArraySizeException.

        3. Далее метод должен пройтись по всем элементам массива, преобразовать в int и
        просуммировать. Если в каком-то элементе массива преобразование не удалось (например, в
        ячейке лежит символ или текст вместо числа), должно быть брошено исключение
        MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные. Расчет
        данных для этой матрицы прекращается.

        4. В методе main() нужно вызвать полученный метод, обработать возможные исключения
        MySizeArrayException и MyArrayDataException и вывести результат расчёта.

        Заметка: для преобразования строки в число можно использовать метод класса Integer:
        Integer. valueOf ( "1" )*/
public class MainApp {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        String[][] strings = {
                {"1","ф","3","3"},
                {"9","5","6","4"},
                {"1","5","9","4"},
                {"7","8","3","2"}
        };

        System.out.println(Arrays.deepToString(strings));
        System.out.println(takeSumOfTwoDimensionalMassive(strings));

    }

    public static int takeSumOfTwoDimensionalMassive(String[][] stringsMassive) throws MyArraySizeException, MyArrayDataException {
        //Считает сколько всего символов и сравнивает с 16(4х4)
        int sumOfSymbols = 0;

        for (int i = 0; i < stringsMassive.length; i++) {
            for (int j = 0; j <stringsMassive[i].length ; j++) {
                sumOfSymbols ++;
            }
        }
        if (sumOfSymbols!=16){
            throw new MyArraySizeException();
        }

        int sumOfNumbers= 0;

        for (int i = 0; i < stringsMassive.length; i++) {
            for (int j = 0; j <stringsMassive[i].length ; j++) {
                try {
                    sumOfNumbers =sumOfNumbers + Integer.parseInt(stringsMassive[i][j]);
                } catch (MyArrayDataException e) {
                    System.out.println("Символ по адресу: строка - "+i + " столбец - "+j+ " не является числом");
                }
            }
        }
        return sumOfNumbers;
    }


}
