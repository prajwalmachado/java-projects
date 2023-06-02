import java.util.Scanner;
import textio.TextIO;// these imports are for read and write
public class TodoFeatures {
    private String usersName;
    private String todoList;
    private boolean continueInApp;

    Scanner input = new Scanner(System.in);

    public void setUserName(String usersName){
        usersName = input.next();
        this.usersName = usersName;
    }

    public String getUsersName() {
        return this.usersName;
    }
    public void setTodoList(String todoList){
        input.useDelimiter("\\t");
        while(true){
            todoList = input.next();
            break;
        }
        this.todoList = todoList;
    }
    public void createTextFileForTodos(){
        TextIO.writeFile("Todos.txt");
        TextIO.putln(this.todoList);
    }
}
