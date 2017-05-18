package in.psquare.factorydesignpattern.cars;

import android.util.Log;

import in.psquare.factorydesignpattern.Car;

/**
 * Created by CH-E01006 on 4/8/2017.
 */

public class AltoCar implements Car {
    @Override
    public String draw() {
        Log.i("TAG", "Alto Car");
        return "Alto Car";
    }

    @Override
    public void noOfSeats() {
        Log.i("TAG", "5");
    }

}
