package service.impl;

import enums.ExceptionsEnum;
import exceptions.GeneralExceptions;
import global.GlobalData;
import helper.CustomerServiceHelper;
import model.Customer;
import service.*;
import util.InputUtil;


import static util.MenuUtil.customerLoginMenu;

public class CustomerHelperImpl implements CustomerHelper {
    @Override
    public void customLogin() {

        String loginName = InputUtil.getInstance().inputTypeString("\nEnter the name: ");
        String loginPassword = InputUtil.getInstance().inputTypeString("Enter the password: ");


        for (Customer customer : GlobalData.customers) {

            if (customer.getName().equals(loginName) && customer.getPassword().equals(loginPassword)){

                System.out.println("Welcome " + customer.getName());

                while (true) {
                    try {

                        System.out.println("\n----------| Customer System |----------\n");

                        CustomerOrders customerOrders = new CustomerOrdersImpl();

                        byte option = customerLoginMenu();

                        switch (option) {
                            case 0:
                                System.out.println("\nSee you soon.....");
                                System.exit(0);
                                break;
                            case 1:
                                customerOrders.back();
                                break;
                            case 2:
                                customerOrders.placeOrder(customer);
                                break;
                            case 3:
                                customerOrders.trackOrders();
                                break;
                            case 4:
                                customerOrders.cancelOrder();
                                break;
                            default:
                                throw new GeneralExceptions(ExceptionsEnum.INVALID_OPTION);
                        }

                    } catch (GeneralExceptions exception) {
                        System.out.println(exception.getMessage());
                    }
                }
            }else {
                throw new GeneralExceptions(ExceptionsEnum.CUSTOMER_NOT_FOUND);
            }
        }

    }

    @Override
    public void customerSingUp() {

        GlobalData.customers.add(CustomerServiceHelper.fillCustomer());
        System.out.println("\nCustomer added successfully!");
        CustomerService customerService = new CustomerServiceImpl();
        customerService.customerLogin();

    }

    @Override
    public void back() {

        ManagementService managementService = new ManagementServiceImpl();
        managementService.management();

    }
}
