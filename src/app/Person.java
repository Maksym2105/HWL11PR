package app;

public class Person {

    public String name;
    public int age;
    public String profession;

    public Person(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }


    public void changeProfession(String newProfession){
        this.profession = newProfession;

    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", profession='" + profession + '\'' +
                '}';
    }
}
