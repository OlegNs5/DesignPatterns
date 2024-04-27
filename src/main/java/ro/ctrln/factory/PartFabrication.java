package ro.ctrln.factory;

public class PartFabrication {
    public static void main(String[] args) {
        PartsFactory partsFactory = new PartsFactory();
        Part waterPump = partsFactory.getPart(PartType.waterpump);
        Part windshieldwipper = partsFactory.getPart(PartType.windshieldwipper);
        Part windshiel = partsFactory.getPart(PartType.windshield);

        System.out.println(waterPump.getPart());
        System.out.println(waterPump.getSize());

        System.out.println(windshieldwipper.getPart());
        System.out.println(windshieldwipper.getSize());

        System.out.println(windshiel.getPart());
        System.out.println(windshiel.getSize());
    }
}
