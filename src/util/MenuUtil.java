package util;

import static util.InputUtil.getInstance;

public class MenuUtil {

    public static Byte entryMenu(){
        System.out.println(
                "\n[0] - > Exit" +
                "\n[1] - > Admin" +
                "\n[2] - > Customer"
        );

        return getInstance().inputTypeByte("\nChoose the option: ");
    }

    public static Byte adminMenu(){
        System.out.println(
                "[0] - > Exit \n" +
                "[1] - > Back \n" +
                "[2] - > Add Courier \n" +
                "[3] - > Track Orders \n" +
                "[4] - > View Couriers \n" +
                "[5] - > View Customers\n"
        );

        return getInstance().inputTypeByte("\nChoose the option: ");
    }

    public static Byte customerMenu(){
        System.out.println(
                "[0] - > Exit \n" +
                "[1] - > Login \n" +
                "[2] - > Sign up\n" +
                "[3] - > Back \n"
        );

        return InputUtil.getInstance().inputTypeByte("\nChoose the option: ");
    }

    public static Byte customerLoginMenu(){
        System.out.println(
                "[0] - > Exit\n" +
                "[1] - > Back\n" +
                "[2] - > Place Order\n" +
                "[3] - > Track Orders\n" +
                "[4] - > Cancel Order\n"
        );

        return getInstance().inputTypeByte("\nChoose the option: ");
    }

    public static Byte pizzaType(){
        System.out.println(

                        "[1] -> Italiano -> 11.99 azn\n" +
                        "[2] -> Americano -> 10.99 azn\n" +
                        "[3] -> Mexican -> 12.99azn\n" +
                        "[4] -> Chicken Kickers -> 9.99azn\n" +
                        "[5] -> Margherita -> 13.99 azn\n" +
                        "[6] -> Pepperoni -> 14.99azn\n"
        );

        return getInstance().inputTypeByte("\nChoose the option: ");
    }

    public static Byte pizzaSize(){
        System.out.println(
                "[1] -> Small -> (default)\n" +
                "[2] -> Medium -> (+6.99azn)\n" +
                "[3] -> Large -> (+13.99azn)\n "
        );

        return getInstance().inputTypeByte("\nChoose the option: ");
    }

    public static Byte pizzaSous(){
        System.out.println(
                "[1] -> Ketchup -> 0.7azn\n" +
                "[2] -> Barbecu -> 0.7 azn\n" +
                "[3] -> Mayonnaise -> 0.7 azn\n" +
                "[4] -> Cancel"
        );

        return getInstance().inputTypeByte("\nChoose the option: ");
    }
    public static Byte paymentMenu(){
        System.out.println(
                "[1] -> Make the payment\n" +
                "[2] -> Cancel order\n"
        );

        return getInstance().inputTypeByte("\nChoose the option: ");
    }

}
