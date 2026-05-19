package helper;

import entity.Student;
import repository.StudentRepository;

public class outputhelper {
	
                         //  Use void paramiterised method
	                    // int a / Student s -> s. ref variable 
	public void printStudentDetails (Student s) {
		 System.out.println("id : "+s.id);
		 System.out.println("name : " +s.firstname);
		 System.out.println("Last name : "+s.lastname); 
		 System.out.println("English Marks : " +s.englishObtained);
		 System.out.println("Maths Marks : " + s.mathsObtained);
		 System.out.println("Science Marks : " +s.scienceObtained);
	}
        //// Use the (outputhelper) class one man get to 10 other student document.
    // Test.java
 //StudentRepository repository = new StudentRepository();
 //System.out.println("Print Ram details");
 //Student ram = repository.getRamObject();
 //System.out.println(ram.id); 
 //System.out.println(ram.firstname);
 //System.out.println(ram.lastname);
 //System.out.println(ram.englishObtained);
 //System.out.println(ram.mathsObtained);
 //System.out.println(ram.scienceObtained);

 //System.out.println("============================");



 //StudentRepository repository1 = new StudentRepository();
 //System.out.println("Print Sham details");
 //Student Sham = repository1.getShamObject();
 //System.out.println(Sham.id);
 //System.out.println(Sham.id);
 //System.out.println(Sham.firstname);
 //System.out.println(Sham.lastname);
 //System.out.println(Sham.englishObtained);
 //System.out.println(Sham.mathsObtained);
 // System.out.println(Sham.scienceObtained);
                
}
