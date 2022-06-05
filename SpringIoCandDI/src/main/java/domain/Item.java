package domain;

import lombok.Data;

@Data
public class Item {
	private int itemId;
	private String itemName;
	private int price;
	private String description;
	private String pictureUrl;
	
	public Item() {}
	public Item(int itemId) {this.itemId = itemId;}
}
