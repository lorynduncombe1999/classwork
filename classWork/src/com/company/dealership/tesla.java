package com.company.dealership;

public class tesla extends dealership {

    //Tesla  Constructor
    public tesla(String carColor, String carModel, String engineType){
        //super keyword allows for multiple constructors  with different  keywords
        super(carColor,carModel,engineType);
        System.out.println("My car color is " + carColor + " , my Car Model is" + carModel + " , my Engine Type is " + engineType + "." );
    }

}
