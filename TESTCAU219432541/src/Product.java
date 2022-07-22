
public class Product {

	private String Id;
	private String Name;
	private int Quantity;
	private double UnitPrice;

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	public double getUnitPrice() {
		return UnitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		UnitPrice = unitPrice;
	}

	public Product(String id, String name, int quantity, double unitPrice) {
		super();
		Id = id;
		Name = name;
		Quantity = quantity;
		UnitPrice = unitPrice;
	}

	public String toString() {
		return "Product [Id=" + Id + ", Name=" + Name + ", Quantity=" + Quantity + ", UnitPrice=" + UnitPrice + "]";
	}
}
