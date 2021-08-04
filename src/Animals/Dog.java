package Animals;

import java.io.IOException;

public class Dog extends Animal {
    private int counter;
    private int maxRun = 500;
    private int maxSwim = 10;


    public Dog(int age, String name) {
        super(age, name);
        counter++;
    }

    @Override
    public void swim(int meters) {

        if (meters <= maxSwim) {
            System.out.println("Собака " + getName() + " проплыла " + meters + " метров");
        } else {
            System.out.println("Собака не может столько проплыть!");
        }
    }

    public String getName() {
        return name;
    }

    public int getCounter() {
        return counter;
    }


    @Override
    public void run(int meters) {
        if (meters <= maxRun) {
            System.out.println("Собака " + this.name + " пробежала " + meters + " метров");
        } else {
            System.out.println("Собака не может столько пробежать!");
        }
    }
}


