package ro.ctrln.observer;

import java.util.ArrayList;
import java.util.List;

public class FactoryWorker  {

    private int stockLevel;

    private List<Stock> stocks = new ArrayList<>();

    public void addObserver(Stock stock){
        this.stocks.add(stock);
    }

    public void removeObserver(Stock stock){
        this.stocks.remove(stock);
    }

    //aici notificam toti abservatorii ca a fost primit un mesaj sau o notificare
    public void setStockLevel(int stockLevel){
        this.stockLevel = stockLevel;
        for (Stock stock : this.stocks){
            stock.update(stockLevel );
        }
    }

    public int getStockLevel() {
        return stockLevel;
    }
}
