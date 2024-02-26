package apicbiz.bobabootea.presentation;

import apicbiz.bobabootea.data.DataAccessException;
import apicbiz.bobabootea.domain.ItemService;
import apicbiz.bobabootea.models.Item;
import apicbiz.bobabootea.models.ItemType;
import apicbiz.bobabootea.presentation.menus.ItemTypeMenu;

import java.util.List;


public class ItemController {

    private ItemService service;
    private View view;

    public ItemController(ItemService service, View view) {
        this.service = service;
        this.view = view;
    }

    public void runItemMenu() throws DataAccessException {
        ItemTypeMenu option;

        do {
            option = view.selectItemMenuOption();

            switch (option) {
                case HOT_COFFEE -> view.displayItems(service.findByType(ItemType.HOT_COFFEE));
                case ICED_COFFEE -> view.displayItems(service.findByType(ItemType.ICED_COFFEE));
                case TEA -> view.displayItems(service.findByType(ItemType.TEA));
                case FOOD -> view.displayItems(service.findByType(ItemType.FOOD));
            }
        } while (option != ItemTypeMenu.RETURN_TO_MAIN_MENU);

    }


}
