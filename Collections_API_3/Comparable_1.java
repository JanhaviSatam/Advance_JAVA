package Collections_API_3;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
 class Comparable_1
 {
	 public static void main(String args[])
	 {
		 List<Comparable_1_1> stud= new ArrayList<Comparable_1_1>();
		 //connecting predefined class with user defined class in object creation syntax.
		 // if we imported List interface but did not imported ArrayList class then the compiler
		 //will not recognize the ArrayList class in the code.So we have to import the ArrayList class from util package.
		 
		 stud.add(new Comparable_1_1(111,"riddhi",89));
		 //We know if we have to pass a data in constructor we have to make the  object creation syntax 
		 //in main function and to pass as well we can pass it in class by creating again object creation syntax
		 //for constructor or static data input in  Constructor by creating parameterized constructor from main function or in class .
	     //So here we have created object for Class in Another class while making ArryaList and to use that object with half of the 
		 //object creation syntax to add the value in the Constructor of main function object creation syntax.
		 
		 stud.add(new Comparable_1_1(45,"alok",99));
		 stud.add(new Comparable_1_1(300,"chinmay",88));
		 stud.add(new Comparable_1_1(71,"krishna",80));
		 //When we want to pass data in ArrayList we have to use add function
		 
//		 Collections.sort(stud,new studroll());
//		 System.out.println("using rollno");
//		 System.out.println(stud);
//		 
//		 Collections.sort(stud,new studname());
//		 System.out.println("using name");
//		 System.out.println(stud);
//		 
//		 
//		 Collections.sort(stud,new studper());
//		 System.out.println("using percentage");
//		 System.out.println(stud);
		 
		 
		 Collections.sort(stud);
		 
		 // Sorting: When Collections.sort(stud) is called, the sorting process involves calling 
         //the compareTo method to compare pairs of objects in main function class:
		 //The sort method connects to comapteTo function with stud object which is 
		 //of class in which compareTo method is created.
		 
		 //If you use Collections.sort(), the sorting algorithm (e.g., Merge Sort, Quick Sort)
		 //will repeatedly call compareTo between pairs of objects to decide their relative order.
		 
		 
		 //Collections is a class here and Collection is interface both are in java.util package.
		 
		// stud object is working in two ways as the object of another class  to connect with
		 //main function  class  because the ArrayList is created in main function class as well as 
		// working as a variable to hold the ArrayList values(data );
		 
		 for(Comparable_1_1 ob : stud)
		 {
			 System.out.println(ob);
		 }
		 
		 // for working toString method  in which class it is created it should call like for(Comparable_1_1 ob : stud)
		// {
		//	 System.out.println(ob);
		// }
	 }
 }