package ValidationFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ValidationSystem <T> {

    static Map<Class, Validator> validationMap= new HashMap<>();

     {
        validationMap.put("a".getClass(), new StringValidator());
        validationMap.put(Integer.valueOf(1).getClass(), new IntegerValidator());
    }

    public boolean validatorFactory(T input) throws ValidationFactoryException{
         Validator targetValidator=validationMap.get(input.getClass());
         if (targetValidator==null || targetValidator.validate(input)==false){
             throw new ValidationFactoryException("Wrong type");
         }
         return targetValidator.validate(input);
    }
}
