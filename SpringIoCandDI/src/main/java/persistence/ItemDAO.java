package persistence;

import domain.Item;

public class ItemDAO {
	ItemDAO(){}

	public Item get() {
		Item item  = new Item();
		item.setItemId(1);
		item.setItemName("망고");
		item.setDescription("가장 좋아하는 과일");
		item.setPrice(3000);
		item.setPictureUrl("mango.jpg");
		return item;
	}
}
