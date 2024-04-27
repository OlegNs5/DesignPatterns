package ro.ctrln.decorator;

public class Garage {
    public static void main(String[] args) {
        StockCar carOne = new BumperCar(new SimpleStockCar());
        System.out.println(carOne.addParts());

        StockCar carTwo = new BumperCar(new NeonCar(new SimpleStockCar()));
        System.out.println(carTwo.addParts());

        StockCar carThree = new NeonCar(new BumperCar(new SimpleStockCar()));
        System.out.println(carThree.addParts());

        StockCar carFour = new BumperCar(new NitroCar(new NeonCar(new SimpleStockCar())));
        System.out.println(carFour.addParts());
    }
}
