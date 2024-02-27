package apicbiz.bobabootea.data;

import apicbiz.bobabootea.models.Item;
import apicbiz.bobabootea.models.ItemType;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class ItemMapper implements RowMapper<Item> {

    @Override
    public Item mapRow(ResultSet rs, int rowNum) throws SQLException {
        Item item = new Item (
                rs.getInt("itemId"),
                ItemType.valueOf(rs.getString("type")),
                rs.getString("name"),
                rs.getBigDecimal("price")
        );
        return item;
    }
}
