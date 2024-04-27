package ro.ctrln.decorator;

public class BumperCar extends  StockCarDecorator{

    public BumperCar(StockCar stockCar) {
        super(stockCar);
    }

    @Override
    public String addParts() {
        return super.addParts() + addBumpers();
    }

    private String addBumpers() {
        return "with bumpers " ;
    }
}
