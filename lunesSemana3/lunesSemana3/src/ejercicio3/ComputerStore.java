package ejercicio3;

import ejercicio2.Computer;

import java.util.ArrayList;
import java.util.Scanner;

public class ComputerStore {
    private ArrayList<Computer> computers = new ArrayList<>();
    private String name;
    private String address;
    private int quantity;

    public ComputerStore(String name, String address, int quantity) {
        this.name = name;
        this.address = address;
        this.quantity = quantity;
    }

    public void showInfo(){
        System.out.printf("¡Bienvenidos a %s store!", name);
        System.out.printf("Ubicada en %s", address);
        System.out.printf("La tienda cuenta con %s computadoras", computers.size());
    }

    public void addComputer(Computer computer){
        computers.add(computer);
    }

    public void sellComputer(){
        System.out.println("Estas son las computadoras que tenemos disponibles para ti:");
        System.out.println("Elige una opción para comprar");
        Scanner input = new Scanner(System.in);
        System.out.println("*****");
        for (int i = 0; i < computers.size(); i++){
            System.out.printf("%s: %s", i + 1, computers.get(i).showInfo());
            System.out.println("*****");
        }
        int option = input.nextInt();
        computers.remove(option - 1);
        System.out.println("¡Computadora vendida!");
    }

    public int getQuantity(){
        return quantity;
    }

    public int countComputer() {
        return computers.size();
    }


}
