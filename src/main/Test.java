package main;



		import java.util.Scanner;

import entity.Student;
		import helper.outputhelper;
		import repository.StudentRepository;

		public class Test {
			// Student->StudRepository->Test->Test2->Outouthelper->
			
			// Dout->To see-> End Page.....
			        // Scanner->Switch Case->Method Call....
			
			

			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter name of student : ");
				
				String name = sc.next();
				
				// Object create Upperside (global)StudentRepository
				StudentRepository repository = new StudentRepository();
				outputhelper helper = new outputhelper();
				
				// Create outputhelper class -> SYso so many time ------->
				//-> later -> Test2.-> when enter student name -> Ram-> All Name Prinet
				//-> Stop all name print as -> use (Switch). 
				            // helper -> ref variable
				switch(name) {
				case "Ram" : {
					Student ram = repository.getRamObject();
		// Return method get (Student) return -> (Student-> Ram -> Ram is ref variable)
					helper.printStudentDetails(ram);
					break;
				}
				case "Sham" : {
					Student sham = repository.getShamObject();
					helper.printStudentDetails(sham);
					break;
				}
				case "Advit" :{
					Student Advit = repository.getAdvitObject();
					helper.printStudentDetails(Advit);
					break;
				}
				case "Shubham" :{
					
					Student Shubham = repository.getShubhamObject();
					helper.printStudentDetails(Shubham);
					break;
				}
				case "Vastav" : {
					Student Vastav = repository.getVastavObject();
							helper.printStudentDetails(Vastav);
					break;
				}
				case "Sudip" : {
					Student Sudip = repository.getSudipObject();
							helper.printStudentDetails(Sudip);
				break;
				}
				
				case "Raj" :{
					Student Raj = repository.getRajObject();
					helper.printStudentDetails(Raj);
					break;
				}
				case "Kanhaiya" :{
					Student Kanhaiya = repository.getKanhaiyaObject();
					helper.printStudentDetails(Kanhaiya);
					break;
				}
				case "Vinayak" :{
					Student Vinayak = repository.getVinayakObject();
					helper.printStudentDetails(Vinayak);
					break;
				}
				case "Aditya" :{
					Student Aditya = repository.getAdityaObject();
					helper.printStudentDetails(Aditya);
					break;
				}
				case "Rakesh" :{
					Student Rakesh = repository.getRakeshObject();
					helper.printStudentDetails(Rakesh);
					break;
				}
				default:
					System.err.println("Please enter a proper name ");
				}
       
}	
}
