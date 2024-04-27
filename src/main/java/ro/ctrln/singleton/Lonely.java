package ro.ctrln.singleton;

public class Lonely {
    private static Lonely instance;

    public static Lonely getInstance(){
        if (instance == null){
            instance=new Lonely();
        }
        return instance;
    }

    private Lonely() {
    }
}
