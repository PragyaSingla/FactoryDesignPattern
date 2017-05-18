# FactoryDesignPattern
Factory Design Pattern Implemented in Android 

A design pattern in architecture and computer science is a formal way of documenting a solution to a design problem in a particular field of expertise.Using design patterns promotes reusability that leads to more robust and highly maintainable code. Java Design Patterns are divided into three categories – creational, structural, and behavioral design patterns.

Factory Pattern is one of the Creational Design pattern and it’s widely used in JDK as well as frameworks like Spring and Struts.
Factory design pattern is used when we have a super class with multiple sub-classes and based on input, we need to return one of the sub-class. This pattern take out the responsibility of instantiation of a class from client program to the factory class.


#Factory Class: Here is the basic implementation of Factory Class.

 public class CarFactory {
    public static Car getCar(Cars type) {

        if (type == CarsConst.maruti800) {
            return new MarutiCar();
        } else if (type == CarsConst.alto) {
            return new AltoCar();
        } else if (type == CarsConst.swift)
            return new SwiftCar();
      
        return null;
    }
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
    
    interface Cars {
        public String toString();
    }
