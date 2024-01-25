package exceptions;

import enums.ExceptionsEnum;

public class GeneralExceptions extends RuntimeException{
    public GeneralExceptions(ExceptionsEnum exceptions){
        super(exceptions.toString());
    }

}
