package ro.ctrln.factory;

public class WaterPump implements Part{
    @Override
    public String getPart() {
        return "WaterPump";
    }

    @Override
    public int getSize() {
        return 34;
    }
}
