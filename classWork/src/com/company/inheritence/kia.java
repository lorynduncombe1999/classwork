package com.company.inheritence;

public class kia extends headDealership {
    private String company  = "kia";
    public kia(boolean Suv, String power, double price, String model, String color) {
        super(Suv, power, price, model, color);
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

}

//Children class

class sonet extends kia {
    private boolean Suv;
    private String power;
    private double price;
    private String model;
    private String color;

    public sonet(boolean Suv, String power, double price, String model, String color) {
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
        return "sonet{" +
                "Suv=" + Suv +
                ", power='" + power + '\'' +
                ", price=" + price +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

}
    class soltos extends kia {

        private boolean Suv;
        private String power;
        private double price;
        private String model;
        private String color;

        public soltos(boolean Suv, String power, double price, String model, String color) {
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
        return "sonet{" +
                "Suv=" + Suv +
                ", power='" + power + '\'' +
                ", price=" + price +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}