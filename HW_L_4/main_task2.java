package gb.javacore_2.lesson_4.HW_3;

public class main_task2 {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        phonebook.addContact("vova", "123");
        phonebook.addContact("nik", "456");
        phonebook.addContact("tom", "789");
        phonebook.addContact("den", "987");
        phonebook.addContact("vova", "654");
        phonebook.addContact("pol", "321");

        System.out.println("vova " + phonebook.getContact("vova"));
        System.out.println("nik " + phonebook.getContact("nik"));
        System.out.println("tom" + phonebook.getContact("tom"));
        System.out.println("den" + phonebook.getContact("den"));
        System.out.println("pol" + phonebook.getContact("pol"));
    }
}
