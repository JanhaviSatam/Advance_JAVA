package Collections_API_3;
import java.lang.Comparable;

 public class Comparable_1_1 implements Comparable<Comparable_1_1> {
	 
	 // in which compareTo method we are going to used that class we have 
	 //to pass in Comparable Interface<compareTo method's Class>
    int roll_no;
    String name;
    int std;

    public Comparable_1_1(int r, String n, int s) {
        roll_no = r;
        name = n;
        std = s;
    }

    @Override
    public  int compareTo(Comparable_1_1 arg){
    	
    	// In above compareTo function We have to pass Class name in which compareTo function is there.
    	// the arg parameter represents the second object in the comparison.
    	
    	// Sort by std (Descending): Uncomment the std block if you want to sort the list by the std 
    	//field in descending order.

//         if(std>arg.std)
//         {
//        	// the arg parameter represents the second object in the comparison.
//        return -1;
//         }
//        else
//        { 
//           return 1;    // --->double
//        }
         
         
      //   If 1 is returned, it indicates that obj1 should be placed after obj2 in the sorted order.
       //  If -1 was returned (in the case where this.std > arg.std), obj1 would be placed before obj2.
         
         //If you use Collections.sort(), the sorting algorithm (e.g., Merge Sort, Quick Sort) will repeatedly call
         //compareTo between pairs of objects to decide their relative order.
         
         // Q) How the internal working of compareTo method ?
    	
    	 //  Sort by name (Lexicographically): Keep the name.compareTo line uncommented for alphabetical 
    	//sorting by name.
       // return (int) (name.compareTo(arg.name)); //-->String
         
        return (int) (roll_no-arg.roll_no);  
        
       // Sort by roll_no (Ascending): Uncomment the roll_no subtraction for sorting by roll number.
      

       


         
         //Sorting: When Collections.sort(stud) is called, the sorting process involves calling 
         //the compareTo method to compare pairs of objects in main function class:

         //First, students.get(0).compareTo(students.get(1)) is called. Here, the current object 
         //is students.get(0) (which is "Riddhi") and the argument (arg) is students.get(1) (which is "Alok").
          //Inside compareTo, this.name.compareTo(arg.name) compares "Riddhi" with "Alok".
    }

    @Override
    public String toString() {
        return "Comparable{" +
                "roll_no=" + roll_no +
                ", name='" + name + '\'' +
                ", std=" + std +
                '}';
        
    }
   
 }
