package com.upgrad.fop;

public class StaticFinal {
    //
    public static void main(){
        System.out.println("Chines main function");
    }
    static void main(int a){
        System.out.println(a);
    }
    public static void main(String[] args) {
        Circle c2=new Circle();
        Circle c1=new Circle();
        System.out.println(c1.pi);
        System.out.println(c1.test);
        System.out.println(c1.area());

        System.out.println(c2.pi);
        System.out.println(c2.radius);
        System.out.println(Circle.pi);
        System.out.println(Circle.pi);
        Circle.returnDouble();
        c2.returnDouble();
        main();
        main(10);
        University u1=new University();
        System.out.println(u1.getDeanName());
        u1.setMathsTeacher("Mansi");
        System.out.println(u1.getMathsTeacher());
    }

}
class University{
    private String deanName="Pranjal";
    private String collageName="VIT";
    public String test;

    public String getDeanName() {
        return deanName;
    }
    public String getCollageName() {
        return collageName;
    }
    public String getMathsTeacher() {
        return mathsTeacher;
    }

    public void setMathsTeacher(String mathsTeacher) {
        this.mathsTeacher = mathsTeacher;
    }

    private String mathsTeacher;
}
class Circle{
    protected int test=10;
     static double pi=9;
    final double radius=12.0;
    String name="upgrad";
    void printMsg(){
        System.out.println("Circle class has been used to create an Object");
    }
    double area(){
        return pi*radius*radius;
    }
    private static void sayHi(){
        System.out.println("Hiiiiiiiiii");
    }
    static double returnDouble(){
        int a=10;
        System.out.println(a);
        sayHi();
        //static method can only access static instance variable and also
        // cannot use non-static methods
        System.out.println("I am static method of Cicle class");
        System.out.println(pi);
//        System.out.println(this.name); //non-static variable this cannot be referenced from a static context
        return 1.0;
    }
}
