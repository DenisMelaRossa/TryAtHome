package GetterSetter;

public class MainCat {
    public static void main(String[] args) {
        Cat barsik = new Cat("Barsik", 2, 3);
        String barsikName = barsik.getName();
        int barsikAge = barsik.getAge();
        int barsikWeigth=barsik.getWeight();

        System.out.println(barsikName+" "+barsikAge+" "+barsikWeigth);

        barsik.setName("Kus");
        System.out.println(barsik.getName()+" "+barsikAge+" "+barsikWeigth);

        System.out.println(barsik);

        barsik.Say();
    }
}
