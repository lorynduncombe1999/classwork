package com.company.dealership;

public class dealership {
    //instance
    private String carModel;
    private String Company;
    private String engineType;
    private String power;
    private String carColor;

    //getters
    public String getCarModel(){
        return this.carModel;
    }
    public String getEngineType(){
        return this.engineType;
    }

    public String getCarColor(){
        return this.carColor;
    }

    public  String getPower(){
        return this.power;
    }

    public String getCompany(){
        return this.Company;
    }
    //Setters
    public void setCarModel(){
        this.carModel = carModel;
    }

    public void setEngineType(){
        this.engineType = engineType;
    }

    public void setPower(){
        this.power = power;
    }

    public void setCompany(){
        this.Company = getCompany();
    }
    //Constructor for Toyota and Honda
   public dealership(String carColor, String carModel, String power) {
       this.carColor = "No Car color";
       this.carModel = "No Car  Model";
       this.power =  "0";
       this.Company = "No Company";

       System.out.println("My car color is "+ carColor+ " , my Car Model is" + carModel + " , my Engine Type is " + power + "." );
   }

    public static void main(String[] args) {
        dealership tesla = new dealership("Red", "S", "Single");
        dealership toyota = new dealership("White", "Camry", "2.0");
        dealership Honda = new dealership("Black", "?", "2.0");

    }
}
