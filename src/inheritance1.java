//base class
class animal{
    String color;
    void breathe()
    {
        System.out.println("breathe");
    }
    void eat()
    {
        System.out.println("eats");
    }
}

class mammal extends animal{
    int legs;
}
class dog extends mammal
{
    String color;

}
//derived class
class fish extends animal
{
    int fins;
    void swims()
    {
        System.out.println("swim");
    }
}

public class inheritance1 {
    public static void main(String[] args) {
       fish f1 = new fish();
       f1.eat();
       f1.color="white";
       System.out.println(f1.color);

        dog d1 = new dog();
        d1.breathe();
    }
}