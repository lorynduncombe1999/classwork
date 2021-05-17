package com.company.inheritence;

public class Toyota extends headDealership{
 String company = "Toyota";

 public Toyota(boolean Suv, String power, double price, String model, String color) {
  super(Suv, power, price, model, color);
 }

}

//child classes
class camry extends Toyota{
 private boolean Suv ;
 private String power;
 private double price ;
 private String model ;
 private String color;

 public camry(boolean Suv, String power, double price, String model, String color) {
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
  return "camry{" +
          "company='" + company + '\'' +
          ", Suv=" + Suv +
          ", power='" + power + '\'' +
          ", price=" + price +
          ", model='" + model + '\'' +
          ", color='" + color + '\'' +
          '}';
 }
}

 class ravh extends  Toyota{
  private boolean Suv ;
  private String power;
  private double price ;
  private String model ;
  private String color;

  public ravh(boolean Suv, String power, double price, String model, String color) {
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
   return "ravh{" +
           "company='" + company + '\'' +
           ", Suv=" + Suv +
           ", power='" + power + '\'' +
           ", price=" + price +
           ", model='" + model + '\'' +
           ", color='" + color + '\'' +
           '}';
  }
 }


