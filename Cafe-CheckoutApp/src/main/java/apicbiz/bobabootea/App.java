package apicbiz.bobabootea;

import apicbiz.bobabootea.presentation.ConsoleIO;
import apicbiz.bobabootea.presentation.Controller;
import apicbiz.bobabootea.presentation.ItemController;
import apicbiz.bobabootea.presentation.View;

public class App {
    public static void main(String [] args) {
        ConsoleIO io = new ConsoleIO();
        View view = new View(io);

        ItemController itemController = new ItemController();

        Controller controller = new Controller(itemController, view);

        controller.run();
    }
}
