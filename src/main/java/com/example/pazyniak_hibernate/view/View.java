package com.example.pazyniak_hibernate.view;

import com.example.pazyniak_hibernate.controller.impl.*;
import com.example.pazyniak_hibernate.model.entity.*;

import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class View {
    private static final Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);
    private final ActorController actorController;
    private final CommentController commentController;
    private final FactController factController;
    private final FilmController filmController;
    private final UserController userController;

    private final Map<String, Printable> menu = new LinkedHashMap<>();

    public View(){
        actorController = new ActorController();
        commentController = new CommentController();
        factController = new FactController();
        filmController = new FilmController();
        userController = new UserController();

        menu.put("11", this::getAllActors);
        menu.put("12", this::getActorById);
        menu.put("13", this::createActor);
        menu.put("14", this::updateActor);
        menu.put("15", this::deleteActor);

        menu.put("21", this::getAllComments);
        menu.put("22", this::getCommentById);
        menu.put("23", this::createComment);
        menu.put("24", this::updateComment);
        menu.put("25", this ::deleteComment);

        menu.put("31", this::getAllFacts);
        menu.put("32", this::getFactById);
        menu.put("33", this::createFact);
        menu.put("34", this::updateFact);
        menu.put("35", this::deleteFact);

        menu.put("41", this::getAllFilms);
        menu.put("42", this::getFilmById);
        menu.put("43", this::createFilm);
        menu.put("44", this::updateFilm);
        menu.put("45", this::deleteFilm);

        menu.put("51", this::getAllUsers);
        menu.put("52", this::getUserById);
        menu.put("53", this::createUser);
        menu.put("54", this::updateUser);
        menu.put("55", this::deleteUser);

    }
    public void displayMenu() {
        System.out.println("=======================================================================");
        System.out.println("                 Enter XY to choose the option, where:");
        System.out.println("=======================================================================");
        System.out.println("X - entity number:                 |       Y - CRUD number:");
        System.out.println("  1 - actor                        |         1 - GET ALL");
        System.out.println("  2 - comment                      |         2 - GET BY ID");
        System.out.println("  4 - fact                         |         3 - CREATE");
        System.out.println("  5 - film                         |         5 - UPDATE");
        System.out.println("  6 - user                         |         6 - DELETE");
        System.out.println("=======================================================================");
    }
    // --- CITIES ---
    private void getAllActors(){
        System.out.print("\n[ACTORS / GET]");
        System.out.println(actorController.findAll() + "\n");
    }
    private void getActorById(){
        System.out.println("\n [ACTOR / GET] Enter ID: ");
        Integer id = scanner.nextInt();
        System.out.println(actorController.findOne(id) + "\n");
    }
    private Actor getActorInputs(){
        System.out.println("Enter first name : ");
        String firstName = scanner.next();
        System.out.println("Enter second name : ");
        String secondName = scanner.next();
        System.out.println("Enter rating : ");
        Integer rating = scanner.nextInt();
        return new Actor(0, firstName, secondName, rating);
    }
    private void createActor(){
        System.out.println("\n[ACTOR / CREATE]");
        Actor actor = getActorInputs();
        actorController.create(actor);
        System.out.println("successfully created\n");
    }
    private void updateActor(){
        System.out.println("\n[ACTOR / UPDATE] Enter ID: ");
        Integer id = scanner.nextInt();
        Actor actor = getActorInputs();
        actor.setId(id);
        actorController.update(actor.getId(), actor);

        System.out.println("Actor with ID=" + id + " successfully updated");
    }
    private void deleteActor(){
        System.out.println("[ACTOR / DELETE] Enter ID: ");
        int id = scanner.nextInt();

        actorController.delete(id);
        System.out.println("Actor with ID=" + id + " successfully deleted");
    }
    // --- COUNTRIES ---

    //  --- GUIDE ---
    private void getAllComments(){
        System.out.println("\n[COMMENT / GET]");
        System.out.println(commentController.findAll() + "\n");
    }
    private void getCommentById(){
        System.out.println("\n [GUIDE / GET] Enter ID: ");
        Integer id = scanner.nextInt();
        System.out.println(commentController.findOne(id) + "\n");
    }
    private Comment getCommentInputs(){
        System.out.println("\n Enter film ID: ");
        Integer filmId = scanner.nextInt();
        Film film = filmController.findOne(filmId);
        System.out.println("\n Enter user ID: ");
        Integer userId = scanner.nextInt();
        User user = userController.findOne(userId);
        System.out.println("\n Enter rating : ");
        Integer rating = scanner.nextInt();
        System.out.println("\n Enter text : ");
        String text = scanner.next();

        return new Comment(0, film, user, rating, text);
    }
    private void createComment(){
        System.out.println("\n[COMMENT / CREATE]");
        Comment comment = getCommentInputs();
        commentController.create(comment);
        System.out.println("Comment successfully created\n");
    }
    private void updateComment(){
        System.out.println("\n[COMMENT / UPDATE] Enter ID: ");
        Integer id = scanner.nextInt();
        Comment comment = getCommentInputs();
        comment.setId(id);
        commentController.update(comment.getId(), comment);

        System.out.println("Comment with ID=" + id + " successfully updated");
    }
    private void deleteComment(){
        System.out.println("[COMMENT / DELETE] Enter ID: ");
        int id = scanner.nextInt();
        commentController.delete(id);
        System.out.println("Comment with ID=" + id + " successfully deleted");
    }
    // --- HOTEL ---
    private void getAllFacts(){
        System.out.println("\n[FACTS / GET]");
        System.out.println(factController.findAll() + "\n");
    }
    private void getFactById(){
        System.out.println("\n [FACT / GET] Enter ID: ");
        Integer id = scanner.nextInt();
        System.out.println(factController.findOne(id) + "\n");
    }

    private Fact getFactInputs(){
        System.out.println("\n Enter user ID: ");
        Integer userId = scanner.nextInt();
        User user = userController.findOne(userId);
        System.out.println("\n Enter fact text: ");
        String text = scanner.next();

        return new Fact(0, user, text);
    }
    private void createFact(){
        System.out.println("\n[HOTEL / CREATE]");
        Fact fact = getFactInputs();
        factController.create(fact);
        System.out.println("Fact successfully created\n");
    }
    private void updateFact(){
        System.out.println("\n[FACT / UPDATE] Enter ID: ");
        Integer id = scanner.nextInt();
        Fact fact = getFactInputs();
        fact.setId(id);
        factController.update(fact.getId(), fact);

        System.out.println("Fact with ID=" + id + " successfully updated");
    }
    private void deleteFact(){
        System.out.println("[FACT / DELETE] Enter ID: ");
        int id = scanner.nextInt();
        factController.delete(id);
        System.out.println("Fact with ID=" + id + " successfully deleted");
    }
    // --- PAYMENT TYPE ---
    private void getAllFilms(){
        System.out.println("\n[ FILMS / GET]");
        System.out.println(filmController.findAll() + "\n");
    }
    private void getFilmById(){
        System.out.println("\n [FILMS/ GET] Enter ID: ");
        Integer id = scanner.nextInt();
        System.out.println(filmController.findOne(id) + "\n");
    }
    private Film getFilmInputs(){
        System.out.println("\n Enter name : ");
        String name = scanner.next();
        System.out.println("\n Enter description : ");
        String description = scanner.next();

        return new Film(0, name, description);
    }
    private void createFilm(){
        System.out.println("\n[ FILMS / CREATE]");
        Film film = getFilmInputs();
        filmController.create(film);
        System.out.println("Film successfully created\n");
    }
    private void updateFilm(){
        System.out.println("\n[FILMS / UPDATE] Enter ID: ");
        Integer id = scanner.nextInt();
        Film film = getFilmInputs();
        film.setId(id);
        filmController.update(film.getId(), film);

        System.out.println("Film with ID=" + id + " successfully updated");
    }
    private void deleteFilm(){
        System.out.println("[ FILMS / DELETE] Enter ID: ");
        int id = scanner.nextInt();
        filmController.delete(id);
        System.out.println("Film with ID=" + id + " successfully deleted");
    }

    // --- Place ---
    private void getAllUsers(){
        System.out.println("\n[USERS / GET]");
        System.out.println(userController.findAll() + "\n");
    }
    private void getUserById(){
        System.out.println("\n [USER / GET] Enter ID: ");
        Integer id = scanner.nextInt();
        System.out.println(userController.findOne(id) + "\n");
    }
    private User getUserInputs(){
        System.out.println("\n Enter name : ");
        String name = scanner.next();
        System.out.println("\n Enter email : ");
        String email = scanner.next();
        return new User(0, name, email);
    }
    private void createUser(){
        System.out.println("\n[USER / CREATE]");
        User user = getUserInputs();
        userController.create(user);
        System.out.println("User successfully created\n");
    }
    private void updateUser(){
        System.out.println("\n[ USER / UPDATE] Enter ID: ");
        Integer id = scanner.nextInt();
        User user = getUserInputs();
        user.setId(id);
        userController.update(user.getId(), user);

        System.out.println("User with ID=" + id + " successfully updated");
    }
    private void deleteUser(){
        System.out.println("[USER / DELETE] Enter ID: ");
        int id = scanner.nextInt();
        userController.delete(id);
        System.out.println("User with ID=" + id + " successfully deleted");
    }


    public final void show() {
        String input;
        displayMenu();
        System.out.println("\nChoose your fighter:\n");
        do {
            try {
                input = scanner.next();
                menu.get(input).print();
            } catch (Exception ignored) {
            }
        } while (scanner.hasNext());
    }
}