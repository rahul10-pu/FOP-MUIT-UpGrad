package com.upgrad.fop;

public class InheritanceTypes {
    public static void main(String[] args) {
        Student cse = new Student("Ashish",23145,"MUIT");
//        cse.setMarks(10,20,30);
//        cse.setMarks(10.5,20,30);
//        cse.setMarks(10.50,20.50,40.20);
//        cse.setMarks(10,20,40.66f);



//        cse.getStudentDetails();
//        cse.miniLaptop.name="lenovo";
//        cse.miniLaptop.ram=16;
//        cse.miniLaptop.getLaptopConfig();
//
        Student re=new ResarchStudent("Ashish",23145,"MUIT","Machine Learning");
//        re.getResearchPaperName(); //this method is not there in Student class
        re.getStudentDetails();//which method(i.e, can be parent class or child class) to invoke is decided at run-time
//        MtechStudent me=new MtechStudent("Krishna",1000,"MUIT",10);
//        me.getStudentDetails();
//        PHDStudent phd= new PHDStudent("Ashish",
//                23145,"MUIT",
//                "Machine Learning",
//                "Neural Network");
//        phd.getStudentDetails();
    }
}

class Student{
    String name;
    int rollNo;
    String universityName;
    LapTop miniLaptop=new LapTop();
    String idStr;
    int id;
    double finalMarks;
    void setMarks(int a, int b, int c){
        this.finalMarks=a+b+c;
        System.out.println("Here all are integers");
        System.out.println(finalMarks);
    }
    void setMarks(double a, int b, int c){
        this.finalMarks=a+b+c;
        System.out.println("Here b and c are integers, a is double");
        System.out.println(finalMarks);
    }
    void setMarks(double a, double b, double c){
        this.finalMarks=a+b+c;
        System.out.println("Here all are double");
        System.out.println(finalMarks);
    }  void setMarks(int a, int b, float c){
        this.finalMarks=a+b+c;
        System.out.println("Here a and b are integers, c is float");
        System.out.println(finalMarks);
    }

//    Mobile mi=new Mobile();
    public Student(String name, int rollNo, String universityName){
        this.universityName=universityName;
        this.rollNo=rollNo;
        this.name=name;
    }
     void getStudentDetails(){
        System.out.println("Student class function invoked");
        System.out.println("Name of the Student: "+name+"\nRoll No. of a Student: "+rollNo+"\nUniversity Name: "+universityName);
    }

}
class MtechStudent extends Student {
    int noOfSubject;
    public MtechStudent(String name, int rollNo, String universityName, int noOfSubject){
        super(name,rollNo,universityName);
        this.noOfSubject=noOfSubject;
    }
    @Override
    void getStudentDetails(){
        super.getStudentDetails();
        System.out.println("M.tech students have to study "+noOfSubject+" papers");

    }

}
class ResarchStudent extends Student {
    String researchPapperName;
    public ResarchStudent(String name, int rollNo, String universityName, String researchPapperName){
        super(name,rollNo,universityName);
        this.researchPapperName=researchPapperName;
    }
    void getResearchPaperName(){
        System.out.println(name+" is doing research in "+researchPapperName);
    }
    @Override
    void getStudentDetails(){
//        super.getStudentDetails();
        System.out.println("Research student class function invoked");
        System.out.println(name+" is doing research in "+researchPapperName);
    }
}

class PHDStudent extends ResarchStudent{
    String thesis;
    void publishThesis(int year){
        System.out.println(thesis+" is getting published in "+year);
    }
    public PHDStudent(String name, int rollNo, String universityName, String researchPapperName, String thesis){
        super(name,rollNo,universityName,researchPapperName);
        this.thesis=thesis;
    }
    @Override
    void getStudentDetails(){
        super.getStudentDetails();
        System.out.println(name+" is publishing thesis "+thesis);
    }
}
