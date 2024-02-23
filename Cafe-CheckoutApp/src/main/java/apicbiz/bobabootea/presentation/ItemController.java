package apicbiz.bobabootea.presentation;

import apicbiz.bobabootea.domain.ItemService;
import apicbiz.bobabootea.presentation.menus.ItemTypeMenu;


public class ItemController {

    private ItemService service;
    private View view;

    public ItemController(ItemService service, View view) {
        this.service = service;
        this.view = view;
    }

    public void runItemMenu() {
        ItemTypeMenu option;

        do {
            option = view.selectItemMenuOption();

            switch (option) {
                case HOT_COFFEE -> System.out.println("Selected Hot Coffee");
                case ICED_COFFEE -> System.out.println("Selected Iced Coffee");
                case TEA -> System.out.println("Selected Tea");
                case FOOD -> System.out.println("Selected Food");
            }
        } while (option != ItemTypeMenu.RETURN_TO_MAIN_MENU);

    }
}
