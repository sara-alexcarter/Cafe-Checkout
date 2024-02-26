package apicbiz.bobabootea;

import apicbiz.bobabootea.data.ItemFileRepository;
import apicbiz.bobabootea.domain.ItemService;
import apicbiz.bobabootea.presentation.ConsoleIO;
import apicbiz.bobabootea.presentation.Controller;
import apicbiz.bobabootea.presentation.ItemController;
import apicbiz.bobabootea.presentation.View;

public class App {
    public static void main(String [] args) {
        ConsoleIO io = new ConsoleIO();
        View view = new View(io);

        String filepath = "./data/menuItems/menuItems.csv";
        ItemFileRepository repository = new ItemFileRepository(filepath);

        ItemService service = new ItemService(repository);
        ItemController itemController = new ItemController(service, view);
        Controller controller = new Controller(itemController, view);

        controller.run();
    }
}
