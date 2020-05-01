public class Animal {
    private String name;
    private int age;
    private int noLegs;


    public Animal() {
        name = "happy";
        age = 1;
        noLegs =4;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        this.noLegs = 4;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNoLegs() {
        return noLegs;
    }

    public void setNoLegs(int noLegs) {
            this.noLegs = noLegs;
    }

    public String speak() {
        return "unknown";
    }
}
