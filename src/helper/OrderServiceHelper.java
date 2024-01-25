package helper;

import global.GlobalData;
import model.Courier;
import model.Customer;
import model.Order;

import java.time.LocalDateTime;

public class OrderServiceHelper {

    public static Order fillOrder(String Name, String Size, String Sous,double totalPrize,Customer customer, Courier courier) {
        System.out.println("----------------");
        long orderId = GlobalData.orders.size() + 1;
        LocalDateTime startTime = LocalDateTime.now();
        LocalDateTime deliveryTime = LocalDateTime.now();
        boolean deliveryStatus = true;
        System.out.println("----------------");

        return new Order(orderId, Name, Size, Sous, totalPrize,startTime,deliveryTime,customer,courier,deliveryStatus);
    }

}
