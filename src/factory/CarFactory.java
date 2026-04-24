package factory;


import car.Car;

public class CarFactory {

    public Car createCar(EngineType type) {
        return new Car(EngineFactory.createEngine(type));

    }

    public Car ReplaceEngine(Car car, EngineType type) {
        car.setEngine(EngineFactory.createEngine(type));
        return car;

    }
}