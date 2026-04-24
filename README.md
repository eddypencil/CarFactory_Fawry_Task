# CarFactory Project

A Java implementation of the Factory Pattern for creating and managing cars with different engine types.

## Project Structure
```
src/
├── Main.java              # Demo and test cases
├── car/
│   └── Car.java          # Car class with engine management
├── engine/
│   ├── Engine.java       # Base engine interface
│   ├── GasEngine.java    # Gas engine implementation
│   ├── ElectricEngine.java
│   └── HybridEngine.java # Hybrid engine (switches modes)
└── factory/
    ├── CarFactory.java   # Creates and manages cars
    ├── EngineFactory.java # Creates engine instances
    └── EngineType.java   # Engine type enum (GAS, ELECTRIC, HYBRID)
```


## Features
- Multiple engine types (Gas, Electric, Hybrid)
- Engine replacement at runtime
- Acceleration and braking simulation
- Hybrid engine mode switching based on speed
