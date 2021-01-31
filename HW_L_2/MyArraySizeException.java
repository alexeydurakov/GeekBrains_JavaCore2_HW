package gb.javacore_2.lesson_2.HW_L_2;

public class MyArraySizeException extends IndexOutOfBoundsException {
    public MyArraySizeException(){
        super("Ошибка размерности массива");
    }
}
