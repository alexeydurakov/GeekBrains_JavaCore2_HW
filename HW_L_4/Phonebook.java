package gb.javacore_2.lesson_4.HW_3;

//Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
// В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать номер
// телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
// тогда при запросе такой фамилии должны выводиться все телефоны. Желательно не добавлять лишний функционал
// (дополнительные поля (имя, отчество, адрес), взаимодействие с пользователем через консоль и т.д).
// Консоль использовать только для вывода результатов проверки телефонного справочника.

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;


public class Phonebook {

    HashMap<String, HashSet<String>> pb =new HashMap<>();
    HashSet<String>  book = new HashSet<String> ();

    public void addContact(String name, String phone) {
        book = pb.getOrDefault(name, new HashSet<>());
        book.add(phone);
        pb.put(name, book);
    }
    public HashSet getContact(String name) {
         //pb.getOrDefault(name, new HashSet<>());
        return pb.getOrDefault(name, new HashSet<>());

    }
}
