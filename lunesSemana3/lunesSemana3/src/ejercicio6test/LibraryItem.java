package ejercicio6test;

public class LibraryItem {
    protected String title;
    protected int itemId;
    protected boolean isLoaned;

    public LibraryItem(String title, int itemId, boolean isLoaned) {
        this.title = title;
        this.itemId = itemId;
        this.isLoaned = isLoaned;
    }

    public LibraryItem(String title, int itemId) {
        this.title = title;
        this.itemId = itemId;
        this.isLoaned = false;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public boolean getLoaned() {
        return isLoaned;
    }

    public void setLoaned(boolean loaned) {
        isLoaned = loaned;
    }

    public void showDetails() {
        System.out.printf("* Title: %s\n", title);
        System.out.printf("* Id: %s\n", itemId);
        System.out.printf("* Available: %s\n", !isLoaned);
    }
}
