package gb.javacore_2.lesson_1.HW_L_1;

public abstract class Difficulties {

    String name;

    public Difficulties(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    protected abstract boolean moving(Doing doing);
}
