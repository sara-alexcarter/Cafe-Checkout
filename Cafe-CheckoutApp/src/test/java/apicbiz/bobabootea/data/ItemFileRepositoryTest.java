package apicbiz.bobabootea.data;

import apicbiz.bobabootea.models.Item;
import apicbiz.bobabootea.models.ItemType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ItemFileRepositoryTest {

    private static final String SEED_PATH = "./MenuItems/menu-seed.csv";
    private static final String TEST_PATH = "./MenuItems/menu-test.csv";
    private ItemFileRepository repository = new ItemFileRepository(TEST_PATH);

    @BeforeEach
    void setup() throws IOException {
        Files.copy(
                Paths.get(SEED_PATH),
                Paths.get(TEST_PATH),
                StandardCopyOption.REPLACE_EXISTING);
    }

    @Test
    void ShouldFindAllItems() throws DataAccessException {
        List<Item> actual = repository.findAll();
        assertNotNull(actual);
        assertEquals(12,actual.size());

    }

    @Test
    void shouldNotFindNonExistingId() throws DataAccessException {
        Item actual = repository.findById(15);
        assertNull(actual);
    }

    @Test
    void shouldFindExistingId() throws DataAccessException {
        Item actual = repository.findById(5);
        Item expected = new Item(5, ItemType.ICED_COFFEE, "Buccaneer's Blend (Iced Caramel Macchiato)", 5.00 );
        assertEquals(expected, actual);
    }
}