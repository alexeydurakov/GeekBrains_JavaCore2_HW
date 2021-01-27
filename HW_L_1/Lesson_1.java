package gb.javacore_2.lesson_1.HW_L_1;

public class Lesson_1 {

    public static void main(String[] args) {

        Doing[] doing = new Doing[3];
        doing[0] = new Person("Man", 1000, 2);
        doing[1] = new Cat("Cat", 200, 3);
        doing[2] = new Robot("Robot", 10000, 5);

        Difficulties[] difficulties = new Difficulties[8];
        difficulties[0] = new Track("Track 0", 100);
        difficulties[1] = new Wall("Wall 1", 1);
        difficulties[2] = new Track("Track 2", 500);
        difficulties[3] = new Wall("Wall 3", 2);
        difficulties[4] = new Track("Track 4", 1000);
        difficulties[5] = new Wall("Wall 5", 5);
        difficulties[6] = new Track("Track 6", 20000);
        difficulties[7] = new Wall("Wall 7", 10);

        for (int i = 0; i < 3; i++){
            boolean finish = true;
            for (int j = 0; j < 8; j++){
                finish = difficulties[j].moving(doing[i]);
                if (finish != true)
                    break;

            }
        }

    }
}
