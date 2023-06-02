import java.util.Scanner;
public class TodoInterface {
    private String username;
    private String createTodos;

    Scanner input = new Scanner(System.in);
    TodoFeatures features = new TodoFeatures();

    public void todo(){
        System.out.println("ORANGE");
        System.out.println("Welcome, Enter your first name");
        features.setUserName(username);
        System.out.println("Welcome "+features.getUsersName()+", Click on enter to continue");
        input.nextLine();
        System.out.println("Press tab and enter to save todos after you have written them");
        features.setTodoList(createTodos);
        features.createTextFileForTodos();
    }
}
