package gb.javacore_2.lesson_3.HW_L_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;


public class main {
    public static void main(String[] agrs) throws IOException {

//Написать метод, который меняет два элемента массива местами
//(массив может быть любого ссылочного типа);
        int[] myArray = new int[]{1, 2, 3, 4, 5 , 6};
        swap_places(myArray);

// Создаем коробки
        Box<Orange> orangeBox_1 = new Box<Orange>();
        Box<Apple> appleBox_1 = new Box<Apple>();
        Box<Orange> orangeBox_2 = new Box<Orange>();
        Box<Apple> appleBox_2 = new Box<Apple>();

// Добавить фрукты в коробку
        orangeBox_1.addFruitsinBox(new Orange(), 10);
        orangeBox_2.addFruitsinBox(new Orange(), 12);
        appleBox_1.addFruitsinBox(new Apple(), 8);
        appleBox_2.addFruitsinBox(new Apple(), 5);

//Взвешиваем коробки
        System.out.println("Коробка вестит: " + orangeBox_1.getWeight());
        System.out.println("Коробка вестит: " + orangeBox_2.getWeight());
        System.out.println("Коробка вестит: " + appleBox_1.getWeight());
        System.out.println("Коробка вестит: " + appleBox_2.getWeight());

//Сравнение коробок с яблоками и с апельсинами
        System.out.println("Результат сравненеия " + orangeBox_1.compare(appleBox_1));
        System.out.println("Результат сравненеия " + orangeBox_2.compare(appleBox_2));

//Пересыпание фруктов из текущей коробки в другую
        orangeBox_1.refilling(orangeBox_2);
        appleBox_1.refilling(appleBox_2);

    }

    private static void swap_places(int[] myArray) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ввести индекс первого числа:");
        String s1 = reader.readLine();
        System.out.println("Ввести индекс второго числа:");
        String s2 = reader.readLine();
        int x1 = Integer.parseInt(s1);
        int x2 = Integer.parseInt(s2);

        int tmp = myArray[x1];
        myArray[x1] = myArray[x2];
        myArray[x2] = tmp;

        System.out.println(Arrays.toString(myArray));
    }
}
