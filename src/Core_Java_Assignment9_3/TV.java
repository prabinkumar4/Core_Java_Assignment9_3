package Core_Java_Assignment9_3;

	import java.util.ArrayList; //provides re-sizable array and implements the List interface
	import java.util.Collections; //Adds all of the specified elements to the specified collection

	public class TV {

		public static void main(String[] args) {
	        HDTV tv1 = new HDTV(42, "Samsung"); //one object tv1 of HDTV
	        HDTV tv2 = new HDTV(60, "Sony");    //one object tv2 of HDTV
	        HDTV tv3 = new HDTV(32, "LG");      //one object tv3 of HDTV

	        ArrayList<HDTV> list = new ArrayList<HDTV>();
	        list.add(tv1);  //tv1 is added to the list
	        list.add(tv2);  //tv2 is added to the list
	        list.add(tv3);  // tv3 is added to the list

	        Collections.sort(list, new SizeComparator()); 
	        //Collections.sort method uses standard sorting algorithm and it uses the implemented compare method anytime it needs while sorting.
	        //SizeComparator() method compares the size of array list objects.
	         
	        for (HDTV list1 : list) {
	               System.out.println(list1.getBrand()); // it will print the brand name as per the size of the TV in Ascending order
	        }
	 }

	}		
	
	
