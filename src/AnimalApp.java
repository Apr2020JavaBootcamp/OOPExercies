import java.util.ArrayList;

public class AnimalApp {
    public static void main(String args[]) {
        Dog dog1 = new Dog();

        System.out.println("Dog1:");
        System.out.println("Name:" + dog1.getName());
        System.out.println("Age:" + dog1.getAge());
        System.out.println("No Legs:" + dog1.getNoLegs());
        System.out.println("Speaks: " + dog1.speak());

        Dog dog2 = new Dog("Fluffy", 3);

        System.out.println("\n------Dog2:");
        System.out.println("Name:" + dog2.getName());
        System.out.println("Age:" + dog2.getAge());
        System.out.println("No Legs:" + dog2.getNoLegs());
        System.out.println("Speaks: " + dog2.speak());

        Dog dog3 = new Dog();
        dog3.setAge(5);
        dog3.setName("Lady Bug");
        dog3.setNoLegs(3);
        System.out.println("\n------Dog3:");
        System.out.println("Name:" + dog3.getName());
        System.out.println("Age:" + dog3.getAge());
        System.out.println("No Legs:" + dog3.getNoLegs());
        System.out.println("Speaks: " + dog3.speak());


        Cat cat1 = new Cat("Hair Ball", 2, 1);
        System.out.println("\n------Cat1:");
        System.out.println("Name:" + cat1.getName());
        System.out.println("Age:" + cat1.getAge());
        System.out.println("No Legs:" + cat1.getNoLegs());
        System.out.println("Speaks: " + cat1.speak());

        Bird bird1 = new Bird("Tweetie", 5, "yellow", true);
        System.out.println("\n------Bird1:");
        System.out.println("Name:" + bird1.getName());
        System.out.println("Age:" + bird1.getAge());
        System.out.println("No Legs:" + bird1.getNoLegs());
        System.out.println("Speaks: " + bird1.speak());
        System.out.println("Feather: " + bird1.getFeather());
        System.out.println("CanFly: " + bird1.isCanFly());

        Breed dog4 = new Breed();

        System.out.println("\n------Dog4:");
        System.out.println("Name:" + dog4.getName());
        System.out.println("Age:" + dog4.getAge());
        System.out.println("No Legs:" + dog4.getNoLegs());
        System.out.println("Speaks: " + dog4.speak());
        System.out.println("Kind: " + dog4.getKind());

        dog4.setName("James");
        dog4.setAge(5);
        System.out.println("\n------");
        System.out.println("new Dog4:");
        System.out.println("Name:" + dog4.getName());
        System.out.println("Age:" + dog4.getAge());
        System.out.println("No Legs:" + dog4.getNoLegs());
        System.out.println("Speaks: " + dog4.speak());
        System.out.println("Kind: " + dog4.getKind());

        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);


        System.out.println("\nUsing Enhanced For Loop");
        int idx = 1;
        for (Dog oneDog : dogs) {
            System.out.println("\n****** Dog " + idx++);
            System.out.println("Name:" + oneDog.getName());
            System.out.println("Age:" + oneDog.getAge());
            System.out.println("No Legs:" + oneDog.getNoLegs());
            System.out.println("Speaks: " + oneDog.speak());
        }

        System.out.println("\nUsing For Loop");
        for (int i = 0; i < dogs.size(); i++) {
            System.out.println("\n****** Dog " + (i+1));
            Dog oneDog = dogs.get(i);
            System.out.println("Name:" + oneDog.getName());
            System.out.println("Age:" + oneDog.getAge());
            System.out.println("No Legs:" + oneDog.getNoLegs());
            System.out.println("Speaks: " + oneDog.speak());
        }


    }
}
