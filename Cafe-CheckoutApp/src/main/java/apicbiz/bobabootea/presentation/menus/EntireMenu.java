package apicbiz.bobabootea.presentation.menus;

public enum EntireMenu {
    EXIT("Exit"),
    VIEW_FULL_MENU("View Full Menu"),

    HOT_COFFEE("Hot Coffee"),
    ICED_COFFEE("Iced Coffee"),
    TEA("Tea"),
    FOOD("Food"),
    VIEW_CART("View Cart");

    String items;

    private EntireMenu(String items) {
        this.items = items;
    }

    public String toString() {
        return items;
    }
}
