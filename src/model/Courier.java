package model;

public class Courier extends Person {
    private long courierId;
    private String vehicleType;
    private String vehiclePlate;
    private long customerId;
    private long orderId;
    private boolean availabilityStatus;

    public Courier(String name, String surname, String phoneNumber, long courierId, String vehicleType,  String vehiclePlate,long customerId, long orderId, boolean availabilityStatus) {
        super(name, surname, phoneNumber);
        this.courierId = courierId;
        this.vehicleType = vehicleType;
        this.vehiclePlate = vehiclePlate;
        setCustomerId(customerId);
        setOrderId(orderId);
        this.availabilityStatus = availabilityStatus;
    }

    public Courier(String name, String surname, String phoneNumber) {
        super(name, surname, phoneNumber);
    }

    public Courier() {
    }

    public long getCourierId() {
        return courierId;
    }

    public void setCourierId(long courierId) {
        this.courierId = courierId;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehiclePlate() {
        return vehiclePlate;
    }

    public void setVehiclePlate(String vehiclePlate) {
        this.vehiclePlate = vehiclePlate;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public boolean getAvailabilityStatus() {
        return availabilityStatus;
    }

    public void setAvailabilityStatus(boolean availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

    @Override
    public String toString() {
        return  "\n----------------------" +
                "\nCourierId: " + getCourierId() +
                "\nName: " + getName() +
                "\nSurname: " + getSurname() +
                "\nPhoneNumber: " + getPhoneNumber() +
                "\nVehicleType: " + getVehicleType() +
                "\nVehiclePlate: " + getVehiclePlate() +
                "\nCustomerId: " + getCustomerId() +
                "\nOrderId: " + getOrderId() +
                "\nAvailabilityStatus: " + getAvailabilityStatus() +
                "\n----------------------"
                ;
    }
}
