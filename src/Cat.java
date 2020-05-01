public class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    public Cat(String name, int age, int noLegs) {
        super(name, age);
        super.setNoLegs(noLegs);
    }

    public String speak() {
        return "meow";
    }
}
