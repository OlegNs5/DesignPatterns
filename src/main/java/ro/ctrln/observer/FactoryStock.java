package ro.ctrln.observer;

public class FactoryStock implements Stock {

    private int stockLevel;

    @Override
    public void update(int stockLevel) {
        this.stockLevel = stockLevel;
    }

    public int getStockLevel() {
        return stockLevel;
    }

    public void setStockLevel(int stockLevel) {
        this.stockLevel = stockLevel;
    }
}
