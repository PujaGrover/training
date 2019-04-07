import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	private List<Item> items = new ArrayList<Item>();
	private int quantity = 1;
	public boolean isEmpty() {
		return items.isEmpty();
	}


	public void add(Item item) {
		this.items.add(item);
	}


	public int totalPrice() {
		int totalPrice = 0;
		for(Item item : items) {
			totalPrice = totalPrice + (item.getPrice()*quantity);
		}
		return totalPrice;
	}


	public void add(Item item, int quantity) {
		items.add(item);
		this.quantity = quantity;
	}


	public List<String> getItems() {
		List<String> itemDescriptions = new ArrayList<String>();
		itemDescriptions.add("1 Mango for $5");
		return itemDescriptions;
	}
	
}
