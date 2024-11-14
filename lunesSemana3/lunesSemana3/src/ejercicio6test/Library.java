package ejercicio6test;

import java.util.ArrayList;

public class Library {
    private ArrayList<LibraryItem> libraryItems;
    private ArrayList<LibraryUser> libraryUsers;

    public Library(ArrayList<LibraryItem> libraryItems, ArrayList<LibraryUser> libraryUsers) {
        this.libraryItems = libraryItems;
        this.libraryUsers = libraryUsers;
    }

    public Library() {
        this.libraryItems = new ArrayList<LibraryItem>();
        this.libraryUsers = new ArrayList<LibraryUser>();
    }

    public void addItem(LibraryItem libraryItem){
        if (verifyId(libraryItem.getItemId()))
            libraryItems.add(libraryItem);
        else
            System.out.println("El item ya existe");
    }

    public void addUser(LibraryUser newUser) {
        libraryUsers.add(newUser);
    }

    public void showAllItems() {
        for (LibraryItem item: libraryItems)
            item.showDetails();
    }

    public void loanItem(int itemId, int userId) {
        LibraryItem item = findItemById(itemId);
        LibraryUser user = findUserById(userId);

        if (item == null || user == null)
            System.out.println("El item o el usuario no existe");
        else {
            item.setLoaned(true);
            user.getLoanedItems().add(item);
        }
    }

    public void returnItem(int itemId, int userId) {
        LibraryItem item = findItemById(itemId);
        LibraryUser user = findUserById(userId);
        if (item == null || user == null)
            System.out.println("El item o el usuario no existe");
        else {
            item.setLoaned(false);
            user.getLoanedItems().remove(item);
        }
    }

    public LibraryUser findUserById(int userId) {
        for (LibraryUser user: libraryUsers) {
            if (user.getUserId() == userId)
                return user;
        }
        return null;
    }

    public LibraryItem findItemById(int itemId) {
        for (LibraryItem item: libraryItems) {
            if (item.getItemId() == itemId)
                return item;
        }
        return null;
    }

    public boolean verifyId(int itemId) {
        for (LibraryItem item: libraryItems){
            if (item.getItemId() == itemId)
                return false;
        }
        return true;
    }
}
