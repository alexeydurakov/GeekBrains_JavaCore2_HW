package gb.javacore_2.lesson_2.HW_L_2;

public class Lesson_2 {

    public static void main(String[] args) {
        //Объявим массивы
        String[][] right_arr = {{"1", "2", "3", "4"}, {"21", "22", "23", "24"}, {"31", "32", "33", "34"}, {"41", "42", "43", "44"}};
        String[][] size_err_arr = {{"1", "2", "3", "4"}, {"21", "23", "24"}, {"31", "32", "33", "34"}, {"41", "42", "43", "44"}};
        String[][] simbol_err_arr = {{"1", "2", "3", "4"}, {"21", "a", "23", "24"}, {"31", "32", "33", "34"}, {"41", "42", "43", "44"}};

        System.out.println(changeInt(right_arr));
        try{
            System.out.println(changeInt(size_err_arr));
        }catch (MyArraySizeException e){
            System.out.println(e.getMessage());
        }

        try{
            System.out.println(changeInt(simbol_err_arr));
        }
        catch(NumberFormatException e){
            System.out.println(e.getMessage());
        }
    }


    private static int changeInt(String[][] my_arr) throws MyArrayDataException, MyArraySizeException{
        int sum = 0;

        if (my_arr.length != 4) {throw new MyArraySizeException();}

        for (int i = 0; i < my_arr.length; i++) {

            if (my_arr[i].length != 4) {throw new MyArraySizeException();}

            for (int j = 0; j < my_arr[i].length; j++) {
                try{
                    sum += Integer.parseInt(my_arr[i][j]);
                }catch (NumberFormatException e){
                    throw new MyArrayDataException(i, j);
                }

            }
        }
        return sum;
    }
}



