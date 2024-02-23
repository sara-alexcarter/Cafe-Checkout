package apicbiz.bobabootea.presentation.menus;

import javax.imageio.plugins.tiff.ExifInteroperabilityTagSet;

public enum mainMenu {
    MAIN_MENU("Main Menu"),
    VIEW_CART("View Cart"),
    EXIT("Exit");

    private String menuOptions;

    private mainMenu(String menuOptions) {
        this.menuOptions = menuOptions;
    }

    public String toString() {
        return menuOptions;
    }
}
