package ro.ctrln.factory;

public class PartsFactory {

    public Part getPart (PartType partType){
        switch (partType){
            case windshieldwipper:
                return new WindshieldWipper();
            case waterpump:
                return new WaterPump();
            case  windshield:
                return new Windshield();
        }
        return null;
    }
}
