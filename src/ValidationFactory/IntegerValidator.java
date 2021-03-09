package ValidationFactory;

public class IntegerValidator<T> implements Validator<T> {
    @Override
    public boolean validate (T input){

        boolean result=false;
        Integer toInteger = (Integer) input;
            if (toInteger >= 1 && toInteger <= 10) {
                result = true;
            }
        return result;
    }
}
