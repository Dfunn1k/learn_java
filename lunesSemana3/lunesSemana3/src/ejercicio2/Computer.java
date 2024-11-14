package ejercicio2;

public class Computer {
    private final String brand;
    private final String model;
    private int ram;
    private int storage;

    public Computer(String brand, String model, int ram, int storage) {
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.storage = storage;
    }

    public String showInfo() {
        return String.format("* Brand: %s\n* Model: %s\n* Ram: %s \n* Storage: %s", brand, model, ram, storage);
    }

    public String getBrand(){
        return brand;
    }

    public String getModel(){
        return model;
    }

    public int getRam(){
        return ram;
    }

    public void setRam(int ram){
        this.ram = ram;
    }

    public int getStorage(){
        return storage;
    }

    public void setStorage(int storage){
        this.storage = storage;
    }
}
