package OOPS;

import javax.crypto.Mac;

class Engine
{
    private boolean isEngineOn;
    int noOFPistons;
    int fuelEfficieny;
    int maxRpm;
    int currentRpm;

    public Engine(boolean isEngineOn,int noOFPistons,
    int fuelEfficieny,int currentRpm,int maxRpm)
    {
        this.isEngineOn=isEngineOn;
        this.noOFPistons=noOFPistons;
        this.fuelEfficieny=fuelEfficieny;
        this.currentRpm=currentRpm;
        this.maxRpm=maxRpm;

        System.out.println("Constructor called Engine Created");
    }

    // void ignitionOn()
    // {
    //     this.isEngineOn=true;
    // }

    // boolean checkEngineStatus()
    // {
    //     return this.isEngineOn;
    // }

    void accelerate()
    {
        this.currentRpm+=200;
    }

    void setIsEngineOn(boolean isEngineOn)
    {
        this.isEngineOn=isEngineOn;
    }

    boolean getIsEngineOn()
    {
        return this.isEngineOn;
    }
    
    void setNoOFPistons(int noOFPistons)
    {
        this.noOFPistons=noOFPistons;
    }

    int getNoOFPistons()
    {
        return this.noOFPistons;
    }

    void setFuelEfficieny(int fuelEfficieny)
    {
        this.fuelEfficieny=fuelEfficieny;
    }

    int getFuelEfficiency()
    {
        return this.fuelEfficieny;
    }

    void setMaxRpm(int maxRpm)
    {
        this.maxRpm=maxRpm;
    }

    int getMaxRpm()
    {
        return this.maxRpm;
    }

    void setCurrentRpm(int currentRpm)
    {
        this.currentRpm=currentRpm;
    }

    int getCurrentRpm()
    {
        return this.currentRpm;
    }




}

