package main;

import entity.Student;
import repository.StudentRepository;

public class Test {
	public static void main(String[] args) {
		
		StudentRepository repository = new StudentRepository();
		System.out.println("Print Ram details");
		Student ram = repository.getRamObject();
		System.out.println(ram.id); 
		System.out.println(ram.firstname);
		System.out.println(ram.lastname);
		System.out.println(ram.englishObtained);
		System.out.println(ram.mathsObtained);
		System.out.println(ram.scienceObtained);
		
		System.out.println("============================");
		
	
	
       StudentRepository repository1 = new StudentRepository();
       System.out.println("Print Sham details");
       Student Sham = repository1.getShamObject();
       System.out.println(Sham.id);
       System.out.println(Sham.id);
	   System.out.println(Sham.firstname);
	   System.out.println(Sham.lastname);
	   System.out.println(Sham.englishObtained);
	   System.out.println(Sham.mathsObtained);
	   System.out.println(Sham.scienceObtained);
		
	   //All student 
       
}	
}
