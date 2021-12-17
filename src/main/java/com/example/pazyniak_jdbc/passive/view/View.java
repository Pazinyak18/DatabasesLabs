package com.example.pazyniak_jdbc.passive.view;


import com.example.pazyniak_jdbc.passive.controller.Controller;
import com.example.pazyniak_jdbc.passive.controller.impl.*;
import com.example.pazyniak_jdbc.passive.model.entities.*;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class View {
    private static final String KEY_EXIT = "Q";

    private static final String ERROR_NO_SUCH_OPTION = "No such option found. Try again.";

    private static final String TEXT_SELECT_MENU_OPTION = "Please choose menu option: ";
    private static final String TEXT_GO_BACK = "Go back or quit";

    private static Scanner input = new Scanner(System.in, "UTF-8");

    public View() {
    }

    public void show() {
        showTablesMenu();
    }

    private void showTablesMenu() {
        Map<String, String> tablesMenu = generateTablesMenu();
        Map<String, Printable> tablesMenuMethods = generateTablesMenuMethods();
        showMenuFromMaps(tablesMenu, tablesMenuMethods);
    }

    private Map<String, String> generateTablesMenu() {
        Map<String, String> tablesMenu = new LinkedHashMap<>();
        tablesMenu.put("1", "Table: Actor");
        tablesMenu.put("2", "Table: Album Actor");
        tablesMenu.put("3", "Table: Comments");
        tablesMenu.put("4", "Table: Facts");
        tablesMenu.put("5", "Table: Film");
        tablesMenu.put("6", "Table: User");
        return tablesMenu;
    }

    private Map<String, Printable> generateTablesMenuMethods() {
        Map<String, Printable> tableMenuMethods = new LinkedHashMap<>();
        tableMenuMethods.put("1", this::showActorMenu);
        tableMenuMethods.put("2", this::showAlbumActorMenu);
        tableMenuMethods.put("3", this::showCommentsMenu);
        tableMenuMethods.put("4", this::showFactsMenu);
        tableMenuMethods.put("5", this::showFilmMenu);
        tableMenuMethods.put("6", this::showUserMenu);


        return tableMenuMethods;
    }

    private void showActorMenu() {
        Map<String, String> menu = generateActorMenu();
        Map<String, Printable> menuMethods = generateActorMenuMethods();
        showMenuFromMaps(menu, menuMethods);
    }



    private Map<String, String> generateActorMenu() {
        Map<String, String> menu = new LinkedHashMap<>();
        menu.put("1", "Select all actors");
        menu.put("2", "Select actor");
        menu.put("3", "Create actor");
        menu.put("4", "Update actor");
        menu.put("5", "Delete actor");
        return menu;
    }



    private Map<String, Printable> generateActorMenuMethods() {
        Controller<Actor, Integer> actorController = new ActorController();
        Formatter<Actor, Integer> formatter = new Formatter<>(Actor.class);
        ViewOperations<Actor, Integer> actorOperations = new ViewOperations<>(actorController, formatter,
                Actor.class);

        Map<String, Printable> menuMethods = new LinkedHashMap<>();
        menuMethods.put("1", actorOperations::findAll);
        menuMethods.put("2", actorOperations::findById);
        menuMethods.put("3", actorOperations::create);
        menuMethods.put("4", actorOperations::update);
        menuMethods.put("5", actorOperations::delete);
        return menuMethods;
    }

    private void showAlbumActorMenu() {
        Map<String, String> menu = generateAlbumActorMenu();
        Map<String, Printable> menuMethods = generateAlbumActorMenuMethods();
        showMenuFromMaps(menu, menuMethods);
    }
    private Map<String, String> generateAlbumActorMenu() {
        Map<String, String> menu = new LinkedHashMap<>();
        menu.put("1", "Select all album actors");
        menu.put("2", "Select album actor");
        menu.put("3", "Create album actor");
        menu.put("4", "Update album actor");
        menu.put("5", "Delete album actor");
        return menu;
    }
    private Map<String, Printable> generateAlbumActorMenuMethods() {
        Controller<AlbumActor, Integer> albumActorController = new AlbumActorController();
        Formatter<AlbumActor, Integer> formatter = new Formatter<>(AlbumActor.class);
        ViewOperations<AlbumActor, Integer> albumActorOperations = new ViewOperations<>(albumActorController, formatter,
                AlbumActor.class);

        Map<String, Printable> menuMethods = new LinkedHashMap<>();
        menuMethods.put("1", albumActorOperations::findAll);
        menuMethods.put("2", albumActorOperations::findById);
        menuMethods.put("3", albumActorOperations::create);
        menuMethods.put("4", albumActorOperations::update);
        menuMethods.put("5", albumActorOperations::delete);
        return menuMethods;
    }
    private void showCommentsMenu() {
        Map<String, String> menu = generateCommentsMenu();
        Map<String, Printable> menuMethods = generateCommentsMenuMethods();
        showMenuFromMaps(menu, menuMethods);
    }
    private Map<String, String> generateCommentsMenu() {
        Map<String, String> menu = new LinkedHashMap<>();
        menu.put("1", "Select all comments");
        menu.put("2", "Select  comment");
        menu.put("3", "Create  comment");
        menu.put("4", "Update  comment");
        menu.put("5", "Delete  comment");
        return menu;
    }
    private Map<String, Printable> generateCommentsMenuMethods() {
        Controller<Comments, Integer> commentsController = new CommentsController();
        Formatter<Comments, Integer> formatter = new Formatter<>(Comments.class);
        ViewOperations<Comments, Integer> commentsOperations = new ViewOperations<>(commentsController, formatter,
                Comments.class);

        Map<String, Printable> menuMethods = new LinkedHashMap<>();
        menuMethods.put("1", commentsOperations::findAll);
        menuMethods.put("2", commentsOperations::findById);
        menuMethods.put("3", commentsOperations::create);
        menuMethods.put("4", commentsOperations::update);
        menuMethods.put("5", commentsOperations::delete);
        return menuMethods;
    }
    private void showFactsMenu() {
        Map<String, String> menu = generateFactsMenu();
        Map<String, Printable> menuMethods = generateFactsMenuMethods();
        showMenuFromMaps(menu, menuMethods);
    }
    private Map<String, String> generateFactsMenu() {
        Map<String, String> menu = new LinkedHashMap<>();
        menu.put("1", "Select all facts");
        menu.put("2", "Select  fact");
        menu.put("3", "Create  fact");
        menu.put("4", "Update  fact");
        menu.put("5", "Delete  fact");
        return menu;
    }
    private Map<String, Printable> generateFactsMenuMethods() {
        Controller<Facts, Integer> factsController = new FactsController();
        Formatter<Facts, Integer> formatter = new Formatter<>(Facts.class);
        ViewOperations<Facts, Integer> factsOperations = new ViewOperations<>(factsController, formatter,
                Facts.class);

        Map<String, Printable> menuMethods = new LinkedHashMap<>();
        menuMethods.put("1", factsOperations::findAll);
        menuMethods.put("2", factsOperations::findById);
        menuMethods.put("3", factsOperations::create);
        menuMethods.put("4", factsOperations::update);
        menuMethods.put("5", factsOperations::delete);
        return menuMethods;
    }
    private void showFilmMenu() {
        Map<String, String> menu = generateFilmMenu();
        Map<String, Printable> menuMethods = generateFilmMenuMethods();
        showMenuFromMaps(menu, menuMethods);
    }



    private Map<String, String> generateFilmMenu() {
        Map<String, String> menu = new LinkedHashMap<>();
        menu.put("1", "Select all films");
        menu.put("2", "Select film");
        menu.put("3", "Create film");
        menu.put("4", "Update film");
        menu.put("5", "Delete film");
        return menu;
    }



    private Map<String, Printable> generateFilmMenuMethods() {
        Controller<Film, Integer> filmController = new FilmController();
        Formatter<Film, Integer> formatter = new Formatter<>(Film.class);
        ViewOperations<Film, Integer> filmOperations = new ViewOperations<>(filmController, formatter,
                Film.class);

        Map<String, Printable> menuMethods = new LinkedHashMap<>();
        menuMethods.put("1", filmOperations::findAll);
        menuMethods.put("2", filmOperations::findById);
        menuMethods.put("3", filmOperations::create);
        menuMethods.put("4", filmOperations::update);
        menuMethods.put("5", filmOperations::delete);
        return menuMethods;
    }
    private void showUserMenu() {
        Map<String, String> menu = generateUserMenu();
        Map<String, Printable> menuMethods = generateUserMenuMethods();
        showMenuFromMaps(menu, menuMethods);
    }



    private Map<String, String> generateUserMenu() {
        Map<String, String> menu = new LinkedHashMap<>();
        menu.put("1", "Select all users");
        menu.put("2", "Select user");
        menu.put("3", "Create user");
        menu.put("4", "Update user");
        menu.put("5", "Delete user");
        return menu;
    }



    private Map<String, Printable> generateUserMenuMethods() {
        Controller<User, Integer> userController = new UserController();
        Formatter<User, Integer> formatter = new Formatter<>(User.class);
        ViewOperations<User, Integer> userOperations = new ViewOperations<>(userController, formatter,
                User.class);

        Map<String, Printable> menuMethods = new LinkedHashMap<>();
        menuMethods.put("1", userOperations::findAll);
        menuMethods.put("2", userOperations::findById);
        menuMethods.put("3", userOperations::create);
        menuMethods.put("4", userOperations::update);
        menuMethods.put("5", userOperations::delete);
        return menuMethods;
    }


    private void showMenuFromMaps(Map<String, String> keyName, Map<String, Printable> keyMethod) {
        String keyMenu;
        do {
            printMenu(keyName);
            System.out.println(TEXT_SELECT_MENU_OPTION);
            keyMenu = input.nextLine().toUpperCase();
            Printable method = keyMethod.get(keyMenu);
            if (method != null) {
                method.print();
            } else if (!keyMenu.equals(KEY_EXIT)) {
                System.out.println(ERROR_NO_SUCH_OPTION);
            }
        } while (!keyMenu.equals(KEY_EXIT));
    }

    private void printMenu(Map<String, String> keyName) {
        for (String key : keyName.keySet()) {
            System.out.format("%3s - %s%n", key, keyName.get(key));
        }
        System.out.format("%3s - %s%n", KEY_EXIT, TEXT_GO_BACK);
    }
}
