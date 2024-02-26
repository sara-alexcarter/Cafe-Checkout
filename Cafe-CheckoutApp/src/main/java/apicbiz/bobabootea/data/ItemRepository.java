package apicbiz.bobabootea.data;

import apicbiz.bobabootea.models.Item;
import apicbiz.bobabootea.models.ItemType;

import javax.xml.crypto.Data;
import java.util.List;

public interface ItemRepository {

    // read methods
    List<Item> findAll() throws DataAccessException;
    Item findById(int Id) throws DataAccessException;
    List<Item> findByType(ItemType type) throws DataAccessException;
}
