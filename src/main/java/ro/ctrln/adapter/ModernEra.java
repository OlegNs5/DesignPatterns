package ro.ctrln.adapter;

public class ModernEra implements TraditionalAdapter {

    private Traditional traditional;

    public ModernEra (Traditional traditional){
        this.traditional = traditional;
    }

    @Override
    public String doingStuffThisWay() {
        String oldWay = traditional.doingStuffThisWay();
        return oldWayIsGone(oldWay);
    }

    private String oldWayIsGone(String oldWay) {
        System.out.println(oldWay + " is gone !");
        return "This is how we do it now !" ;
    }
}
