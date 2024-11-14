package ejercicio6test;

import java.util.ArrayList;

public class LibraryUser {
    private String username;
    private int userId;
    private ArrayList<LibraryItem> loanedItems;

    public LibraryUser(String username, int userId, ArrayList<LibraryItem> loanedItems) {
        this.username = username;
        this.userId = userId;
        this.loanedItems = loanedItems;
    }

    public LibraryUser(String username, int userId) {
        this.username = username;
        this.userId = userId;
        this.loanedItems = new ArrayList<LibraryItem>();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public ArrayList<LibraryItem> getLoanedItems() {
        return loanedItems;
    }

    public void setLoanedItems(ArrayList<LibraryItem> loanedItems) {
        this.loanedItems = loanedItems;
    }

    public void loanItem(LibraryItem item) {
        loanedItems.add(item);
    }

    public void showUserDetails() {
        System.out.printf("* Username: %s", username);
        System.out.printf("* Id: %s", userId);
        System.out.printf("* Items: %s", loanedItems);
    }
}
