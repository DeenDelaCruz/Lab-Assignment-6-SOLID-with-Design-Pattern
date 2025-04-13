public class Capstone implements Resource {
    private String title;

    public Capstone(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return "Capstone";
    }
}