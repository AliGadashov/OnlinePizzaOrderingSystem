package util;

import java.util.Scanner;

public final class InputUtil {

    private static InputUtil instance;

    public static InputUtil getInstance(){
        if(instance == null){
            instance = new InputUtil();
        }
        return instance;
    }

    private InputUtil() {
    }

    public String inputTypeString(String title){
        Scanner scan = new Scanner(System.in);
        System.out.print(title);
        return scan.nextLine();
    }


    public Byte inputTypeByte(String title){
        Scanner scan = new Scanner(System.in);
        byte input;
        while (true) {
            try {
                System.out.print(title);
                input = Byte.parseByte(scan.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid byte.");
            }
        }
        return input;
    }
    public Short inputTypeShort(String title){
        Scanner scan = new Scanner(System.in);
        short input;
        while (true) {
            try {
                System.out.print(title);
                input = Short.parseShort(scan.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid Short.");
            }
        }
        return input;
    }
    public Integer inputTypeInteger(String title){
        Scanner scan = new Scanner(System.in);
        int input;
        while (true) {
            try {
                System.out.print(title);
                input = Integer.parseInt(scan.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
        return input;
    }
    public Long inputTypeLong(String title){
        Scanner scan = new Scanner(System.in);
        long input;
        while (true) {
            try {
                System.out.print(title);
                input = Long.parseLong(scan.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid long.");
            }
        }
        return input;
    }
    public Double inputTypeDouble(String title){
        Scanner scan = new Scanner(System.in);
        double input;
        while (true) {
            try {
                System.out.print(title);
                input = Double.parseDouble(scan.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid Double.");
            }
        }
        return input;
    }
}
