package ro.ctrln.adapter;

public class Ages {
    public static void main(String[] args) {
        AncientEra ancientEra = new AncientEra();
        ModernEra modernEra = new ModernEra(ancientEra);
        System.out.println(modernEra.doingStuffThisWay());

        MedievalEra medievalEra = new MedievalEra();
        ModernEra modernEraOne = new ModernEra(medievalEra);
        System.out.println(modernEraOne.doingStuffThisWay());


    }
}
