package ro.ctrln.factory;

public class Windshield implements Part{
    @Override
    public String getPart() {
        return "wildshield";
    }

    @Override
    public int getSize() {
        return 20;
    }
}
