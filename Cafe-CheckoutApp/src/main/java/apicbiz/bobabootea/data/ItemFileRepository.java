package apicbiz.bobabootea.data;

import apicbiz.bobabootea.models.Item;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ItemFileRepository implements ItemRepository {

    // This is the place for accessing data
    // I am using comma separated values (.csv)
    // This is the place to put CRUD operations

    private final String filepath;

    public ItemFileRepository(String filepath) {this.filepath = filepath;}

    // Read Operations
    // we want to list all the items on the menu
    // we want to list menu items by type
    // we want to be able to find items by ID
    public List<Item> findAll() throws DataAccessException {
        // create an array to store all the items we find
        ArrayList<Item> result = new ArrayList<>();
        // read the file with a bufferReader
        try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {

            // skip the header
            reader.readLine();

            // keep reading the next line until there are no lines left to read
        } catch (FileNotFoundException ex) {
            // ignore
        } catch (IOException ex) {
            throw new DataAccessException(ex.getMessage(), ex);
        }
        return result;
    }

    // Create Operations
    // add item to the cart

    // Update Operatons
    // update cart
    // write to file
    // serialize (put it in the format for a csv file)

    // Delete Operations
    // delete item from cart
    // remove from file
}
