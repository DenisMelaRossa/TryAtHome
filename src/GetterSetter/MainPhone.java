package GetterSetter;

public class MainPhone {
    public static void main(String[] args) {

        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();

        Phone phone4=new Phone("Sony","4", 340);

        phone1.setModel("Nokia");
        phone1.setNumber("1");
        phone1.setWeight(300);

        phone2.setModel("Apple");
        phone1.setNumber("2");
        phone1.setWeight(400);

        phone3.setModel("Xiomi");
        phone3.setNumber("3");
        phone3.setWeight(200);

        System.out.println(phone1.getModel());
        System.out.println(phone1.getNumber());
        System.out.println(phone1.getWeight());
    }
}