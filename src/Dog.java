public class Dog extends Animal{
    public Dog() {
        super();
    }
    public Dog(String name, int age) {
        super(name, age);  //parent constructor
    }


    public String speak() {
        return "barks";
    }
}
