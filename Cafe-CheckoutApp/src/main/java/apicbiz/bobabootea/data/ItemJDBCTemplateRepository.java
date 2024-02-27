package apicbiz.bobabootea.data;

import apicbiz.bobabootea.models.Item;
import apicbiz.bobabootea.models.ItemType;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class ItemJDBCTemplateRepository implements ItemRepository {
    private final JdbcTemplate jdbcTemplate;

    public ItemJDBCTemplateRepository(JdbcTemplate jdbcTemplate) { this.jdbcTemplate = jdbcTemplate; }
    @Override
    public List<Item> findAll() throws DataAccessException {
        final String sql = """
                select *
                from item
                """;
        return jdbcTemplate.query(sql, new ItemMapper());
    }

    @Override
    public Item findById(int Id) throws DataAccessException {
        final String sql = """
                select *
                from item
                where itemId = ?
                """;
        return jdbcTemplate.query(sql, new ItemMapper(), Id).stream().findFirst().orElse(null);
    }

    @Override
    public List<Item> findByType(ItemType type) throws DataAccessException {
        final String sql = """
                select *
                from item
                where `type` = ?
                """;
        return jdbcTemplate.query(sql, new ItemMapper(), type.name());
    }
}
