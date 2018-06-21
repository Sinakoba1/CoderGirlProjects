package TryAgain;

import java.util.Scanner;
import java.util.ArrayList;

import static java.lang.System.out;

public class BlogApp {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        String numberMenu;

        String chosenPost;
        String currentUser = "Pug";

        ArrayList <User> users = new ArrayList <User>();
        User newUser = new User("Wonder_Woman");
        users.add(newUser);
        newUser = new User("Hot_Mama");
        users.add(newUser);
        newUser = new User("Clever_Girl");
        users.add(newUser);
        newUser = new User("She_Doctor");
        users.add(newUser);
        newUser = new User("Pug");
        users.add(newUser);

        ArrayList <Post> posts = new ArrayList <Post>();
        Post newPost = new Post("Hanging with my boys... Killing TIME!");
        posts.add(newPost);
        newPost = new Post("At ease solder... Come to Momma!");
        posts.add(newPost);
        newPost = new Post("Pink looks good on me though! Yum!");
        posts.add(newPost);
        newPost = new Post("My Screw Driver I So cute, thanks Lover! Sorry Mum, Spoilers...");
        posts.add(newPost);
        newPost = new Post("Day 65 and board out of my mind. Tell Fly Boy to come get me!");
        posts.add(newPost);

        while (true) {
            System.out.println("\nMain Menu");
            System.out.println("1) Create a new user");
            System.out.println("2) Become an existing user");
            System.out.println("3) Create a post as the current user");
            System.out.println("4) Print all posts");
            System.out.println("5) Print all users");
            System.out.print("\nYou are currently user " + currentUser +". What would you like to do?\n> ");
            numberMenu = keyboard.nextLine();

            if (numberMenu.equals("1")) {

                System.out.println("Enter new User information:");
                newUser = new User(keyboard.nextLine());
                users.add(newUser);
                System.out.println("\nHello " + newUser.getUserName() + "!");
                currentUser = newUser.getUserName();

            }

            if (numberMenu.equals("2")) {
                int chosenUser;
                System.out.println("Choose the number from the list of User Names:");
                for (int counter = 1; counter <= users.size(); counter++)
                {
                    System.out.println(counter + ") " + users.get(counter-1).getUserName());

                }
                System.out.print("> ");
                chosenUser = keyboard.nextInt();
                currentUser = users.get(chosenUser-1).getUserName();
                System.out.println("\nHi " + currentUser + "!");
                keyboard.skip("\n");

            }

            if (numberMenu.equals("3")) {
                Post lastPost = posts.get(posts.size() - 1);
                System.out.println("Here is the last post:\n "+ lastPost.getPost()+ "\n");
                System.out.print("Please enter new Post:\n>");
                chosenPost = keyboard.nextLine();
                posts.add(new Post(chosenPost));

            }

            if (numberMenu.equals("4")) {

                System.out.println("Here are all the Posts:\n");
                for (int counter = 0; counter < posts.size(); counter++)

                {
                    System.out.println(posts.get(counter).getPost());
                }

            }
            if (numberMenu.equals("5")) {
                System.out.println("Here is the list of User Names:\n");

                for (int counter = 0; counter < users.size(); counter++) {

                    System.out.println(users.get(counter).getUserName());
                }
            }

        }
    }
}