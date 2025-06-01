public class polymorphism {
    public static void main(String[] args) {
//        calculator c1 = new calculator();
//        System.out.println(c1.sum(2, 3));
//        System.out.println(c1.sum((float) 2.3, (float) 3.4));
//        System.out.println(c1.sum(2, 3, 4));

        deer d1 = new deer();
        d1.eat();
    }
}

class calculator {
    //method overloading /compile time polymorphism
    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    float sum(float a, float b) {
        return a + b;
    }
}

class animal1 {

    //method overriding /run time polymorphism
    void eat()
    {
        System.out.println("eat anything !");
    }
}
class deer extends animal{
     void eat()
     {
         System.out.println("eat grass");
     }
}