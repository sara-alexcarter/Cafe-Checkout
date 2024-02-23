package apicbiz.bobabootea.presentation.menus;

public enum ItemTypeMenu {
    RETURN_TO_MAIN_MENU("Return to Main Menu"),
    HOT_COFFEE("Hot Coffee"),
    ICED_COFFEE("Iced Coffee"),
    TEA("Tea"),
    FOOD("Food");

    String items;

    private ItemTypeMenu(String items) {
        this.items = items;
    }

    public String toString() {
        return items;
    }
}
