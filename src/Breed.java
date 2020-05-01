public class Breed extends Dog{
    private String kind;

    public Breed() {
        this.kind = "Boxer";
    }

    public Breed(String name, int age, String kind) {
        super(name, age);
        this.kind = kind;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
}
