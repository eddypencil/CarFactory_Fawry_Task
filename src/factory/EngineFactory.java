package factory;


import engine.ElectricEngine;
import engine.Engine;
import engine.GasEngine;
import engine.HybridEngine;

public class EngineFactory {
    static Engine createEngine(EngineType type) {
        switch (type) {
            case GAS:
                return new GasEngine();
            case ELECTRIC:
                return new ElectricEngine();
            case HYBRID:
                return new HybridEngine(new GasEngine(), new ElectricEngine());


            default:
                throw new Error("no type matched");


        }
    }

}