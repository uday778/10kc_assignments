package com.vehicles.parts;

public class Engine {
	private String engineType;
    private  int horsepower;

    public String getEngineType(){
        return engineType;
    }
     public int getHorsepower(){
        return horsepower;
    }
     
    public void setEngineType(String engineType){
        this.engineType=engineType;
    }
    public void setHorsepower(int horsepower){
        this.horsepower=horsepower;
    }
    

    public void showEngineDetails(){
        System.out.println("engineType: "+engineType);
        System.out.println("horsepower :"+horsepower);
    }
}
