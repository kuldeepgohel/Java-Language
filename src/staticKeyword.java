public class staticKeyword {
    public static void main(String[] args) {
//        student1 s1 = new student1();
//        s1.SchoolName="pvm";
//
//        student1 s2 =new student1();
//        System.out.println(s2.SchoolName);
//
//        student1 s3 = new student1();
//        System.out.println(s3.SchoolName);
//        s3.SchoolName="gurukul";
//        System.out.println(s1.SchoolName);

        Horse1 h1 = new Horse1();
        System.out.println(h1.name);

    }
}

class student1 {
    String name;
    int rollno;
    static String SchoolName;

    void setName(String name) {
        this.name = name;

    }
    String getName() {
        return this.name;
    }
}

class A1{
    String name;
    A1()
    {
        System.out.println("animal constructor is called!!");
    }
}
class Horse1 extends A1
{
    Horse1()
    {
        //super keyword..
        super.name="horse";
        System.out.println("Horse constructor is called!!");
    }
}