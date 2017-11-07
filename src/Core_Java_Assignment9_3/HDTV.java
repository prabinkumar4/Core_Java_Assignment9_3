package Core_Java_Assignment9_3;
import java.util.Comparator; //For comparing two different objects
public class HDTV {
	       private int tvSize;     // integer variable
	       private String tvBrand; //String variable

	       public HDTV(int tvSize, String tvBrand) { //constructor of HDTV
	              this.tvSize = tvSize;
	              this.tvBrand = tvBrand;
	       }

	       public int getSize() {  
	              return tvSize;
	       }

	       public void setSize(int tvSize) {
	              this.tvSize = tvSize;
	       }

	       public String getBrand() {
	              return tvBrand;
	       }

	       public void setBrand(String tvBrand) {
	              this.tvBrand = tvBrand;
	       }
	}

	class SizeComparator implements Comparator<HDTV> {
	       
	       public int compare(HDTV tv1, HDTV tv2) { 
	    	   /*compare() method compares tv1 and tv2 objects. Returns int value 
	    	    positive – if tv1 is greater than tv2
	    	    zero – if tv1 equals to tv2
	    	    negative – if tv1 is less than tv2 */
	   
	    	    
	              int tv1Size = tv1.getSize(); //getSize() method will returns the size of the object.
	              int tv2Size = tv2.getSize();	              	              
	              
	              if (tv1Size > tv2Size) {
	                     return 1;
	              } else if (tv1Size < tv2Size) {
	                     return -1;
	              } else {
	                     return 0;
	              }
	       }
	}

