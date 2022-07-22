import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet {

	public static void main(String[] args) {
		HashSet<Product> myhs=new HashSet<Product>();
		Product p1=new Product("p1", "Iphone 5", 2, 15);
		myhs.add(p1);
		Product p2=new Product("p2", "Samsung sII",3, 11);
		myhs.add(p2);
		System.out.println(myhs);
		Iterator<Product> list= myhs.iterator();
		while(list.hasNext())
		{
		Product x= list.next();
		System.out.println(x);
		}
		}

}
