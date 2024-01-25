package service;

import model.Courier;
import model.Customer;
import model.Order;

public interface PaymentService {
    void makeThePayment(Order  order, Customer customer, Courier courier,double sousPrize, double totalPrize, String pizzaName, String pizzaSize, String sousName);
    void cancelOrder(Order order, Customer customer, double totalPrize);

    void checkTime();
}
