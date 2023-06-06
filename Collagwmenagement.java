    // Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
import java.util.ArrayList;
public class Collagwmenagement {
    public static void main(String[] args) {
        Integer choice =0 ;
        ArrayList<Student> allStudents = new ArrayList<Student>();
        do{
            Scanner obj = new Scanner(System.in);
            System.out.println("___Collage Management System___");
            System.out.println("Press 0 to exit");
            System.out.println("Press 1 to add student");
            System.out.println("Press 2 to remove student ");
            System.out.println("Press 3 to view all students");
            choice = obj.nextInt();
            switch(choice){
                case 1 :
                    //Student studentObj = new Student();
                    System.out.println("Name : ");
                    String name = obj.next();
                    System.out.println("Roll Number : ");
                    int rollNumber = obj.nextInt();
                    System.out.println("FatherName : ");
                    String fatherName = obj.next();
                    System.out.println("MotherName : ");
                    String motherName = obj.next();
                    System.out.println("className : ");
                    String className = obj.next();
                    
                    allStudents.add(new Student(name,rollNumber,fatherName,motherName,className));
                    break;
                case 2 :
                    System.out.println("remove student");
                    System.out.println("Roll Number : ");
                    int DeleterollNumber = obj.nextInt();
                    for(int i = 0; i < allStudents.size();i++){
                        if(DeleterollNumber == allStudents.get(i).rollNumber){
                            allStudents.remove(i);
                        }
                    }
                    break;
                case 3 :
                    System.out.println("show all students");
                    System.out.println("Roll Number \t Name \t\t FatherName \t MotherName \t className");
                    for(Student studentObj : allStudents){
                        System.out.println(studentObj.rollNumber+" \t\t "+studentObj.name+" \t\t "+studentObj.fatherName+" \t\t "+studentObj.motherName+" \t\t "+studentObj.className);
                    }
                    break;
                default : 
                    break;
            }
            System.out.println("------------------------------");
        }while(choice!=0);
    }
}
 class Student{
    public int rollNumber;
    public Integer age;
    public String name;
    public String fatherName;
    public String motherName;
    public String className;
    public Student(String name,int rollNumber,String fatherName,String motherName,String className){
        this.name = name;
        this.rollNumber = rollNumber;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.className = className;


    }
}
    

