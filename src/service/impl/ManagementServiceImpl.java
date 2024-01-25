package service.impl;

import enums.ExceptionsEnum;
import exceptions.GeneralExceptions;
import service.AdminService;
import service.CustomerService;
import service.ManagementService;

import static util.MenuUtil.entryMenu;

public class ManagementServiceImpl implements ManagementService {
    @Override
    public void management() {

        while (true){
            try {

                System.out.println("\n----------| Online Pizza Ordering System |----------\n");

                AdminService adminService = new AdminServiceImpl();
                CustomerService customerService = new CustomerServiceImpl();

                byte option = entryMenu();

                switch (option){
                    case 0:
                        System.out.println("\nSee you soon.....");
                        System.exit(0);
                        break;
                    case 1:
                        adminService.adminLogin();
                        break;
                    case 2:
                        customerService.customerLogin();
                        break;
                    default:
                        throw new GeneralExceptions(ExceptionsEnum.INVALID_OPTION);
                }

            }catch (GeneralExceptions exception){
                System.out.println(exception.getMessage());
            }
        }
    }
}
