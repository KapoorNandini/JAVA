
class engineClient {
    
    public static void main(String[] args) {
        
        Engine engine=new Engine(false, 5, 10, 0, 5000);

        // System.out.println(engine.isEngineOn);
        // System.out.println(engine.fuelEfficieny);
        // System.out.println(engine.noOFPistons);
        // System.out.println(engine.currentRpm);
        // System.out.println(engine.maxRpm);


        // System.out.println(engine.isEngineOn);
        // engine.isEngineOn=true;
        // System.out.println(engine.isEngineOn);

        // System.out.println("BEFORE:"+engine.checkEngineStatus());
        // engine.ignitionOn();
        // System.out.println("AFTER:"+engine.checkEngineStatus());



        engine.setIsEngineOn(true);
        System.out.println(engine.getIsEngineOn());
        engine.setIsEngineOn(false);
        System.out.println(engine.getIsEngineOn());


        System.out.println(engine.getCurrentRpm());
        engine.accelerate();
        System.out.println(engine.getCurrentRpm());
        engine.accelerate();
        System.out.println(engine.getCurrentRpm());
    }
}

