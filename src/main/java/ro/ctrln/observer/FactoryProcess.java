package ro.ctrln.observer;

public class FactoryProcess {
    public static void main(String[] args) {
        FactoryStock factoryStockOne = new FactoryStock();//acesta este un observator
        FactoryStock factoryStockTwo = new FactoryStock();
        FactoryWorker factoryWorker = new FactoryWorker();//acesta este un observabi, aceste trebuie observat

        factoryWorker.addObserver(factoryStockOne);
        factoryWorker.addObserver(factoryStockTwo);
        factoryWorker.setStockLevel(100);

        System.out.println(factoryStockOne.getStockLevel() == factoryStockTwo.getStockLevel());
        System.out.println(factoryStockOne.getStockLevel());
    }
}
