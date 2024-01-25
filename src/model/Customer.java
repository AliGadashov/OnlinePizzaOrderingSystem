package model;

import java.time.LocalDateTime;

public class Customer extends Person {
    private long customerId;
    private String email;
    private String password;
    private long orderId;
    private double moneyAccount;
    private LocalDateTime registrationDate;
    private boolean status;

    public Customer(String name, String surname, String phoneNumber, long customerId, String email, String password, long orderId, double moneyAccount, LocalDateTime registrationDate, boolean status) {
        super(name, surname, phoneNumber);
        this.customerId = customerId;
        this.email = email;
        this.password = password;
        setOrderId(orderId);
        this.moneyAccount = moneyAccount;
        this.registrationDate = registrationDate;
        this.status = status;
    }

    public Customer(String name, String surname, String phoneNumber) {
        super(name, surname, phoneNumber);
    }

    public Customer() {
    }

    public long getCustomerId() {
        return customerId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public double getMoneyAccount() {
        return moneyAccount;
    }

    public void setMoneyAccount(double moneyAccount) {
        this.moneyAccount = moneyAccount;
    }

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDateTime registrationDate) {
        this.registrationDate = registrationDate;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return  "\n----------------------" +
                "\nCustomerId: " + getCustomerId() +
                "\nName: " + getName() +
                "\nSurname: " + getSurname() +
                "\nPhoneNumber: " + getPhoneNumber() +
                "\nEmail: " + getEmail() +
                "\nPassword: " + getPassword() +
                "\nOrderId: " + getOrderId() +
                "\nMoneyAccount: " + getMoneyAccount() +
                "\nRegistrationDate: " + getRegistrationDate() +
                "\nStatus: " + getStatus() +
                "\n----------------------";
    }
}
