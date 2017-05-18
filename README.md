# FactoryDesignPattern
Factory Design Pattern Implemented in Android 

A design pattern is a formal way of documenting a solution to a design problem. Design patterns promotes reusability that leads to more robust and highly maintainable code. Java Design Patterns are divided into three categories
1. Creational
2. Structural
3. Behavioral

Factory Pattern is Creational Design pattern.Itis used when we have a parent class with multiple child classes and based on input, we need to return one of the child-class.


#Factory Class: Here is the basic implementation of Factory Class.

 public class CarFactory {
 
    public static Car getCar(Cars type) { 
       if (type == CarsConst.maruti800) {
            return new MarutiCar();
        } else if (type == CarsConst.alto) {
            return new AltoCar();
        } else if (type == CarsConst.swift){
            return new SwiftCar();
        }
        return null;
    }
}
