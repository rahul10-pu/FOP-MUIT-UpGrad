package com.upgrad.fop;

public class InheritanceTypes {
    public static void main(String[] args) {
        Student cse = new Student("Ashish",23145,"MUIT");
        cse.getStudentDetails();
        cse.miniLaptop.name="lenovo";
        cse.miniLaptop.ram=16;
        cse.miniLaptop.getLaptopConfig();

        ResarchStudent re=new ResarchStudent("Ashish",23145,"MUIT","Machine Learning");
//        re.getResearchPaperName();
        re.getStudentDetails();
        MtechStudent me=new MtechStudent("Krishna",1000,"MUIT",10);
        me.getStudentDetails();
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
//    Mobile mi=new Mobile();
    public Student(String name, int rollNo, String universityName){
        this.universityName=universityName;
        this.rollNo=rollNo;
        this.name=name;
    }
     void getStudentDetails(){
        System.out.println("Name of the Student: "+name+"\nRoll No. of a Student: "+rollNo+"\nUniversity Name: "+universityName);
    }
}
class MtechStudent extends Student{
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
class ResarchStudent extends Student{
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
        super.getStudentDetails();
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
