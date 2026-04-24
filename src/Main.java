import car.Car;
import engine.HybridEngine;
import factory.CarFactory;
import factory.EngineType;

public class Main {
    public static void main(String[] args) {


        CarFactory carFacorty = new CarFactory();
        Car electricCar = carFacorty.createCar(EngineType.ELECTRIC);
        Car gasCar = carFacorty.createCar(EngineType.GAS);
        Car hybridCar = carFacorty.createCar(EngineType.HYBRID);

        //testinh acceleration and brake gas car
        System.out.println("==========//testing acceleration and brake gas car========");
        gasCar.start();
        gasCar.accelerate();
        gasCar.accelerate();
        gasCar.getEngine().getSpeed();
        gasCar.brakeCar();
        gasCar.getEngine().getSpeed();

        //testing acceleration and break gas car
        System.out.println("==========testing acceleration and break gas car========");

        electricCar.start();
        electricCar.accelerate();
        electricCar.accelerate();
        electricCar.getEngine().getSpeed();
        electricCar.brakeCar();
        electricCar.getEngine().getSpeed();


        //testing replacing the engine with the car factory
        System.out.println("==========testing replacing the engine with the car factory========");
        carFacorty.ReplaceEngine(electricCar, EngineType.GAS);
        electricCar.getEngine();
        System.out.println(electricCar.getEngine().getClass());


        //Hybrid engine switching after 50 km/h
        System.out.println("==========Hybrid engine switching after 50 km/h========");
        System.out.println(
                ((HybridEngine) hybridCar.getEngine()).getWorkingEngine().getClass()
        );
        hybridCar.accelerate();
        hybridCar.accelerate();
        hybridCar.accelerate();
        System.out.println(
                ((HybridEngine) hybridCar.getEngine()).getWorkingEngine().getClass()
        );


    }
}
