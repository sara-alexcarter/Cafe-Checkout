package apicbiz.bobabootea.presentation;

import apicbiz.bobabootea.domain.ItemService;
import apicbiz.bobabootea.models.ItemType;
import apicbiz.bobabootea.presentation.menus.EntireMenu;


public class EntireMenuController {

    private ItemService service;
    private View view;

    public EntireMenuController(ItemService service, View view) {
        this.service = service;
        this.view = view;
    }

    public void run() {
        view.displayHeader("Welcome to the Pirate Cove Cafe");
        try {
            runEntireMenu();
        } catch (Exception ex) {
            view.displayException(ex);
        }
        view.displayHeader("Goodbye.");
    }

    public void runEntireMenu() {
        EntireMenu option;

        do {
            option = view.selectEntireMenuOption();

            switch (option) {
                case VIEW_FULL_MENU:
                    for (ItemType type: ItemType.values()) {
                        view.displayItems(service.findByType(type), type);
                    }
                    break;
                case HOT_COFFEE:
                    view.displayItems(service.findByType(ItemType.HOT_COFFEE), ItemType.HOT_COFFEE);
                    break;
                case ICED_COFFEE:
                    view.displayItems(service.findByType(ItemType.ICED_COFFEE), ItemType.ICED_COFFEE);
                    break;
                case TEA:
                    view.displayItems(service.findByType(ItemType.TEA), ItemType.TEA);
                    break;
                case FOOD:
                    view.displayItems(service.findByType(ItemType.FOOD), ItemType.FOOD);
                    break;
                case VIEW_CART:
                    System.out.println("Selected Cart");
            }
            System.out.println();
        } while (option != EntireMenu.EXIT);

    }


}
