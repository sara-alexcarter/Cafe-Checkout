package apicbiz.bobabootea.presentation;

import apicbiz.bobabootea.models.Item;
import apicbiz.bobabootea.presentation.menus.mainMenu;

public class Controller {

    private ItemController itemController;
    private View view;

    public Controller(ItemController itemController, View view) {
        this.itemController = itemController;
        this.view = view;
    }

    // run a loop and catch errors
    public void run() {
        view.displayHeader("Welcome to the Cafe Shop");
        try {
            runMainMenu();
        } catch (Exception ex) {
            view.displayException(ex);
        }
        view.displayHeader("Goodbye.");
    }


    // run app to choose menu options
    public void runMainMenu() {

        mainMenu option;

        do {
            option = view.selectMainMenuOption();

            switch (option) {
                case MAIN_MENU -> System.out.println("Selected Main Menu");
                case VIEW_CART -> System.out.println("Selected Cart");
            }
        } while (option != mainMenu.EXIT);

    }
}
