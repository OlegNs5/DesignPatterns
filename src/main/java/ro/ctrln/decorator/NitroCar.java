package ro.ctrln.decorator;

public class NitroCar extends StockCarDecorator{

    public NitroCar(StockCar stockCar) {
        super(stockCar);
    }

    @Override
    public String addParts() {
        return super.addParts() + addNitro();
    }

    private String addNitro() {
        return "with nitro " ;
    }
}
