package helper;

import global.GlobalData;
import model.Customer;
import util.InputUtil;

import java.time.LocalDateTime;

public class CustomerServiceHelper {

    public static Customer fillCustomer() {
        System.out.println("----------------");
        System.out.println("Customer: ");
        long customerId = GlobalData.customers.size() + 1;
        String name = InputUtil.getInstance().inputTypeString("Enter the Name: ");
        String surName = InputUtil.getInstance().inputTypeString("Enter the Surname: ");
        String phoneNumber = InputUtil.getInstance().inputTypeString("Enter the PhoneNumber: ");
        String email = InputUtil.getInstance().inputTypeString("Enter the Email: ");
        String password = InputUtil.getInstance().inputTypeString("Enter the Password: ");
        long orderId = 0;
        double moneyAccount = 500.00;
        LocalDateTime registrationDate = LocalDateTime.now();
        boolean status = true;
        System.out.println("----------------");

        return new Customer(name, surName, phoneNumber,customerId,email, password, orderId,moneyAccount,registrationDate,status);
    }


}
