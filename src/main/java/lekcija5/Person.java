package lekcija5;

public class Person {

    private int age;

Person(int i) throws Exception {
    setAge(age);
}

    public int getAge(){
        return age;
    }
    public void setAge(int age) throws Exception {

        if (age<=0){throw new Exception("Vecums nedrīkst nevar būt mazāks par 0");
        }else {
            this.age = age;
        }

    }
}
