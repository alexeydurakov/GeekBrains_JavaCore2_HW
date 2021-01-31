package gb.javacore_2.lesson_2.HW_L_2;

public class MyArrayDataException extends NumberFormatException {
    public MyArrayDataException(int i, int j){
        super("Элемент " + "[" + i + "]" + "[" + j + "]" + "не является числом");
    }
}
