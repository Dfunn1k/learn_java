package ejercicio6;

import java.util.ArrayList;

public class Library {
    private ArrayList<LibraryItem> libraryItems;
    private ArrayList<LibraryUser> libraryUsers;

    public Library(ArrayList<LibraryItem> libraryItems, ArrayList<LibraryUser> libraryUser) {
        this.libraryItems = libraryItems;
        this.libraryUsers = libraryUser;
    }

    public void addItem(LibraryItem libraryItem) {
        // no se aceptan repeticiones
        // verificar si existe algun elemento repetido
        boolean isFound = verifyId(libraryItem.itemId);

        if (isFound) {
            System.out.println("El item ya existe");
            return;
        }
        libraryItems.add(libraryItem);
        System.out.println("Item agregado correctamente");
    }

    public void loanItem(int idUsuario, int idItem) {
        LibraryUser libraryUser = findUsuarioById(idUsuario);
        LibraryItem libraryItem = findItemById(idItem);
        if(libraryItem == null || libraryUser == null) {
            System.out.println("No existe usuario o item");
        } else {
            libraryUser.getLoanedItems().add(libraryItem);
            libraryItem.setLoaned(true);
        }
    }

    private boolean verifyId(int idNewItem) {
        for(LibraryItem item: libraryItems) {
            if (idNewItem == item.itemId) {
                return true;
            }
        }
        return false;
    }
    private LibraryUser findUsuarioById(int idUsuario) {

        for (LibraryUser libraryUser: libraryUsers) {
            if (idUsuario == libraryUser.getUserId()) {
                return libraryUser;
            }
        }
        return null;
    }
    private LibraryItem findItemById(int idItem) {
        for (LibraryItem libraryItem: libraryItems) {
            if (idItem == libraryItem.itemId) {
                return libraryItem;
            }
        }
        return null;
    }
}
