package helper;

import model.Courier;
import model.Customer;
import model.Order;

public class Receipt {

    public static void cashReceipt(Order  order, Customer customer, Courier courier,double sousPrize, double totalPrize, String pizzaName, String pizzaSize, String sousName){
        System.out.println(
                "\n---------------| Cash Receipt |---------------\n" +
                "\nStart Date: " + order.getStartTime() +
                "\nEnd Date: " + (order.getStartTime().getHour() + 1) +
                "\nUserName: " + customer.getName() +
                "\n" + pizzaName + "     " + pizzaSize + "     " + (totalPrize - sousPrize) +
                "\n" + sousName + "     " + sousPrize +
                "\nCourier Name: " + courier.getName() +
                "\nCourier Phone: " + courier.getPhoneNumber() +
                "\nCourier Vehicle type: " + courier.getVehicleType() +
                "\nCourier Vehicle plate: " + courier.getVehiclePlate() +
                "\n\nCash: " + totalPrize +
                "\n\n---------------------------------------------\n"

        );
    }

}
