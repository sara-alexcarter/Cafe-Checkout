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

    @Test
    void shouldFindByExistingType() {
        List<Item> actual = repository.findByType(ItemType.HOT_COFFEE);
        assertEquals(3, actual.size());
    }
}