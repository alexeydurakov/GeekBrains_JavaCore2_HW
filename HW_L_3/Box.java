package gb.javacore_2.lesson_3.HW_L_3;

import java.util.ArrayList;

public class Box <T> extends Fruit{
    public ArrayList<T> box = new ArrayList<>();

//модуль добавления фруктов в коробку
    public void addFruitsinBox(T fruit, int num_fruit){
        for(int i = 1; i <= num_fruit; i++){
            box.add(fruit);
        }
    }
//модуль взвешивания коробки

    public float getWeight(){
        float weight = 0.0f;
        for (T t : box)
            weight += t.getWeight();
        return weight;
    }

    public boolean compare(Box next) {
        if(getWeight() == next.getWeight())
            return true;
        else
            return false;
    }

    public void refilling(Box <T> next){
        next.box.addAll(box);
        box.clear();
    }
}
