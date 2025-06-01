abstract class animal2 {
    void eat() {
        System.out.println("eat is necessary for everyone");
    }
    abstract void walk();
}

class Horse extends animal2 {
    Horse()
    {
        System.out.println("Horse constructor is called");
    }
    void walk() {
        System.out.println("walks on 4 lags ");
    }
}

class Chicken extends animal2 {
    Chicken()
    {
        System.out.println("Chiken constructor is called");
    }
    void walk() {
        System.out.println("walks on 2 lags ");
    }
}

public class abstraction1 {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.walk();
        h1.eat();
        Chicken c1 = new Chicken();
        c1.walk();
        c1.eat();
    }
}