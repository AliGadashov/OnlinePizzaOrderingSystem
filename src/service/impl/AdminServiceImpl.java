package service.impl;

import enums.ExceptionsEnum;
import exceptions.GeneralExceptions;
import global.GlobalData;
import service.AdminHelper;
import service.AdminService;
import util.InputUtil;

import static util.MenuUtil.adminMenu;

public class AdminServiceImpl implements AdminService {
    @Override
    public void adminLogin(){

        String loginName = InputUtil.getInstance().inputTypeString("\nEnter the name: ");
        String loginPassword = InputUtil.getInstance().inputTypeString("Enter the password: ");

        if(loginName.equals(GlobalData.adminName) && loginPassword.equals(GlobalData.adminPassword)){

            while (true){
                try {

                    System.out.println("\n----------| Admin Service |----------\n");

                    AdminHelper adminHelper = new AdminHelperImpl();

                    byte option = adminMenu();

                    switch (option){
                        case 0:
                            System.out.println("\nSee you soon.....");
                            System.exit(0);
                            break;
                        case 1:
                            adminHelper.back();
                            break;
                        case 2:
                            adminHelper.addCourier();
                            break;
                        case 3:
                            adminHelper.trackOrder();
                            break;
                        case 4:
                            adminHelper.viewCouriers();
                            break;
                        case 5:
                            adminHelper.viewCustomers();
                            break;
                        default:
                            throw new GeneralExceptions(ExceptionsEnum.INVALID_OPTION);
                    }

                }catch (GeneralExceptions exception){
                    System.out.println(exception.getMessage());
                }
            }

        }else {
            throw new GeneralExceptions(ExceptionsEnum.INVALID_OPTION);
        }
    }
}
