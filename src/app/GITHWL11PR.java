package app;

public class GITHWL11PR {
    public static void main(String[] args) {

        Person carl = new Person("Carl" , 24 , "Java Developer");
        Person maeve = new Person("Maeve" , 19 , "Hr Manager");
        Person david = new Person("David" , 32 , "Data Analyst");

        System.out.println(
                "1. Ім'я: " + carl.name +  ", Вік: " + carl.age + ", Професія: " + carl.profession);
        System.out.println(
                "   Ім'я: " + maeve.name + ", Вік: " + maeve.age +  ", Професія: " + maeve.profession);
        System.out.println(
                "   Ім'я: " + david.name +  ", Вік: " + david.age + ", Професія: " + david.profession);
        System.out.println();
        System.out.println();

        Person james = new Person("James" , 21 , "Swift Developer");
        System.out.println(
                "2. Ім'я: " + james.name +  ", Вік: " + james.age + ", Професія: " + james.profession);
        System.out.println("   (Після оновлення професії)");
        james.changeProfession("Kotlin Developer");
        System.out.println(
                "   Ім'я: " + james.name + ", Вік: " + james.age + ", Професія: " + james.profession);

    }
}
