package apicbiz.bobabootea.models;

import java.math.BigDecimal;
import java.util.Objects;

public class Item {
    private int itemId;
    private ItemType type;
    private String name;
    private BigDecimal price;


    public Item() {

    }
    public Item(int itemId, ItemType type, String name, BigDecimal price) {
        this.itemId = itemId;
        this.type = type;
        this.name = name;
        this.price = price;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public ItemType getType() {
        return type;
    }

    public void setType(ItemType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return getItemId() == item.getItemId() && getType() == item.getType() && Objects.equals(getName(), item.getName()) && Objects.equals(getPrice(), item.getPrice());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getItemId(), getType(), getName(), getPrice());
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemId=" + itemId +
                ", type=" + type +
                ", name='" + name + '\'' +
                ", price= $" + price +
                '}';
    }


}
