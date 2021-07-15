package by.training.task04.view;

import by.training.task04.controller.Controller;

import java.util.Locale;
import java.util.Scanner;

public class CommandRequesterImpl implements CommandRequester{
    private Scanner in = new Scanner(System.in);
    private Controller controller = new Controller();
    private ResourceManager res = ResourceManager.INSTANCE;
    @Override
    public void requestInput(){
        String request = null;
        System.out.println(res.getString("message.requestInput"));
        request = in.nextLine();
        controller.executeTask(request);
    }

    @Override
    public void changeLanguage(){
        String language = "EN";
        String country = "US";
        System.out.println(res.getString("message.language"));
        language = in.nextLine();
        switch (language){
            case "BE":
                country = "BY";
                break;
            case "RU":
                country = "RU";
                break;
        }
        Locale lang = new Locale(language, country);
        res.changeResource(lang);
    }

    @Override
    public void printError(){
        System.out.println("Something went wrong");
    }

    @Override
    public void printError(String str){
        System.out.println(str);
    }

    @Override
    public void printHelp() {
        System.out.println(res.getString("message.help"));
        System.out.println("change_language \n" +
                        "help \n" +
                        "load_clients <fileName> \n" +
                        "get_client <clientId> \n" +
                        "generate_clients <fileName> <num of clients> \n" +
                        "money_debt \n" +
                        "available_money \n" +
                        "full_money \n"
                );
    }
}
