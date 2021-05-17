package com.company.inheritence;

public class honda extends headDealership {

     private String company = "Honda";


    public honda(boolean Suv, String power, double price, String model, String color) {
        super(Suv, power, price, model, color);
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }


}

//children classes

 class civic extends  honda{
    //variable about civic
    private boolean Suv ;
     private String power;
    private double price ;
     private String model ;
     private String color;

     //constructor matching super
     public civic(boolean Suv, String power, double price, String model, String color) {
         super(Suv, power, price, model, color);
     }
     //getters and setters
     public boolean isSuv() {
         return Suv;
     }

     public void setSuv(boolean suv) {
         Suv = suv;
     }

     public String getPower() {
         return power;
     }

     public void setPower(String power) {
         this.power = power;
     }

     public double getPrice() {
         return price;
     }

     public void setPrice(double price) {
         this.price = price;
     }

     public String getModel() {
         return model;
     }

     public void setModel(String model) {
         this.model = model;
     }

     public String getColor() {
         return color;
     }

     public void setColor(String color) {
         this.color = color;
     }
     // to string  method
     @Override
     public String toString() {
         return "civic{" +
                 "company='" + this.getCompany() + '\'' +
                 ", Suv=" + Suv +
                 ", power='" + power + '\'' +
                 ", price=" + price +
                 ", model='" + model + '\'' +
                 ", color='" + color + '\'' +
                 '}';
     }
 }

 class crv extends  honda{
     //method that returns information on crv

     //Private features of car
     private boolean Suv;
     private String power;
     private double price;
     private String model;

     //constructor matching super
     public crv(boolean Suv, String power, double price, String model, String color) {
         super(Suv, power, price, model, color);
     }

     private String color;

     public boolean isSuv() {
         return Suv;
     }

     public void setSuv(boolean suv) {
         Suv = suv;
     }

     public String getPower() {
         return power;
     }

     public void setPower(String power) {
         this.power = power;
     }

     public double getPrice() {
         return price;
     }

     public void setPrice(double price) {
         this.price = price;
     }

     public String getModel() {
         return model;
     }

     public void setModel(String model) {
         this.model = model;
     }

     public String getColor() {
         return color;
     }

     public void setColor(String color) {
         this.color = color;
     }


     @Override
     public String toString() {
         return "crv{" +
                 "company='" + this.getCompany() + '\'' +
                 ", Suv=" + Suv +
                 ", power='" + power + '\'' +
                 ", price=" + price +
                 ", model='" + model + '\'' +
                 ", color='" + color + '\'' +
                 '}';
     }




 }


class  hov extends  honda{
    //method that returns information on hov
    boolean Suv;
    String power;
    double price;
    String model;
    String color;

    public hov(boolean Suv, String power, double price, String model, String color) {
        super(Suv, power, price, model, color);
    }


    public boolean isSuv() {
        return Suv;
    }

    public void setSuv(boolean suv) {
        Suv = suv;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "hov{" +
                "company='" + this.getCompany() + '\'' +
                ", Suv=" + Suv +
                ", power='" + power + '\'' +
                ", price=" + price +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
