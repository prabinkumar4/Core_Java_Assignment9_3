/**
 * 
 */

/**
 * @author khuranas
 *
 */

	import java.util.Comparator;
public class HDTV {
	       private int size;
	       private String brand;

	       public HDTV(int size, String brand) {
	              this.size = size;
	              this.brand = brand;
	       }

	       public int getSize() {
	              return size;
	       }

	       public void setSize(int size) {
	              this.size = size;
	       }

	       public String getBrand() {
	              return brand;
	       }

	       public void setBrand(String brand) {
	              this.brand = brand;
	       }
	}

	class SizeComparator implements Comparator<HDTV> {
	       @Override
	       public int compare(HDTV tv1, HDTV tv2) {
	              int tv1Size = tv1.getSize();
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

