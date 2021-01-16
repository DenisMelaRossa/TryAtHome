package GetterSetter;

public class Cat {
    private int weight;
    private int age;
    private String name;

    public Cat(String name, int age, int weight){
        this.name=name;
        this.age=age;
        this.weight=weight;
    }

    public void Say() {
        System.out.println("hello");
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }
     public int getAge(){
        return age;
     }

     public void setAge(int age){
        this.age=age;
     }

     public int getWeight(){
        return weight;
     }

     public void setWeigth(int weight){
        this.weight=weight;
     }
}
