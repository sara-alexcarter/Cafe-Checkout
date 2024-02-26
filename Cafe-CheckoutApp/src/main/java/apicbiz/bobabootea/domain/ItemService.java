package apicbiz.bobabootea.domain;

import apicbiz.bobabootea.data.DataAccessException;
import apicbiz.bobabootea.data.ItemFileRepository;
import apicbiz.bobabootea.models.Item;
import apicbiz.bobabootea.models.ItemType;

import java.util.List;

public class ItemService {

    ItemFileRepository repository;

    public ItemService(ItemFileRepository repository) {
        this.repository = repository;
    }

    public List<Item> findAll() throws DataAccessException {
        return repository.findAll();
    }

    public Item findById(int id) throws DataAccessException {
        return repository.findById(id);
    }

    public List<Item> findByType(ItemType type) throws DataAccessException {
        return repository.findByType(type);
    }

}
