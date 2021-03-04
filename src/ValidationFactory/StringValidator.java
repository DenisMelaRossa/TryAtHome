package ValidationFactory;

public class StringValidator<T> implements Validator<T> {
    @Override
    public boolean validate (T input){

        boolean result=false;
        if(input instanceof String) {
            String toString=(String) input;
            result=toString.matches("[A-ZА-Я].*");
        }

        return result;

    }
}
