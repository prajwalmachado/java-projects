import textio.TextIO;

public class App {
    public static void main(String[] args) {
        TodoInterface userInterface = new TodoInterface();
        boolean continueInApp;

        do{
            userInterface.todo();
            System.out.println("Do you want to continue in App (ENETR YES or NO)");
            continueInApp = TextIO.getlnBoolean();

        }while(continueInApp);

    }
}
