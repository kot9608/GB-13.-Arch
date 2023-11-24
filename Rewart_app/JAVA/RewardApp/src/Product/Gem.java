package Product;

import Interface.iGameItem;

public class Gem extends ItemReward{
    @Override
    public void open(){
        System.out.println("Gem!");
    }
}
