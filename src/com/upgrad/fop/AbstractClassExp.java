package com.upgrad.fop;

public class AbstractClassExp {
    public static void main(String[] args) {
//        Person p1= new Person();
        Person p2= new Professor("Mansi", 1234);//getDetails
        Person p3=new CollegeStudent("Pranjal",3);  //getDetails
        Person[] p={p2,p3};
        printDetails(p);
    }
    public static void printDetails(Person []persons){
        for(Person person:persons){
            person.getName();
            person.getDetails();//print information other than just name
        }
    }
}
