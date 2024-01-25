package service.impl;

import enums.ExceptionsEnum;
import exceptions.GeneralExceptions;
import global.GlobalData;
import helper.CourierServiceHelper;
import service.AdminHelper;
import service.ManagementService;
import util.InputUtil;

public class AdminHelperImpl implements AdminHelper {

    @Override
    public void back() {
        ManagementService managementService = new ManagementServiceImpl();

        managementService.management();
    }

    @Override
    public void addCourier() {
        System.out.println("\n---------------| Add New Courier |---------------\n");

        byte count = InputUtil.getInstance().inputTypeByte("\nHow many Courier will you add: ");

        for (int i = 0; i < count; i++) {
            GlobalData.couriers.add(CourierServiceHelper.fillCourier(i));
            System.out.println("\nCourier added successfully!");
        }
    }

    @Override
    public void trackOrder() {

        if (GlobalData.orders.isEmpty()){
            throw new GeneralExceptions(ExceptionsEnum.ORDER_NOT_FOUND);
        }

        GlobalData.orders.forEach(System.out::println);

    }

    @Override
    public void viewCouriers() {

        if (GlobalData.couriers.isEmpty()){
            throw new GeneralExceptions(ExceptionsEnum.COURIER_NOT_FOUND);
        }

        GlobalData.couriers.forEach(System.out::println);

    }

    @Override
    public void viewCustomers() {

        if (GlobalData.customers.isEmpty()){
            throw new GeneralExceptions(ExceptionsEnum.CUSTOMER_NOT_FOUND);
        }

        GlobalData.customers.forEach(System.out::println);

    }
}
