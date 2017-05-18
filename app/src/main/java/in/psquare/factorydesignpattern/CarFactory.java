package in.psquare.factorydesignpattern;

import java.util.ArrayList;
import java.util.Arrays;

import in.psquare.factorydesignpattern.cars.AltoCar;
import in.psquare.factorydesignpattern.cars.CretaCar;
import in.psquare.factorydesignpattern.cars.MarutiCar;
import in.psquare.factorydesignpattern.cars.SwiftCar;

/**
 * Created by CH-E01006 on 4/8/2017.
 */

public class CarFactory {

    interface Cars {
        public String toString();
    }

    enum CarsConst implements Cars {
        maruti800("Maruti 800"),
        alto("Alto"),
        swift("Swift"),
        creta("Creta"),
        limo("Limozen"),
        honda("Honda");
        private final String text;

        CarsConst(String s) {
            this.text = s;
        }

        @Override
        public String toString() {
            return text;
        }
    }

    enum Toy implements Cars {
        alto("AltoToy");
        private final String text;

        Toy(String s) {
            this.text = s;
        }

        @Override
        public String toString() {
            return text;
        }
    }

    enum WoodenCars implements Cars {
        alto("Alto Wooden");
        private final String text;

        WoodenCars(String s) {
            this.text = s;
        }

        @Override
        public String toString() {
            return text;
        }
    }

    static Cars[] values() {
        ArrayList<Cars> arrayOfCars = new ArrayList<>();
        arrayOfCars.addAll(Arrays.asList(CarsConst.values()));
        arrayOfCars.addAll(Arrays.asList(Toy.values()));
        arrayOfCars.addAll(Arrays.asList(WoodenCars.values()));
        return Arrays.copyOf(arrayOfCars.toArray(), arrayOfCars.size(), Cars[].class);
    }

    private CarFactory() {
    }

    public static Car getCar(Cars type) {

        if (type == CarsConst.maruti800) {
            return new MarutiCar();
        } else if (type == CarsConst.alto) {
            return new AltoCar();
        } else if (type == CarsConst.swift)
            return new SwiftCar();
        else if (type == CarsConst.creta) {
            return new CretaCar();
        } else if (type == CarsConst.limo) {
            return new Limozen();
        } else if (type == CarsConst.honda) {
            return new HondaCity();
        } else if (type == Toy.alto) {
            return new AltoToy();
        } else if (type == WoodenCars.alto) {
            return new AltoWooden();
        }
        return null;
    }
}

class Limozen implements Car {

    @Override
    public String draw() {
        return "Limozen car";
    }

    @Override
    public void noOfSeats() {

    }
}

class HondaCity implements Car {

    @Override
    public String draw() {
        return "Honda City";
    }

    @Override
    public void noOfSeats() {

    }
}

class AltoToy implements Car {

    @Override
    public String draw() {
        return "Alto Toy";
    }

    @Override
    public void noOfSeats() {

    }
}

class AltoWooden implements Car {

    @Override
    public String draw() {
        return "Alto Wooden";
    }

    @Override
    public void noOfSeats() {

    }
}