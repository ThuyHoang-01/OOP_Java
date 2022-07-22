import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestLinkedHashet {

	 public static void main(String[] args) {
	        // Create list
	        LinkedHashSet<Product> set = new LinkedHashSet<Product>();
	        // // Add element to list
	        Product p1 = new Product("p1", "Inphone 5", 2,15);
	        Product p2 = new Product("p2", "Samsung sII",3, 11);
	        Product p3 = new Product("p3", "Oppo ",2, 10);
	        Product p4 = new Product("p4", "lenovo thinkpad",3, 21);       
	        set.add(p1);
	        set.add(p2);
	        set.add(p3);
	        set.add(p4);
	        // show set
	        Iterator<Product> iterator = set.iterator();
	        Product product;
	        while (iterator.hasNext()) {
	            product = iterator.next();
	            System.out.println(product.toString());
	        }
	    }
}
