package gb.javacore_2.lesson_1.HW_L_1;

public class Wall extends Difficulties{
    int heigth;

    public Wall(String name, int heigth) {
        super(name);
        this.heigth = heigth;
    }

    public int getHeigth() {
        return heigth;
    }

    @Override
    protected boolean moving(Doing doing) {
        System.out.println(super.getName() + "высота: " + this.heigth);
        doing.jump();
        if (getHeigth() <= doing.getHigth_wall()) {
            System.out.println("перепрыгнул");
            return true;
        }
        else {
            System.out.println("не перепрыгнул");
            return false;
        }
    }
}
