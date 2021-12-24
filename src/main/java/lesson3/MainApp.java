package lesson3;

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
    public static void main(String[] args) {
        String[][] strings = {
                {"1", "5", "3", "3"},
                {"9", "5", "3", "4"},
                {"1", "5", "9", "4"},
                {"7", "8", "3","4"}
        };

        try {
            System.out.println(takeSumOfTwoDimensionalMassive(strings));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }


    }

    public static int takeSumOfTwoDimensionalMassive(String[][] stringsMassive) throws MyArraySizeException, MyArrayDataException {

        arrayChecking(stringsMassive);

        int sumOfNumbers = 0;

        for (int i = 0; i < stringsMassive.length; i++) {
            for (int j = 0; j < stringsMassive[i].length; j++) {
                try {
                    sumOfNumbers = sumOfNumbers + Integer.parseInt(stringsMassive[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i,j);
                }
            }
        }
        return sumOfNumbers;
    }



    public static void arrayChecking(String[][] strings) throws MyArraySizeException {
        if (strings.length < 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length < 4) {
                throw new MyArraySizeException();
            }
        }
    }


}