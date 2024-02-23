package apicbiz.bobabootea.presentation.menus;

public enum MainMenu {
    EXIT("Exit"),
    MAIN_MENU("Main Menu"),
    VIEW_CART("View Cart");

    private String menuOptions;

    private MainMenu(String menuOptions) {
        this.menuOptions = menuOptions;
    }

    public String toString() {
        return menuOptions;
    }
}
