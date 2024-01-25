package helper;

import global.GlobalData;
import model.Courier;
import util.InputUtil;

public class CourierServiceHelper {

    public static Courier fillCourier(int i) {
        System.out.println("----------------");
        System.out.println(i + 1 + ". Courier");
        String name = InputUtil.getInstance().inputTypeString("Enter the Name: ");
        String surName = InputUtil.getInstance().inputTypeString("Enter the Surname: ");
        String phoneNumber = InputUtil.getInstance().inputTypeString("Enter the PhoneNumber: ");
        long courierId = GlobalData.couriers.size() + 1;
        String vehicleType = InputUtil.getInstance().inputTypeString("Enter the VehicleType: ");
        String vehiclePlate = InputUtil.getInstance().inputTypeString("Enter the VehiclePlate: ");
        long customerId = 0;
        long orderId = 0;
        boolean availabilityStatus = true;
        System.out.println("----------------");

        return new Courier(name, surName, phoneNumber, courierId, vehicleType,vehiclePlate, customerId, orderId, availabilityStatus);
    }


}
