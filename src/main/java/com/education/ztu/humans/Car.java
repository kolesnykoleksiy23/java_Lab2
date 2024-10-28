package com.education.ztu.humans;

public class Car {
    private final String brand;
    private final Engine engine;

    public Car(String brand) {
        this.brand = brand;
        this.engine = new Engine();
    }

    public void startCar() {
        if (engine.isEngineWorks()) {
            System.out.println("Автомобіль уже працює, двигун запущено.");
        } else {
            engine.startEngine();
            System.out.println("Автомобіль запущено, готовий до руху!");
        }
    }
    public void stopCar() {
        if (engine.isEngineWorks()) {
            engine.stopEngine();
            System.out.println("Автомобіль зупинено!");
        } else {
            System.out.println("Автомобіль уже зупинено!");
        }
    }
    public boolean engineIsRunning() {
        if (engine.isEngineWorks()) {
            System.out.println("Двигун працює");
        } else {
            System.out.println("Двигун не працює");
        }
        return engine.isEngineWorks();
    }

    public String getBrand() {
        return brand;
    }



    private class Engine {
        private boolean engineWorks;

        public Engine() {
            this.engineWorks = false;
        }

        public void startEngine() {
            engineWorks = true;
            System.out.println("Двигун заведений...");
        }

        public void stopEngine() {
            engineWorks = false;
            System.out.println("Двигун зашлушений...");
        }

        public boolean isEngineWorks() {
            return engineWorks;
        }
    }


}
