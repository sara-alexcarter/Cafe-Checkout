package apicbiz.bobabootea.presentation;

import apicbiz.bobabootea.data.DataAccessException;
import apicbiz.bobabootea.presentation.menus.MainMenu;

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
    public void runMainMenu() throws DataAccessException {

        MainMenu option;

        do {
            option = view.selectMainMenuOption();

            switch (option) {
                case MAIN_MENU -> itemController.runItemMenu();
                case VIEW_CART -> System.out.println("Selected Cart");
            }
        } while (option != MainMenu.EXIT);

    }
}
