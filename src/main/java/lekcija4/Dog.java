package lekcija4;

public class Dog {
    private String name;
    private int age;
    private double weight;
    private String bread;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public Dog(String name, int age, double weight, String bread){
this.name = name;
this.age = age;
this.weight = weight;
this.bread = bread;
    }

    public void makeSound(){
        System.out.println("VAU VAU");
    }

    public void prinDog(){
        System.out.println("Suņa vārds ir "+name);
        System.out.println("Suņa vecums ir "+age);
        System.out.println("Suņa svars ir "+weight);
        System.out.println("Suņa šķirne ir "+bread);
    }
    public Dog(){

    }

}
