package gb.javacore_2.lesson_1.HW_L_1;

public class Track extends Difficulties{
    int distance_track;

    public Track(String name, int distance_track){
        super(name);
        this.distance_track = distance_track;
    }

    public int getDistance_track() {
        return distance_track;
    }

    @Override
    protected boolean moving(Doing doing) {
        System.out.println(super.getName() + "дистанция: " + this.distance_track);
        doing.run();
        if (distance_track <= doing.getDisatnce()){
            System.out.println("пробежал");
            return true;
        }
        else{
            System.out.println("не пробежал");
            return false;
        }

    }
}
