package Collections_API_3;

import java.util.*;

public class first_lecture
{
	
	public static void main(String args[])
	{
//      String b[] = new String[5];                                             
//      Scanner sc = new Scanner (System.in);
//      System.out.println("Enter the input");
//      
//      for(int i = 0;i<5;i++)
//      {
//    	  
//    	  b[i]=sc.next();
//      }
//      
//      for(int i = 0;i<b.length;i++)
//      {
//    	  System.out.println(b[i]);
//      }
//      
		
		
		List<String> course = new ArrayList<String>(); // why we have created object of class ArrayList because we have to call the function within the class ArrayList 
		//In Java, List and ArrayList are both part of the java.util package.Type: List is an interface in the java.util package..Type: ArrayList is a concrete class in the java.util package that implements the List interface.
		String arr[]= {"angular JS" ,"React"};                                     //List is the interface and ArrayList is the class of that interface
		//There is no name to ArrayList so we have to use its object for any purpose
		course.add(new String("C++")); // This is the another way to write
		course.add("Java");
		course.add("Python"); 
		 
		 List<String> newcourse = Arrays.asList(arr);//Arrays is a utility class in the Java java.util package. It provides various static methods for operating on arrays, such as sorting, searching, and converting them to lists.
		// List<String> newcourse1 = new ArrayList<>(Arrays.asList(arr));
         System.out.println(course);
         
         //displaying using for loop
         System.out.println("Displaying Using foreach loop");
         for(String c: course)
         {
        	 System.out.println(c); // in for each loop it automatically understands the end of the data or we can say even the size ended 
         }
		 //ArrayList in Java does use and maintain index values for its elements. It allows you to access elements by their index
         System.out.println("Displaying using for loop");
         for(int i =0 ; i<course.size();i++)// ArrayList don't take length
         {
        	 System.out.println(course.get(i)); // Since there is no name for arraylist like array we have to use arraylist object and get function with it and for the condition use arraylist object and size function for getting range 
        	
         }
		 //the ArrayList class does contain the get(int index) method, as it implements the List interface, which defines this method.
	     
         System.out.println("Displaying through iterator");
         Iterator<String> itr = course.iterator();  // We have to iterate on the arraylist course object and it will be stored in itr object of iterator.
         while(itr.hasNext())
         {
        	 System.out.println(itr.next().toUpperCase()); // why not here course.next()?
         }
         System.out.println("Displaying another Arraylist");
	
	     System.out.println(newcourse);
	     
	     course.addAll(newcourse);// in which arraylist we have to add we have written that object means --> course.addAll() and  from which we have to take we have to give in addAll() function --> addAll(newcourse) --> course.addAll(newcourse)
	     System.out.println("Displaying first Arraylist");
	     System.out.println(course);
	
	     System.out.println("Aftr update");
	     course.set(3, "Angular9");
	     System.out.println(course);
	     
	     course.remove(2);
	     System.out.println(course);
	     
	     course.add(2, "C");     // The position at third place means the 2 index value as the index valuestarts from 0 so it gets the value C and right side data is shifted to 4th , 5th position that is 3rd index value and 4th index value
	     System.out.println(course);
	     
	     
	} 
	 
}
