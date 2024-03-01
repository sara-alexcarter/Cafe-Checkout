package apicbiz.bobabootea;

import apicbiz.bobabootea.data.ItemJDBCTemplateRepository;
import apicbiz.bobabootea.domain.ItemService;
import apicbiz.bobabootea.presentation.ConsoleIO;
import apicbiz.bobabootea.presentation.EntireMenuController;
import apicbiz.bobabootea.presentation.View;
import org.springframework.jdbc.core.JdbcTemplate;

public class App {
    public static void main(String [] args) {
        ConsoleIO io = new ConsoleIO();
        View view = new View(io);


        JdbcTemplate jdbcTemplate = DataHelper.getJdbcTemplate();
        ItemJDBCTemplateRepository repository = new ItemJDBCTemplateRepository(jdbcTemplate);

        ItemService service = new ItemService(repository);
        EntireMenuController entireMenuController = new EntireMenuController(service, view);

        entireMenuController.run();
    }
}
