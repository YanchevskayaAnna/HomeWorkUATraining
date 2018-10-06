package ua.training;

import java.util.Scanner;


public class Controller {

    public static final String HELLO_WORLD = "Hello world!";
    // Constructor
    private Model model;
    private View view;


    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    // The Work method
    public void processUser(){
        Scanner sc = new Scanner(System.in);

         view.printMessage(inputStringValueWithScanner(sc));
    }

    // The Utility methods
    public String inputStringValueWithScanner(Scanner sc) {

        view.printMessage(View.INPUT_HELLO);
        String message = sc.next().toUpperCase();
        while(!message.equals(model.HELLO)) {
            view.printMessage(View.WRONG_INPUT_DATA);
            message = sc.next().toUpperCase();
        }
        view.printMessage(View.INPUT_WORLD);
        message = sc.next().toUpperCase();
        while(!message.equals(model.WORLD)) {
            view.printMessage(View.WRONG_INPUT_DATA);
            message = sc.next().toUpperCase();
        }
        return HELLO_WORLD;
    }
}
