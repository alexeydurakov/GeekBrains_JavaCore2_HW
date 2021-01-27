package gb.javacore_2.lesson_1.HW_L_1;

public class Robot implements Doing{
    String name;
    int disatnce;
    int higth_wall;

    public Robot(String name, int disatnce, int higth_wall) {
        this.name = name;
        this.disatnce = disatnce;
        this.higth_wall = higth_wall;
    }

    public void run(){
        System.out.println(this.name + " пробежал на " + this.getDisatnce() + " метров");
    }

    public void jump(){
        System.out.println(this.name + " прыгнул на " + this.getHigth_wall() + " метров");
    }

    public int getDisatnce(){
        return this.disatnce;
    }

    public int getHigth_wall() {
        return this.higth_wall;
    }
}
