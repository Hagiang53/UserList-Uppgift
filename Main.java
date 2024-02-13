
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Skapa en UserList för att hantera användare.
        UserList userList = new UserList();

        // Lägg till några användare.

        userList.addUser(new User(1, "", ""));
        userList.addUser(new User(2, "", ""));
        userList.addUser(new User(3, "", ""));

        // Skriv ut alla användare.
        System.out.println("All Users:");
        userList.printUsers();

        // Testa att söka efter en användare baserat på id.
        int userIdToSearch = 2;
        User searchedUser = userList.searchUserById(userIdToSearch);
        if (searchedUser != null) {
            System.out.println("Searched User: ID: " + searchedUser.getId() + ", Name: " + searchedUser.getName() + ", Email: " + searchedUser.getEmail());
        } else {
            System.out.println("User not found.");
        }

        // Sortera användare efter namn och skriv ut igen.
        userList.sortUsersByName();
        System.out.println("\nUsers Sorted by Name:");
        userList.printUsers();

        // Ta bort en användare baserat på id.
        int userIdToRemove = 1;
        userList.removeUser(userIdToRemove);
        System.out.println("\nUsers after removing User with ID " + userIdToRemove + ":");
        userList.printUsers();
    }
}

