package in.psquare.factorydesignpattern.cars;

import in.psquare.factorydesignpattern.Car;

/**
 * Created by CH-E01006 on 4/8/2017.
 */

public class CretaCar implements Car {
    @Override
    public String draw() {
        return "Creta";
    }

    @Override
    public void noOfSeats() {

    }
}
