package ValidationFactory;

public interface Validator<T> {
    public  boolean validate(T input);
}
