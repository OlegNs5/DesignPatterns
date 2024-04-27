package ro.ctrln.factory;

public class WindshieldWipper implements Part{
    @Override
    public String getPart() {
        return "Windshield Wipper";
    }

    @Override
    public int getSize() {
        return 60;
    }
}
