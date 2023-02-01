import controllers.UserController;
import model.*;
import utils.Validate;
import views.ViewUser;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("users.txt");
        Repository repository = new RepositoryFile(fileOperation);
        Validate validate = new Validate();
        UserController controller = new UserController(repository,validate);
        ViewUser view = new ViewUser(controller, validate);
        view.run();
    }
}