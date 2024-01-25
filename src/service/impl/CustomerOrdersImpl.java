package service.impl;

import enums.ExceptionsEnum;
import enums.Pizza;
import enums.Size;
import enums.Sous;
import exceptions.GeneralExceptions;
import global.GlobalData;
import helper.OrderServiceHelper;
import model.Courier;
import model.Customer;
import model.Order;
import service.*;
import util.MenuUtil;


import static util.MenuUtil.*;

public class CustomerOrdersImpl implements CustomerOrders {

    double totalPrize;
    double sousPrize;
    String pizzaName;
    String pizzaSize;
    String sousName;

    @Override
    public void back() {

        CustomerService customerService = new CustomerServiceImpl();
        customerService.customerLogin();
    }

    @Override
    public void placeOrder(Customer customer) {

        Courier freeCourier = GlobalData.couriers.stream()
                .filter(courier -> !courier.getAvailabilityStatus())
                .findFirst()
                .orElseThrow(() -> new GeneralExceptions((ExceptionsEnum.COURIER_NOT_FOUND)));

        try {

            System.out.println("\n----------| Choose type of Pizza |----------\n");

            byte typeOption = pizzaType();


            if (typeOption <= 6 && typeOption > 0) {

                for (Pizza pizza : Pizza.values()) {
                    if (pizza.getId() == typeOption) {
                        totalPrize = pizza.getPrize();
                        pizzaName = pizza.getName();
                    }
                }

                System.out.println("\n----------| Choose size of Pizza |----------\n");

                byte sizeOption = pizzaSize();

                if (sizeOption <= 3 && sizeOption > 0) {

                    for (Size size : Size.values()) {
                        if (size.getId() == sizeOption) {
                            totalPrize += size.getPrize();
                            pizzaSize = size.getName();
                        }
                    }

                    System.out.println("\n----------| Choose sous of Pizza |----------\n");

                    byte sousOption = pizzaSous();

                    if (sousOption <= 4 && sousOption > 0) {

                        for (Sous sous : Sous.values()) {
                            if (sous.getId() == sousOption) {
                                totalPrize += sous.getPrize();
                                sousPrize = sous.getPrize();
                                sousName = sous.getName();
                            }
                        }



                        Order order = OrderServiceHelper.fillOrder(pizzaName, pizzaSize, sousName, totalPrize, customer, freeCourier);

                        while (true) {
                            try {

                                System.out.println("\n----------| Payment |----------\n");
                                System.out.println("\nOrder payment -> " + totalPrize + "$");

                                PaymentService paymentService = new PaymentServiceImpl();

                                byte paymentOption = MenuUtil.paymentMenu();

                                switch (paymentOption) {
                                    case 1:
                                        paymentService.makeThePayment(order, customer, freeCourier, sousPrize, totalPrize, pizzaName, pizzaSize, sousName);
                                        break;
                                    case 2:
                                        paymentService.cancelOrder(order, customer, totalPrize);
                                        break;
                                    default:
                                        throw new GeneralExceptions(ExceptionsEnum.INVALID_OPTION);
                                }

                            } catch (GeneralExceptions exception) {
                                System.out.println(exception.getMessage());
                            }
                        }
                    } else {
                        throw new GeneralExceptions(ExceptionsEnum.INVALID_OPTION);
                    }
                } else {
                    throw new GeneralExceptions(ExceptionsEnum.INVALID_OPTION);
                }
            } else {
                throw new GeneralExceptions(ExceptionsEnum.INVALID_OPTION);
            }
        } catch (GeneralExceptions exception) {
            System.out.println(exception.getMessage());
        }


    }


    @Override
    public void trackOrders() {



    }

    @Override
    public void cancelOrder() {


    }
}
