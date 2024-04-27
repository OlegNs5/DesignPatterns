package ro.ctrln.decorator;

public class NeonCar extends StockCarDecorator{

    public NeonCar(StockCar stockCar) {
        super(stockCar);
    }

    @Override
    public String addParts() {
        return super.addParts() + addNeonLights();
    }

    private String addNeonLights() {
        return "with neon lights ";
    }
}
