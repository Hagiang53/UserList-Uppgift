import java.util.ArrayList;
        import java.util.Collections;
        import java.util.Comparator;
        import java.util.List;

public class UserList {
    private List<User> users = new ArrayList<>();

    // Metod för att lägga till en användare.
    public void addUser(User user) {
        users.add(user);
    }

    // Metod för att ta bort en användare baserat på id.
    public void removeUser(int id) {
        users.removeIf(user -> user.getId() == id);
    }

    // Metod för att hämta en användare baserat på id.
    public User getUserById(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null; // Returnera null om användaren inte hittas.
    }

    // Implementera sökfunktion baserat på id.
    public User searchUserById(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null; // Returnera null om användaren inte hittas.
    }

    // Implementera sortering baserat på namn.
    public void sortUsersByName() {
        Collections.sort(users, Comparator.comparing(User::getName));
    }

    // Metod för att skriva ut alla användare i listan.
    public void printUsers() {
        for (User user : users) {
            System.out.println("ID: " + user.getId() + ", Name: " + user.getName() + ", Email: " + user.getEmail());
        }
    }
}

