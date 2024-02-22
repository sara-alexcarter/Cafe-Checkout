package apicbiz.bobabootea.models;

public class Item {
    private int itemId;
    private ItemType type;
    private String name;
    private double price;


    public Item(int itemId, ItemType type, String name, double price) {
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
