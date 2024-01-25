package service;

import model.Customer;
import model.Order;

public interface CustomerOrders {
    void back();
    void placeOrder(Customer customer);
    void trackOrders();
    void cancelOrder();
}
