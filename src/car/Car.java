package car;


import engine.Engine;

public class Car {

    Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        System.out.println("Car started");
        engine.setSpeed(0);
    }

    void stop() {
        while (engine.getSpeed() > 0) {
            engine.decreaseSpeed();
        }
        System.out.println("Car stopped");
    }

    public void accelerate() {
        if (engine.getSpeed() < 200) {
            for (int i = 0; i < 20; i++) {
                engine.increaseSpeed();
            }

            System.out.println("Speed:" + engine.getSpeed());
        } else {
            System.out.println("Max Speed");
        }
    }


    public void brakeCar() {
        if (engine.getSpeed() > 0) {
            for (int i = 0; i < 20; i++) {
                if (engine.getSpeed() == 0) break;
                engine.decreaseSpeed();
            }

            System.out.println("Speed:" + engine.getSpeed());
        } else {
            System.out.println("the car is stopped");
        }
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Engine getEngine() {
        return this.engine;
    }

}
