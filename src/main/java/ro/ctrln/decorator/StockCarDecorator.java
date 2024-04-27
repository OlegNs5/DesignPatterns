package ro.ctrln.decorator;

public class StockCarDecorator implements StockCar{

    private StockCar stockCar;

    public StockCarDecorator(StockCar stockCar){
        this.stockCar = stockCar;
    }

    @Override
    public String addParts() {
        return stockCar.addParts();
    }
}
