

class BankAccount {
    public String username;
    private String password; // this variable is accessible only inside the class
}

class pen {
    private String color;
    private int tip;

    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

class student {
    String name;
    int rollno;
    String password;

    student(student s1) //copy constructor
    {
      this.name=s1.name;
      this.rollno= s1.rollno;
    }

    student()
    {
        System.out.println("hello this is the constructor"); //non-parametrized constructor
    }
    student(String name)
    {
        System.out.println("your name is "+name); //parametrized constructor
    }
    student(int RN)
    {
        System.out.println("your RollNo. is "+RN);//parametrized constructor
    }
}

public class OOPs {

    public static void main(String[] args) {
       pen p1 = new pen(); //create the pen object
       // object story data in heap memory
       p1.setColor("blue");
       System.out.println(p1.getColor());
       p1.setTip(5);
       System.out.println(p1.getTip());
       p1.setColor("yellow");
       System.out.println(p1.getColor());

//        object creation of constructor
//        student s1 = new student();
//        student s2 = new student("kuldeep");
//        student s3 = new student(21);

        student s1 = new student();
        s1.name="nikunj";
        s1.rollno=21;
        s1.password="abcd";

        student s2 = new student(s1);
         s2.password="xyz";

    }
}

