package Animals;

public abstract class Animal {
    protected int age;
    protected String name;

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public abstract void swim(int meters);

    public abstract void run(int meters);

}

