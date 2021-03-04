package ValidationFactory;


public class ValidatorExample<T> {

      /*  ValidationSystem targetValidator = new ValidationSystem<>();
        Validator concreteValidator = targetValidator.getValidator(1);
        boolean result = concreteValidator.validate(1);
        System.out.println(result);*/
        public static boolean validateExample (Object input) {
            ValidationSystem targetValidator = new ValidationSystem<>();
            boolean result = targetValidator.validatorFactory(input);
            return result;
        }
    }


