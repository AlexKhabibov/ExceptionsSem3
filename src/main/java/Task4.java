public class Task4 {

     public static int sumArray2D (String[][] array) {
         int sum = 0;
         if (array.length !=4) {
             throw new MyArraySizeException(array.length, array[0].length);
         }
         for (int i = 0; i < array.length; i++) {
             if (array[i].length !=4) {
                 throw new MyArraySizeException(array.length, array[i].length);
             }
             for (int j = 0; j < array[i].length; j++) {
                 try {
                     sum += Integer.parseInt(array[i][j]);
                 }catch (NumberFormatException e){
                     throw new MyArrayDataException(i,j);
                 }
             }
         }
         return sum;
     }

}

class MyArraySizeException extends RuntimeException {
    public MyArraySizeException(int row, int column){
        super("Массив не может быть 4х4, размеры вашего массива: " + row + "x" + column);
    }

    public MyArraySizeException(){
        super("Массив не может быть 4х4");
    }
}

class MyArrayDataException extends NumberFormatException{
    public MyArrayDataException(){
        super("В каком-то элементе массива преобразование не удалось");
    }

    public MyArrayDataException(int i, int j){
        super("Преобразование не удалось, индексы: " + i + ":" + j);
    }

}
