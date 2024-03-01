package apicbiz.bobabootea.presentation;

import apicbiz.bobabootea.models.Item;
import apicbiz.bobabootea.models.ItemType;
import apicbiz.bobabootea.presentation.menus.EntireMenu;

import java.util.List;

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

    public EntireMenu selectEntireMenuOption() {
        EntireMenu[] values = EntireMenu.values();
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

    public void displayItems(List<Item> items, ItemType type) {
        displayHeader(type.name());
        for (Item i : items) {
            io.printf("%d. %s $%.2f%n", i.getItemId(), i.getName(), i.getPrice());
        }
    }

}
