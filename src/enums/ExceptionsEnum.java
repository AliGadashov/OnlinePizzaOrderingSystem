package enums;

import java.time.LocalDateTime;

public enum ExceptionsEnum {
    CUSTOMER_NOT_FOUND("\n---------------| Customer is not found! |---------------"),
    COURIER_NOT_FOUND("\n---------------| Courier is not found! |---------------"),
    INVALID_OPTION("\n---------------| Invalid option!!! |---------------"),
    ORDER_NOT_FOUND("\n---------------| Order is not found! |---------------");
    private final String message;
    private final LocalDateTime timeStamp = LocalDateTime.now().withNano(0);

    ExceptionsEnum(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }


    @Override
    public String toString() {
        return  getMessage() + "\n" +
                "\nTimeStamp = " + getTimeStamp() + "\n" +
                "------------------------------"
                ;
    }
}
