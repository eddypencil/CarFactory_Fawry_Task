package engine;

public
    class HybridEngine extends Engine {
        GasEngine gasEngine;
        ElectricEngine electricEngine;
        Engine WorkingEngine;

    public HybridEngine(GasEngine gasEngine, ElectricEngine electricEngine) {
            this.gasEngine = gasEngine;
            this.electricEngine = electricEngine;
            this.WorkingEngine = electricEngine;
        }

        private void setWorkingEngine(Engine engine) {
            engine.setSpeed(this.speed);
            this.WorkingEngine = engine;
        }

        public Engine getWorkingEngine() {
            return this.WorkingEngine;
        }


        @Override
        public void decreaseSpeed() {

            if (speed < 50) {
                setWorkingEngine(electricEngine);
            }
            WorkingEngine.decreaseSpeed();
            this.speed = WorkingEngine.getSpeed();


        }

        @Override
        public void increaseSpeed() {
            if (speed > 50) {
                setWorkingEngine(gasEngine);
            }
            WorkingEngine.increaseSpeed();

            this.speed = WorkingEngine.getSpeed();
        }
    }


