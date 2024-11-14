package ejercicio2;

public class Main {
    public static void main(String[] args) {
        Computer computer1 = new Computer("ASUS", "FX-7800", 16, 580);
        System.out.println(computer1.showInfo());
        System.out.println("****************");
        System.out.println(computer1.getBrand());
        System.out.println(computer1.getModel());
        System.out.println("****************");
        System.out.println("Aumentando memoria RAM...");
        computer1.setRam(32);
        System.out.println("Aumentando almacenamiento...");
        computer1.setStorage(1024);
        System.out.println("****************");
        System.out.println(computer1.showInfo());
    }
}
