package com.company.dealership;

public class toyota extends dealership {

    //Toyota  Constructor
    public toyota(String carColor, String carModel, String power){
        //super keyword allows for multiple constructors  with different  keywords
        super(carColor,carModel,power);
        System.out.println("My car color is " + carColor + " , my Car Model is" + carModel + " , my Engine Type is " + power + "." );
    }
}
