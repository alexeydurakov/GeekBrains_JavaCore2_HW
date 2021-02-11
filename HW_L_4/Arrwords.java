package gb.javacore_2.lesson_4.HW_3;

//1.Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
// Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
// Посчитать, сколько раз встречается каждое слово.

import java.util.*;

public class Arrwords {
    public static void main(String[] args) {
        Map<String, Integer> hm = new HashMap<>();
          List<String> myArray =  new ArrayList<>(Arrays.asList("time", "people", "year", "way", "day", "thing",
                  "people", "day", "group", "hand", "child", "time", "people"));

        Set<String> setUniq = new HashSet<>(myArray);
        System.out.println(setUniq);

        Iterator<String> iter = setUniq.iterator();

        while(iter.hasNext()){
            String str = iter.next();
            int count = 0;
            for (int i = 0; i < myArray.size(); i++) {
                if(str.equals(myArray.get(i))){
                    count += 1;
                }
            }
            if (count > 1){
                System.out.println(str + " встречается " + count + " раза");
            }
        }
    }
}
