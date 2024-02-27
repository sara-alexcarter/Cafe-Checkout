package apicbiz.bobabootea;

import apicbiz.bobabootea.data.ItemFileRepository;
import apicbiz.bobabootea.data.ItemJDBCTemplateRepository;
import apicbiz.bobabootea.domain.ItemService;
import apicbiz.bobabootea.presentation.ConsoleIO;
import apicbiz.bobabootea.presentation.Controller;
import apicbiz.bobabootea.presentation.ItemController;
import apicbiz.bobabootea.presentation.View;
import org.springframework.jdbc.core.JdbcTemplate;

public class App {
    public static void main(String [] args) {
        ConsoleIO io = new ConsoleIO();
        View view = new View(io);

//        String filepath = "./data/menuItems/menuItems.csv";
//        ItemFileRepository repository = new ItemFileRepository(filepath);

        JdbcTemplate jdbcTemplate = DataHelper.getJdbcTemplate();
        ItemJDBCTemplateRepository repository = new ItemJDBCTemplateRepository(jdbcTemplate);

        ItemService service = new ItemService(repository);
        ItemController itemController = new ItemController(service, view);
        Controller controller = new Controller(itemController, view);

        controller.run();
    }
}
