package ro.ctrln.decorator;

public class SimpleStockCar implements StockCar{

    @Override
    public String addParts() {
        return "Simple car ";
    }
}
