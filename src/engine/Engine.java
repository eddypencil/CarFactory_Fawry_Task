package engine;

public abstract class Engine {
    int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void increaseSpeed() {
        speed = speed + 1;
    }

    public void decreaseSpeed() {
        speed = speed - 1;
    }
}
