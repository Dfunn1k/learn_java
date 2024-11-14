package ejercicio6test;

public class DVD extends LibraryItem{
    private String director;
    private int duration;

    public DVD(String title, int itemId, String director, int duration) {
        super(title, itemId);
        this.director = director;
        this.duration = duration;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.printf("* Director: %s\n", director);
        System.out.printf("* Duration(m): %s\n", duration);
    }
}
