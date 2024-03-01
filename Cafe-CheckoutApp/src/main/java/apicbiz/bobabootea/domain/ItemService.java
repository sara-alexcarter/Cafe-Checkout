package apicbiz.bobabootea.domain;

import apicbiz.bobabootea.data.ItemRepository;
import apicbiz.bobabootea.models.Item;
import apicbiz.bobabootea.models.ItemType;

import java.util.List;

public class ItemService {

    ItemRepository repository;

    public ItemService(ItemRepository repository) {
        this.repository = repository;
    }

    public List<Item> findByType(ItemType type) {
        return repository.findByType(type);
    }

}
