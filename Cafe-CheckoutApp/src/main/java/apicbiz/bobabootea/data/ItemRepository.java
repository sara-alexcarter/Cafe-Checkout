package apicbiz.bobabootea.data;

import apicbiz.bobabootea.models.Item;
import apicbiz.bobabootea.models.ItemType;

import java.util.List;

public interface ItemRepository {

    // read methods
    List<Item> findByType(ItemType type);
}
