package service.impl;

import enums.ExceptionsEnum;
import exceptions.GeneralExceptions;
import service.CustomerHelper;
import service.CustomerService;

import static util.MenuUtil.customerMenu;

public class CustomerServiceImpl implements CustomerService {
    @Override
    public void customerLogin() {
        while (true){
            try {

                System.out.println("\n----------| Customer Login Service |----------\n");

                CustomerHelper customerHelper = new CustomerHelperImpl();

                byte option = customerMenu();

                switch (option){
                    case 0:
                        System.out.println("\nSee you soon.....");
                        System.exit(0);
                        break;
                    case 1:
                        customerHelper.customLogin();
                        break;
                    case 2:
                        customerHelper.customerSingUp();
                        break;
                    case 3:
                        customerHelper.back();
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
