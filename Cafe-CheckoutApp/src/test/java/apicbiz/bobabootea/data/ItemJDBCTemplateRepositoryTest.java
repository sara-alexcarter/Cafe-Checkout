package apicbiz.bobabootea.data;

import apicbiz.bobabootea.DataHelper;
import apicbiz.bobabootea.models.Item;
import apicbiz.bobabootea.models.ItemType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.core.JdbcTemplate;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ItemJDBCTemplateRepositoryTest {

    /** data helper is for login credentials, jdbc template is boilerplate **/
    JdbcTemplate jdbcTemplate = DataHelper.getJdbcTemplate();
    ItemJDBCTemplateRepository repository = new ItemJDBCTemplateRepository(jdbcTemplate);

    @BeforeEach
    void setup() {
        jdbcTemplate.execute("call set_known_good_state();");
    }
    /**
     * Doesn't need to throw exception
     */
    @Test
    void ShouldFindAllItems() throws DataAccessException {
        List<Item> actual = repository.findAll();
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
        Item expected = new Item(5, ItemType.ICED_COFFEE, "Buccaneer's Blend (Iced Caramel Macchiato)", BigDecimal.valueOf(5.00));
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindByExistingType() throws DataAccessException {
        List<Item> actual = repository.findByType(ItemType.HOT_COFFEE);
        assertEquals(3, actual.size());
    }
}