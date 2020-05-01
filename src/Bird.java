public class Bird  extends Animal{
    private String feather;
    private boolean canFly;

    public Bird() {
    }

    public Bird(String name, int age) {
        super(name, age);
    }

    public Bird (String feather, boolean canFly) {
        this.feather = feather;
        this.canFly = canFly;
    }

    public Bird (String name, int age, String feather, boolean canFly) {
        super(name, age);
        this.feather = feather;
        this.canFly = canFly;

    }

    public String getFeather() {
        return feather;
    }

    public void setFeather(String feather) {
        this.feather = feather;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public String speak() {
        return "tweet";
    }


}
