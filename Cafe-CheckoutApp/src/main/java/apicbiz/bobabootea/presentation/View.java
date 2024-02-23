package apicbiz.bobabootea.presentation;

import apicbiz.bobabootea.presentation.menus.ItemTypeMenu;
import apicbiz.bobabootea.presentation.menus.MainMenu;

public class View {
    ConsoleIO io;

    public View(ConsoleIO io) {
        this.io = io;
    }

    public int selectOption(Enum<?>[] MenuOptions) {
        for (int i = 0; i < MenuOptions.length; i++) {
            io.printf("%s. %s%n", i, MenuOptions[i]);
        }

        String msg = String.format("Select [0-%s]: ", MenuOptions.length - 1);
        int index = io.readInt(msg, 0, MenuOptions.length - 1);
        io.println();
        return index;
    }

    public MainMenu selectMainMenuOption() {
        displayHeader("Main Menu");
        MainMenu[] values = MainMenu.values();
        return values[selectOption(values)];
    }

    public ItemTypeMenu selectItemMenuOption() {
        displayHeader("Item Menu");
        ItemTypeMenu[] values = ItemTypeMenu.values();
        return values[selectOption(values)];
    }

    public void displayHeader(String message) {
        io.println("");
        io.println(message);
        io.println("=".repeat(message.length()));
    }

    public void displayException(Exception ex) {
        displayHeader("A critical error occurred:");
        io.println(ex.getMessage());
    }
}
