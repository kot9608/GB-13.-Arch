import java.awt.*;
import Enum.*;
import Intarfaces.*;

public class Pickup extends Car implements IFuelStation, IWip {
    private int loadCapacity;

    public Pickup(String make, String model, Color color, int wheelsNumber, TypeFuel fuel, TypeGearBox gearBox, float engineCap, int loadCapacity) {
        super(make, model, color, TypeCar.PICKUP, wheelsNumber, fuel, gearBox, engineCap);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void fuel() {
    }

    @Override
    public void wipWindshield() {}

    @Override
    public void wipHeadlights() {

    }

    @Override
    public void wipMirrors() {

    }
    //Спасибо за семинар!
}
