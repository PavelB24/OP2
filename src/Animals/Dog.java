package Animals;

import java.io.IOException;

public class Dog extends Animal {
    private int counter;

    public Dog(int age, String name) {
        super(age, name);
        counter++;
    }

    @Override
    public void swim(int meters) {

        if (meters <= 10) {
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
        if (meters <= 500) {
            System.out.println("Собака " + this.name + " пробежала " + meters + " метров");
        } else {
            System.out.println("Собака не может столько пробежать!");
        }
    }
}


