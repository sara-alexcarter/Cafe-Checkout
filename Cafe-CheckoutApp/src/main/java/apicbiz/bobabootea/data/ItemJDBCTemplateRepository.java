package apicbiz.bobabootea.data;

import apicbiz.bobabootea.models.Item;
import apicbiz.bobabootea.models.ItemType;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class ItemJDBCTemplateRepository implements ItemRepository {
    private final JdbcTemplate jdbcTemplate;

    public ItemJDBCTemplateRepository(JdbcTemplate jdbcTemplate) { this.jdbcTemplate = jdbcTemplate; }
    @Override
    public List<Item> findByType(ItemType type){
        final String sql = """
                select *
                from item
                where `type` = ?
                """;
        return jdbcTemplate.query(sql, new ItemMapper(), type.name());
    }
}
