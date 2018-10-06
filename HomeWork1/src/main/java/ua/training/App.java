package ua.training;

public class App
{
    public static void main( String[] args )
    {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        // Run
        controller.processUser();
    }
}
