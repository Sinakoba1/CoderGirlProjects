package TryAgain;
import java.util.Scanner;
import java.util.ArrayList;

public class BlogApp {
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        String numberMenu;
        String chosenPost;
        String currentUser = "Pug";

        ArrayList <User> users = new ArrayList <User>();
        User newUser = new User("Wonder_Woman", "Amy Pond","star_reka@msn.com", "http://www.thedoctorwhosite.co.uk/wp-images/doctorwho/characters/11-amy.jpg\n");
        users.add(newUser);
        newUser = new User("Hot_Mama", "River Song","galaxy_dancer@lunamail.com", "http://www.thedoctorwhosite.co.uk/wp-images/doctorwho/characters/10-river.jpg\n" );
        users.add(newUser);
        newUser = new User("Clever_Girl", "Clara Oswald","nova_rider@hotmail.com", "http://www.thedoctorwhosite.co.uk/wp-images/doctorwho/characters/11-clara.jpg");
        users.add(newUser);
        newUser = new User("She_Doctor", "Donna Noble","flygirlz@aol.com", "http://www.thedoctorwhosite.co.uk/wp-images/doctorwho/characters/10-donna.jpg\n");
        users.add(newUser);
        newUser = new User("Pug", "Bill Potts","bill.potts@yahoo.com", "http://www.thedoctorwhosite.co.uk/wp-content/uploads/companion-bill.jpg\n");
        users.add(newUser);

        ArrayList <Post> posts = new ArrayList <Post>();
        Post newPost = new Post("Hanging with my boys... Killing TIME!", "Wonder_Woman");
        posts.add(newPost);
        newPost = new Post("At ease solder... Come to Momma!", "She_Doctor");
        posts.add(newPost);
        newPost = new Post("Pink looks good on me though! Yum!", "Clever_Girl");
        posts.add(newPost);
        newPost = new Post("My Screw Driver I So cute, thanks Lover! Sorry Mum, Spoilers...", "Hot_Mama");
        posts.add(newPost);
        newPost = new Post("Day 65 and board out of my mind. Tell Fly Boy to come get me!", "Pug");
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
                String newUserName;
                String newRealName;
                String newUserEmail;
                String newAvatarPicURL;

                System.out.println("Enter new User Name:");
                newUserName = keyboard.nextLine();
                System.out.println("Enter new First and Last Name:");
                newRealName = keyboard.nextLine();
                System.out.println("Enter new Email:");
                newUserEmail = keyboard.nextLine();
                System.out.println("Enter new Web Address for Avatar Picture");
                newAvatarPicURL = keyboard.nextLine();
                newUser = new User(newUserName, newRealName, newUserEmail, newAvatarPicURL);
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
                String lastPost = "";
                if (posts.isEmpty()){
                    System.out.println("This User has no previous post");
                }
                for (int counter = (posts.size()-1); counter >= 0; counter--) {
                    if (posts.get(counter).getUserName()== currentUser){
                        lastPost = posts.get(counter).getPost();
                        System.out.println("Here is the last post:\n "+ lastPost + "\n");
                        break;
                    }
                    if (counter == 0){
                        System.out.println("This User has no previous post");
                    }
                }
                System.out.print("Please enter new Post:\n>");
                chosenPost = keyboard.nextLine();
                posts.add(new Post(chosenPost, currentUser));
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