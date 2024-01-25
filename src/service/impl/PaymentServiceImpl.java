package service.impl;

import com.sun.org.apache.xpath.internal.operations.Or;
import enums.ExceptionsEnum;
import exceptions.GeneralExceptions;
import global.GlobalData;
import helper.Receipt;
import model.Courier;
import model.Customer;
import model.Order;
import service.CustomerHelper;
import service.CustomerOrders;
import service.PaymentService;
import util.InputUtil;
import util.MenuUtil;

import java.time.LocalDateTime;

public class PaymentServiceImpl implements PaymentService {
    @Override
    public void makeThePayment(Order  order, Customer customer, Courier courier, double sousPrize, double totalPrize, String pizzaName, String pizzaSize, String sousName) {

        if (customer.getMoneyAccount()>totalPrize) {
            customer.setMoneyAccount(customer.getMoneyAccount() - totalPrize);
            System.out.println("\nOrder successfully" +
                    "\nYour balance: " + customer.getMoneyAccount());

            GlobalData.orders.add(order);

            Receipt.cashReceipt(order, customer, courier, sousPrize, totalPrize, pizzaName, pizzaSize, sousName);

            CustomerHelper customerHelper = new CustomerHelperImpl();
            customerHelper.customLogin();

        }else {
            System.out.println("\nThe amount is insufficient" +
                    "Your balance: " + customer.getMoneyAccount());
        }

        CustomerHelper customerHelper = new CustomerHelperImpl();
        customerHelper.customLogin();

    }

    @Override
    public void cancelOrder(Order order, Customer customer, double amount) {



        if (order.getCourier().getAvailabilityStatus()){
            customer.setMoneyAccount(customer.getMoneyAccount() + amount);
            System.out.println("\nOrder successfully cancelled" +
                                "Your balance: " + customer.getMoneyAccount());

            GlobalData.orders.remove(order);

        }else {
            System.out.println("\nYour order can't cancelled!!!");
        }

        CustomerHelper customerHelper = new CustomerHelperImpl();
        customerHelper.customLogin();

    }

    @Override
    public void checkTime() {
        GlobalData.orders.stream()
                .filter(order -> order.getDeliveryTime().getSecond() - LocalDateTime.now().getSecond() < 0)
                .forEach(order -> order.getCourier().setAvailabilityStatus(false));
    }
}
