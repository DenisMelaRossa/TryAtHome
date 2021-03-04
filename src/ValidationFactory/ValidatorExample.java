package ValidationFactory;


public class ValidatorExample<T> {

        public static boolean validateExample (Object input) {
            ValidationSystem targetValidator = new ValidationSystem<>();
            boolean result = targetValidator.validatorFactory(input);
            return result;
        }
    }


