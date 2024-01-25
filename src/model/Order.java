package model;

import java.time.LocalDateTime;

public class Order {
    private long orderId;
    private String pizzaName;
    private String pizzaSize;
    private String sous;
    private double prize;
    private LocalDateTime startTime;
    private LocalDateTime deliveryTime;
    private Customer customer;
    private Courier courier;
    private boolean deliveryStatus;

    public Order(long orderId, String pizzaName, String pizzaSize, String sous, double prize, LocalDateTime startTime, LocalDateTime deliveryTime, Customer customer, Courier courier, boolean deliveryStatus) {
        this.orderId = orderId;
        this.pizzaName = pizzaName;
        this.pizzaSize = pizzaSize;
        this.sous = sous;
        this.prize = prize;
        this.startTime = startTime;
        this.deliveryTime = deliveryTime;
        setCustomer(customer);
        setCourier(courier);
        this.deliveryStatus = deliveryStatus;
    }

    public Order() {
    }

    public long getOrderId() {
        return orderId;
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public String getPizzaSize() {
        return pizzaSize;
    }

    public void setPizzaSize(String pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public String getSous() {
        return sous;
    }

    public void setSous(String sous) {
        this.sous = sous;
    }

    public double getPrize() {
        return prize;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(LocalDateTime deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Courier getCourier() {
        return courier;
    }

    public void setCourier(Courier courier) {
        this.courier = courier;
    }

    public boolean isDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(boolean deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    @Override
    public String toString() {
        return  "\n----------------------" +
                "\nOrderId: " + getOrderId() +
                "\nPizzaName: " + getPizzaName() +
                "\nPizzaSize: " + getPizzaSize() +
                "\nSous: " + getSous() +
                "\nPrize: " + getPrize() +
                "\nStartTime: " + getStartTime() +
                "\nDeliveryTime: " + getDeliveryTime() +
                "\nCustomer: " + getCustomer() +
                "\nCourier: " + getCourier() +
                "\nDeliveryStatus: " + getDeliveryTime() +
                "\n----------------------";
    }
}
