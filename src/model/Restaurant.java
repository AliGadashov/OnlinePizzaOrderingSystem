package model;

public class Restaurant {
    private String name;
    private String location;
    private double totalAmount;

    public Restaurant(String name, String location, double totalAmount) {
        this.name = name;
        this.location = location;
        this.totalAmount = totalAmount;
    }

    public Restaurant() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return  "\n----------------------" +
                "\nName: " + name +
                "\nLocation: " + location +
                "\nTotalAmount: " + totalAmount +
                "\n----------------------";
    }
}
