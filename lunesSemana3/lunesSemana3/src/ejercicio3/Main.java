package ejercicio3;

import ejercicio2.Computer;

public class Main {
    public static void main(String[] args) {
        Computer computer1 = new Computer("ASUS", "FX-400", 4, 128);
        Computer computer2 = new Computer("HP", "FX-9000", 32, 512);
        Computer computer3 = new Computer("ASUS", "Predator-12000", 64, 1028);

        ComputerStore store = new ComputerStore("Dany's Store", "Av.Alfonso Ugarte 180", 21);
        store.addComputer(computer1);
        store.addComputer(computer2);
        store.addComputer(computer3);

        System.out.println(store.countComputer());
    }
}
